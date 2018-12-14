package edu.ifes.lfa.calc.data;

import java.util.Objects;


public class Int extends Numeric {
    
    public final Long value;
    
    public Int(Long value) {
        this.value = value;
    }

    @Override
    public String show() {
        return String.format("Int(%d)", value);
    }
    
    @Override
    public boolean equals(Object other) {
        if (other instanceof Int) {
            Int that = (Int) other;
            return Objects.equals(this.value, that.value);
        }
        else {
            return false;
        }
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 47 * hash + Objects.hashCode(this.value);
        return hash;
    }

    @Override
    public Long intValue() {
        return this.value;
    }

    @Override
    public Double decValue() {
        return (double) this.value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }
    
}
