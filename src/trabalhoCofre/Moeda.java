package trabalhoCofre;

import java.util.Objects;


abstract class Moeda {
   
    protected double valor;

    public abstract void info();
 
    public abstract double converter();

    public Moeda(double valor) {
        this.valor = valor;
    }

    public double getValor() {
        return valor;
    }
}
