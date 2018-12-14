package edu.ifes.lfa.calc.data;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;


public class IfExpr extends ExpecialForm {

    private final Expr cond;
    private final Expr thenExpr;
    private final Optional<Expr> elseExpr;
    private final List<Expr> elseIfExpr;
    private final List<Expr> elseIfThenExpr;
    
    protected IfExpr(Expr cond, Expr thenExpr, Optional<Expr> elseExpr, List<Expr> elseIfExpr, List<Expr> elseIfCond) {
        this.cond = cond;
        this.thenExpr = thenExpr;
        this.elseExpr = elseExpr;
        this.elseIfExpr = elseIfExpr;
        this.elseIfThenExpr = elseIfCond;
    }

    //Else if com else
    public IfExpr(Expr cond, Expr thenExpr, Expr elseExpr, List<Expr> elseIfExpr, List<Expr> elseIfCond) {
        this(cond, thenExpr, Optional.of(elseExpr), elseIfExpr, elseIfCond);
    }

    //Else if sem else
    public IfExpr(Expr cond, Expr thenExpr, List<Expr> elseIfExpr, List<Expr> elseIfCond) {
        this(cond, thenExpr, Optional.empty(), elseIfExpr, elseIfCond);
    }

    public IfExpr(Expr cond, Expr thenExpr, Expr elseExpr) {
        this(cond, thenExpr, Optional.of(elseExpr), new ArrayList<>(), new ArrayList<>());
    }
    
    public IfExpr(Expr cond, Expr thenExpr) {
        this(cond, thenExpr, Optional.empty(), new ArrayList<>(), new ArrayList<>());
    }

    @Override
    public Expr eval(Context ctx) {
        Expr c = cond.eval(ctx);
        if (c instanceof Bool) {
            Bool c1 = (Bool) c;
            if (c1.value == true) {
                return thenExpr.eval(ctx);
            }
            else if (elseIfExpr.size() > 0) {

                for(int x = 0; x < elseIfExpr.size(); x++){
                    Expr elseIfCondidition = elseIfExpr.get(x).eval(ctx);
                    Bool elseIfCondiditionValue = (Bool) elseIfCondidition;
                    if(elseIfCondiditionValue.value == true){
                        return elseIfThenExpr.get(x).eval(ctx);
                    }
                }

                if (elseExpr.isPresent()) {
                    Expr e = elseExpr.get();
                    return e.eval(ctx);
                }
                else{
                    return Expr.NONE;
                }
            }
            else if (elseExpr.isPresent()) {
                Expr e = elseExpr.get();
                return e.eval(ctx);
            }
            else {
                return Expr.NONE;
            }
        }
        else {
            String err = String.format(
                    "If condition is not boolean: %s", c);
            throw new RuntimeException(err);
        }
    }

    @Override
    public String show() {
        if (elseExpr.isPresent()) {
            return String.format("IfExpr(%s, %s, %s)", 
                    cond.show(), 
                    thenExpr.show(), elseExpr.get().show());
        }
        else {
            return String.format("IfExpr(%s, %s)", 
                    cond.show(), 
                    thenExpr.show());
        }
    }
    
}
