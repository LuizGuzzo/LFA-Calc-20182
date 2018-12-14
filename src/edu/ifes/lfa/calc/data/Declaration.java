package edu.ifes.lfa.calc.data;

import static java.lang.String.format;


public class Declaration extends ExpecialForm {

    private final String name;
    private final Expr initValue;
    
    public Declaration(String name, Expr initValue) {
        this.name = name;
        this.initValue = initValue;
    }

    @Override
    public Expr eval(Context ctx) {
        Expr value = initValue.eval(ctx);
        ctx.put(name, value);
        return value;
    }

    @Override
    public String show() {
        return format("Declaration(%s, %s)", name, initValue.show());
    }
    
}
