package edu.ifes.lfa.calc.data;

import java.util.List;
import java.util.Objects;


public class BlockExpr extends ExpecialForm {

    private final List<Expr> exprList;
    
    public BlockExpr(List<Expr> exprList) {
        this.exprList = exprList;
    }

    @Override
    public Expr eval(Context ctx) {
        Expr result = null;
        for (Expr e: exprList) {
            result = e.eval(ctx);
        }
        return result;
    }

    @Override
    public String show() {
        StringBuilder sb = new StringBuilder();
        sb.append("Block(");
        int count = 0;
        for (Expr e: exprList) {
            if (count > 0) {
                sb.append(", ");
            }
            sb.append(e.show());
            count += 1;
        }
        sb.append(")");
        return sb.toString();
    }
    
    @Override
    public boolean equals(Object other) {
        if (other instanceof BlockExpr) {
            BlockExpr that = (BlockExpr) other;
            return this.exprList.equals(that.exprList);
        }
        else {
            return false;
        }
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 37 * hash + Objects.hashCode(this.exprList);
        return hash;
    }
    
}
