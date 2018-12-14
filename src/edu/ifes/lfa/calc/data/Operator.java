package edu.ifes.lfa.calc.data;


public abstract class Operator extends SysFunction {

    public final ExprNotation notation;
    public final String symbol;
    
    public Operator(String symbol, int arity) {
        this(symbol, arity, arity == 2 ? ExprNotation.INFIX : ExprNotation.PREFIX);
    }
    
    public Operator(String symbol, int arity, ExprNotation notation) {
        super(arity);
        this.notation = notation;
        this.symbol = symbol;
    }
    
    @Override
    public String show() {
        return String.format("<op:%s>", symbol);
    }
    
    @Override
    public String toString() {
        return symbol;
    }
    
}
