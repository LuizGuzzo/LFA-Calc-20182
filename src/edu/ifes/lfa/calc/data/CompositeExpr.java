package edu.ifes.lfa.calc.data;

import static java.lang.String.format;
import java.util.ArrayList;
import java.util.List;


public class CompositeExpr extends Expr {

    public final Expr funExpr;
    public final List<Expr> args;
    
    
    public CompositeExpr(Expr funExpr, List<Expr> args) {
        this.funExpr = funExpr;
        this.args = args;
    }

    @Override
    public Expr eval(Context ctx) {
        Function f = evalAsFunction(funExpr, ctx);
        return f.apply(ctx, args);
    }

    @Override
    public String show() {
        StringBuilder sb = new StringBuilder();
        sb.append("CompositeExpr(");
        sb.append(funExpr.show());
        sb.append(", [");
        for (Expr e: args) {
            sb.append(", ");
            sb.append(e.show());
        }
        sb.append("])");
        return sb.toString();
    }
    
    @Override
    public String toString() {
        return prefixFormat();
    }

    private String prefixFormat() {
        if (args.size() == 1 && !(args.get(0) instanceof CompositeExpr)) {
            return String.format("%s%s", funExpr, args.get(0));
        }
        else {
            int count = 0;
            StringBuilder sb = new StringBuilder();
            sb.append(funExpr.toString());
            sb.append("(");
            for (Expr e: args) {
                if (count > 0) {
                    sb.append(", ");
                }
                sb.append(e.toString());
                count += 1;
            }
            sb.append(")");
            return sb.toString();
        }
    }

    private String infixFormat() {
        if (args.size() != 2) {
            String err = String.format(
                    "Cannot apply INFIX operator to %d arguments.", 
                    args.size());
            throw new IllegalStateException(err);
        }
        return String.format("(%s %s %s)", args.get(0), funExpr, args.get(1));
    }

    private String postfixFormat() {
        if (args.size() == 1 && !(args.get(0) instanceof CompositeExpr)) {
            return String.format("%s%s", args.get(0), funExpr);
        }
        else {
            int count = 0;
            StringBuilder sb = new StringBuilder();
            sb.append("(");
            for (Expr e: args) {
                if (count > 0) {
                    sb.append(", ");
                }
                sb.append(e.toString());
                count += 1;
            }
            sb.append(")");
            sb.append(funExpr.toString());
            return sb.toString();
        }
    }

    private Function evalAsFunction(Expr funExpr, Context ctx) {
        Expr x = funExpr.eval(ctx);
        if (x instanceof Function) {
            return (Function) x;
        }
        else {
            String err = format("Value is not a function: %s.", x);
            throw new RuntimeException(err);
        }

    }
    
}
