package edu.ifes.lfa.calc.data;

import java.util.Objects;


public class Bool extends Literal {

    public final Boolean value;
    
    public static final Bool VERUM = new Bool(true);
    public static final Bool FALSUM = new Bool(false);
    
    protected Bool(Boolean value) {
        this.value = value;
    }

    @Override
    public String show() {
        return String.format("Bool(%s)", String.valueOf(value));
    }
    
    @Override
    public String toString() {
        return String.valueOf(value);
    }
    
    @Override
    public boolean equals(Object other) {
        if (other instanceof Bool) {
            Bool that = (Bool) other;
            return Objects.equals(this.value, that.value);
        }
        else {
            return false;
        }
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 71 * hash + Objects.hashCode(this.value);
        return hash;
    }

    public Expr neg() {
        return value ? FALSUM : VERUM;
    }
    
}
