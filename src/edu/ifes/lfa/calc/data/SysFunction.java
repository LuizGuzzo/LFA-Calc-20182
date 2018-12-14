package edu.ifes.lfa.calc.data;

import static java.lang.String.format;
import java.util.LinkedList;
import java.util.List;
import java.util.Optional;


public abstract class SysFunction extends Function {
        
    public SysFunction(Integer minArity, Optional<Integer> maxArity) {
        super(minArity, maxArity);
    }
    
    public SysFunction(Integer minArity, Integer maxArity) {
        super(minArity, Optional.of(maxArity));
    }
    
    public SysFunction(Integer arity) {
        super(arity, Optional.of(arity));
    }
    
    public SysFunction() {
        super();
    }
    
    protected abstract Expr fn(List<Literal> values);
    
    @Override
    public Expr apply(Context ctx, List<Expr> args) {
        checkArity(args);
        List<Literal> params = new LinkedList<>();
        for (Expr e: args) {
            Expr x = e.eval(ctx);
            Literal val = (Literal) x;
            params.add(val);
        }
        Expr ans = fn(params);
        return ans;
    }
    
    private void checkArity(List<Expr> args) {
        if (args.size() < minArity || (maxArity.isPresent() && args.size() > maxArity.get())) {
            String a = arityToString();
            String err = format("Wrong number of arguments. Expected: %s; Found: %d.", a, args.size());
        }
    }

    private String arityToString() {
        String ans;
        if (maxArity.isPresent()) {
            if (maxArity.get() == minArity) {
                ans = String.valueOf(minArity);
            }
            else {
                ans = format("[%d..%d]", minArity, maxArity.get());
            }
        }
        else {
            ans = format("[%d...]", minArity, maxArity.get());            
        }
        return ans;
    }
    
}
