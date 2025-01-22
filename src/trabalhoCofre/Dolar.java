package trabalhoCofre;

	class Dolar extends Moeda {

	    /* A classe representa a moeda dolar. Ela está herdando a classe Moeda.
	     * Armazena um valor e exibe informações com o metodo info e tamb´me
	     * realiza a conversão desse valor para outra moeda	     
	     */
	    public Dolar(double valor){
	        super(valor);
	    }

	    
	    	@Override
	    public void info() {
	        System.out.println("Dolar: $" + valor);
	    }

	   
	    	@Override
	    public double converter() {
	        return this.getValor() * 5.25;
	    }

	}
