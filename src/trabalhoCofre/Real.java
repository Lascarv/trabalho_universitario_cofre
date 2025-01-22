package trabalhoCofre;

public class Real extends Moeda {


	 /* A classe representa a moeda Real. Assim como as demais moedas, ela está herdando a classe Moeda.
    * Armazenando um valor e exibindo informações com o metodo info e também
    * realiza a conversão desse valor para outra moeda	     
    */
	    public Real (double valor){
	        super(valor);
	    }

	    	@Override
	    public void info() {
	        System.out.println("Real: R$" + valor);
	    }

	    	@Override
	    public double converter() {
	        return valor;
	    }
	}
