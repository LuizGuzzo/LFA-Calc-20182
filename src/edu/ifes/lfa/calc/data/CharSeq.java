package edu.ifes.lfa.calc.data;

import static edu.ifes.lfa.calc.Utils.unescapeString;
import static java.lang.String.format;

import java.util.List;
import java.util.Objects;


public class CharSeq extends Literal implements Comparable<CharSeq> {

    public String value;
    
    public CharSeq(String value) {
        this.value = value;
    }

    @Override
    public String show() {
        return format("CharSeq(%s)", unescapeString(value));
    }
    
    @Override
    public String toString() {
        return value;
    }
    
    @Override
    public boolean equals(Object other) {
        if (other instanceof CharSeq) {
            CharSeq that = (CharSeq) other;
            return this.value.equals(that.value);
        }
        else {
            return false;
        }
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 23 * hash + Objects.hashCode(this.value);
        return hash;
    }

    @Override
    public int compareTo(CharSeq o) {
        return value.compareTo(o.value);
    }

    public Int length(){
        Long tamanho = (long) this.value.length();
        return new Int(tamanho);
    }

    public CharSeq charat(Int position){
        int posicao = position.intValue().intValue();

        if(posicao > this.value.length()){
            throw new IllegalArgumentException("A posicao desejada e maior que o tamanho da string.");
        }
        else{
            CharSeq retorno =  new CharSeq(Character.toString(this.value.charAt(posicao)));
            return retorno;
        }

    }

    public CharSeq concat(List<String> values){
        String valorRetornavel = this.value;
        for(String svalue : values){
            valorRetornavel += svalue;
        }

        this.value = valorRetornavel;
        CharSeq retorno =  new CharSeq(valorRetornavel);
        return retorno;
    }

    public CharSeq substring(Int Initialposition, Int Finalposition){
        int inicio = Initialposition.intValue().intValue();
        int fim = Finalposition.intValue().intValue();

        try{
            CharSeq retorno =  new CharSeq(this.value.substring(inicio, fim));
            return retorno;
        }
        catch (Exception ex){
            throw new IllegalArgumentException("Erro ao usar o substring: " + ex.getMessage());
        }
    }

    public CharSeq formatString(Object[] values){

        for(int x = 0; x < values.length; x++){
            if(values[x] instanceof Int){
                values[x] = ((Int)values[x]).intValue();
            }
            else if(values[x] instanceof Decimal){
                values[x] = ((Decimal)values[x]).decValue();
            }
        }

        String valorRetornavel = format(this.value, values);
        this.value = valorRetornavel;
        CharSeq retorno =  new CharSeq(valorRetornavel);
        return retorno;
    }

}
