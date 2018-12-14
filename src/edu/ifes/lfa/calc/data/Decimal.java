package edu.ifes.lfa.calc.data;

import java.util.Objects;


public class Decimal extends Numeric {
    
    public final Double value;
    
    public Decimal(Double value) {
        this.value = value;
    }

    @Override
    public String show() {
        return String.format("Decimal(%f)", value);
    }
    
    @Override
    public boolean equals(Object other) {
        if (other instanceof Decimal) {
            Decimal that = (Decimal) other;
            return Objects.equals(this.value, that.value);
        }
        else {
            return false;
        }
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 47 * hash + Objects.hashCode(this.value);
        return hash;
    }

    @Override
    public Long intValue() {
        return this.value.longValue();
    }

    @Override
    public Double decValue() {
        return this.value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

}
