package edu.ifes.lfa.calc.data;

import java.util.List;
import java.util.Objects;
import java.util.Arrays;


public class Vector extends Literal {
    private final Literal[] vetor;
    
    public Vector(Int size) {
        this.vetor = new Literal[size.intValue().intValue()];

        for (int x = 0; x < this.vetor.length; x++){
            this.vetor[x] = Literal.NONE;
        }
    }

    public Vector(List<Literal> values) {
        this.vetor = new Literal[values.size()];

        int k = 0;

        for(Literal value: values){
            this.vetor[k] = value;
            k++;
        }

    }


    public Literal get(Int position){
        int size = position.intValue().intValue();

        if(size > this.vetor.length){
            throw new IllegalArgumentException("A posicao desejada e maior que o tamanho do vetor.");
        }
        else{
            return this.vetor[size];
        }
    }

    public void set(Int position, Literal valor){
        int size = position.intValue().intValue();

        if(size > this.vetor.length){
            throw new IllegalArgumentException("A posicao desejada e maior que o tamanho do vetor.");
        }
        else{
            this.vetor[size] = valor;
        }
    }


    @Override
    public String show() {
        return String.format("Vetor(%s)", Arrays.toString(this.vetor));
    }

    @Override
    public boolean equals(Object other) {
        if (other instanceof Vector) {
            Vector that = (Vector) other;

            if(this.vetor.length == that.vetor.length){
                boolean ok = true;

                for(int x = 0; x < this.vetor.length; x++ ){
                    if(this.vetor[x] != that.vetor[x]){
                        ok = false;
                        break;
                    }

                }

                if(ok) return true;

                return false;
            }
            else{
                return false;
            }
        }
        else {
            return false;
        }
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 47 * hash + Objects.hashCode(this.vetor);
        return hash;
    }

    @Override
    public String toString() {
        return Arrays.toString(this.vetor);
    }
}
