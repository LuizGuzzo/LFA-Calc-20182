package edu.ifes.lfa.calc.data;


public abstract class Expr implements Show {

    public static final Literal NONE = new Literal() {
        
        @Override
        public Expr eval(Context ctx) {
            return this;
        }

        @Override
        public String show() {
            return "None";
        }
        
        @Override
        public String toString() {
            return "()";
        }
        
    };
    
    public abstract Expr eval(Context ctx);
    
    @Override
    public abstract String show();
    
}
