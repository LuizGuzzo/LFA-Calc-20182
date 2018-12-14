package edu.ifes.lfa.calc.data;


public abstract class Literal extends Expr {

    @Override
    public Expr eval(Context ctx) {
        return this;
    }
    
}
