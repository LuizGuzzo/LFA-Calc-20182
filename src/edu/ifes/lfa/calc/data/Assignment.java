package edu.ifes.lfa.calc.data;

import java.util.Objects;

public class Assignment extends ExpecialForm {

    private final String varName;
    private final Expr rhs;
    
    public Assignment(String varName, Expr rhs) {
        this.varName = varName;
        this.rhs = rhs;
    }

    @Override
    public Expr eval(Context ctx) {
        Expr value = rhs.eval(ctx);
        ctx.put(varName, value);
        return value;
    }

    @Override
    public String show() {
        return String.format("Assign(%s, %s)", varName, rhs.show());
    }
    
    @Override
    public String toString() {
        return String.format("%s = %s", varName, rhs);
    }
    
    @Override
    public boolean equals(Object other) {
        if (other instanceof Assignment) {
            Assignment that = (Assignment) other;
            return this.varName.equals(that.varName) 
                    && this.rhs.equals(that.rhs);
        }
        else {
            return false;
        }
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 19 * hash + Objects.hashCode(this.varName);
        hash = 19 * hash + Objects.hashCode(this.rhs);
        return hash;
    }
    
}
