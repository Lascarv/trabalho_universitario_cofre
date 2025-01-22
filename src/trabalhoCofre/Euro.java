package trabalhoCofre;

public class Euro extends Moeda {

	 /* A classe representa a moeda Euro. Assim como o Dolar, ela está herdando a classe Moeda.
     * Armazenando um valor e exibindo informações com o metodo info e também
     * realiza a conversão desse valor para outra moeda	     
     */
    public Euro(double valor){
        super(valor);
    }

   
    	@Override
    public void info() {
        System.out.println("Euro: €" + valor);
    }

    	@Override
    public double converter() {
        return valor * 7.10;
    }
}