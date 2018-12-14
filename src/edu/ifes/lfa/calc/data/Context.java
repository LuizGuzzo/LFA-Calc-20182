package edu.ifes.lfa.calc.data;

import static java.lang.String.format;
import java.util.HashMap;
import java.util.Objects;
import java.util.Optional;


public class Context implements Show {

    private final HashMap<String, Expr> mapping;
    private final Optional<Context> parent;
    
    public Context(Optional<Context> parent) {
        this.parent = parent;
        this.mapping = new HashMap<>();
    }

    public Context() {
        this(Optional.empty());
    }
    
    public Context(Context parent) {
        this(Optional.of(parent));
    }    
    
    public void put(String key, Expr value) {
        mapping.put(key, value);
    }
    
    public void set(String key, Expr value) {
        if (mapping.containsKey(key)) {
            mapping.put(key, value);
        }
        else {
            if (parent.isPresent()) {
                Context _parent = parent.get();
                _parent.set(key, value);
            }
            else {
                throw new UndefinedVariableException(format("Undefined varibale: %s.", key));
            }
        }
    }
    
    public Expr get(String key) {
        Expr value = mapping.get(key);
        if (value == null) {
            if (parent.isPresent()) {
                value = parent.get().get(key);
            }
            else {
                throw new UndefinedVariableException(format("Undefined varibale: %s.", key));
            }
        }
        return value;
    }

    @Override
    public String show() {
        StringBuilder sb = new StringBuilder();
        sb.append("Context(");
        if (parent.isPresent()) {
            sb.append(parent.get().show());
        }
        else {
            sb.append("None");
        }
        int count = 0;
        sb.append(", [");
        mapping.forEach((key,value) -> {
            if (count > 0) {
                sb.append(", ");
            }
            sb.append(format("%s => %s", key, value));
        });
        sb.append(")");
        return sb.toString();
    }
    
    @Override
    public boolean equals(Object other) {
        if (other instanceof Context) {
            Context that = (Context) other;
            return Objects.equals(this.parent, that.parent)
                    && this.mapping.equals(that.mapping);
        }
        else {
            return false;
        }
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 37 * hash + Objects.hashCode(this.mapping);
        hash = 37 * hash + Objects.hashCode(this.parent);
        return hash;
    }

    public boolean isGlobal() {
        return !parent.isPresent();
    }
}
