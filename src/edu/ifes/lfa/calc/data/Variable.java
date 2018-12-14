package edu.ifes.lfa.calc.data;


public class Variable extends Expr {

    private final String name;
    
    public Variable(String name) {
        this.name = name;
    }

    @Override
    public Expr eval(Context ctx) {
        return ctx.get(name);
    }

    @Override
    public String show() {
        return String.format("Variable(%s)", name);
    }
    
    @Override
    public String toString() {
        return name;
    }
    
}
