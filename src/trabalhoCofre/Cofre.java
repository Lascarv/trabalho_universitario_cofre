package trabalhoCofre;

import java.util.ArrayList;
import java.util.Iterator;



public class Cofre {

	    //Lista das moedas existentes no cofre
	    private ArrayList<Moeda> listaMoedas = new ArrayList<>();

	    //Adiciona a moeda no Array - listaMoedas
	    public void adicionar(Moeda moeda){
	        listaMoedas.add(moeda);
	    }

	    /*  Percorre o Array - listaMoedas
	     * 	Remove usando iterador e interrompe o loop, removendo apenas a primeira moeda encontrada,
	     */
	    public void remover(Moeda moeda){
	        Iterator<Moeda> iterator = listaMoedas.iterator();
	        while (iterator.hasNext()){
	            Moeda m = iterator.next();
	            if(m.equals(moeda)){
	                iterator.remove();
	                return;
	            }
	        }
	    }

	    //Exibe todas moedas no Array - listaMoedas.
	    public void listagemMoedas(){
	        for(Moeda moeda : listaMoedas){
	                moeda.info();
	        }
	    }

	    //Faz a conversão e soma todas as moedas no Array - listaMoedas.
	    public  double totalConvertido(){
	        double total = 0;
	        for (Moeda moeda : listaMoedas){
	            total +=moeda.converter();
	        }
	        return total;
	    }

	    //Verifica o cofrinho esta vazio.
	    public boolean isEmpty(){
	        return listaMoedas.isEmpty();
	    }
}

	