package edu.ifes.lfa.calc.data;

import java.util.List;
import java.util.Optional;


public abstract class Function extends Expr {

    public final Integer minArity;
    public final Optional<Integer> maxArity;
    
    public Function(Integer minArity, Optional<Integer> maxArity) {
        if (minArity < 0) {
            throw new IllegalArgumentException("Error: minArity cannot be negative!");
        }
        if (maxArity.isPresent() && maxArity.get() < minArity) {
            throw new IllegalArgumentException("Error: maxArity must be greater than or equals to minArity!");
        }
        this.minArity = minArity;
        this.maxArity = maxArity;
    }
    
    public Function(Integer minArity, Integer maxArity) {
        this(minArity, Optional.of(maxArity));
    }
    
    public Function(Integer arity) {
        this(arity, Optional.of(arity));
    }
    
    public Function() {
        this(0, Optional.empty());
    }
    
    public abstract Expr apply(Context ctx, List<Expr> args);
    
    @Override
    public Expr eval(Context ctx) {
        return this;
    }
    
    @Override
    public String toString() {
        int id = this.getClass().hashCode();
        return String.format("<fn:%d>", id);
    }
    
    @Override
    public String show() {
        int id = this.getClass().hashCode();
        return String.format("<fn:%d>", id);
    }
    
}
