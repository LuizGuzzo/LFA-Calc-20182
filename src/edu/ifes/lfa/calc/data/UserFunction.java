package edu.ifes.lfa.calc.data;

import static java.lang.String.format;
import java.util.LinkedList;
import java.util.List;


public class UserFunction extends Function {

    private final List<String> params;
    private final Expr body;
    
    public UserFunction(List<String> params, Expr body) {
        this.params = params;
        this.body = body;
    }

    @Override
    public Expr apply(Context ctx, List<Expr> args) {
        checkArity(args);
        List<Literal> values = new LinkedList<>();
        for (Expr e: args) {
            Expr x = e.eval(ctx);
            Literal val = (Literal) x;
            values.add(val);
        }
        Context ctx1 = new Context(ctx);
        for (int i = 0; i < params.size(); i++) {
            String paramName = params.get(i);
            Expr paramValue = values.get(i);
            ctx1.put(paramName, paramValue);
        }
        return body.eval(ctx1);
    }
    
    @Override
    public String show() {
        return format("UserFunction(%s, %s)", params, body.show());
    }

    private void checkArity(List<Expr> args) {
        if (args.size() != params.size()) {
            String err = format("Wrong number of arguments. Expected: %d; Found: %d.", params.size(), args.size());
            throw new IllegalArgumentException(err);
        }
    }
    
}
