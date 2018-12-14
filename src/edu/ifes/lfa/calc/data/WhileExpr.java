package edu.ifes.lfa.calc.data;


public class WhileExpr extends ExpecialForm {

    private final Expr condExpr;
    private final Expr doExpr;
    
    public WhileExpr(Expr condExpr, Expr doExpr) {
        this.condExpr = condExpr;
        this.doExpr = doExpr;
    }

    @Override
    public Expr eval(Context ctx) {
        Expr result = Expr.NONE;
        Bool cond = evalAsBool(condExpr, ctx);
        while (cond.value.booleanValue() == true) {
            result = doExpr.eval(ctx);
            cond = evalAsBool(condExpr, ctx);
        }
        return result;
    }
    
    private Bool evalAsBool(Expr e, Context ctx) {
        Expr x = e.eval(ctx);
        if (x instanceof Bool) {
            return (Bool) x;
        }
        else {
            String err = String.format(
                    "While condition is not boolean: %s", x);
            throw new RuntimeException(err);
        }        
    }

    @Override
    public String show() {
        return String.format("WhileExpr(%s, %s)", condExpr.show(), doExpr.show());
    }
    
}
