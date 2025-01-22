package trabalhoCofre;
import java.util.Scanner;

 	/*Este trecho inicializa um scanner para entrada de dados e cria 
 	 * um objeto "Cofre". Em seguida, entra em um loop contínuo, exibindo o menu e aguardando a seleção do usuário.
 	 */
public class Principal {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        Cofre cofre = new Cofre();

        while (true){
        	
        	Menu i1 = new MenuInfo();
        	      	
        	
        	i1.infoEntrada();
            int selecao = teclado.nextInt();

            /* trecho de código implementa um menu que permite adicionar, 
             * remover, listar, converter moedas e finalizar o programa, com validações para entradas inválidas.
             */
            switch (selecao){
                case 1:
                	
                    i1.adicionarMoeda();
                    int tipoMoeda = teclado.nextInt();

                    System.out.println("\nDigite o valor da moeda que será adicionada: ");
                    double valor = teclado.nextDouble();

                    switch (tipoMoeda){ 
                    
                    	case 3 -> cofre.adicionar(new Real(valor));
                        case 1 -> cofre.adicionar(new Dolar(valor));
                        case 2 -> cofre.adicionar(new Euro(valor));
                        default -> System.out.println("Opção invalida, tente novamente.");
                    } break;

                case 2:
                  
                	i1.removerMoeda();
                    valor = teclado.nextDouble();
                    
                    System.out.print("Digite o qual o valor da moeda que deseja remover: ");
                    tipoMoeda = teclado.nextInt();

                    Moeda moedaRemover = switch (tipoMoeda){
                        case 1 -> new Dolar(valor);
                        case 2 -> new Euro(valor);
                        case 3 -> new Real(valor);
                        default -> null;
                    };

                    if(moedaRemover != null){
                        cofre.remover(moedaRemover);
                        System.out.println("Moeda removida!");
                    } else {
                        System.out.println("Tipo de moeda invalido!");
                    } break;
                    

                case 3:
                    
                    if (cofre.isEmpty()) {
                        System.out.println("Você tem que adiocionar alguma moeda primeiro");
                    } else {
                        System.out.println("Lista das Moedas Adicionadas no cofre:");
                        System.out.println("************");
                        cofre.listagemMoedas();
                        System.out.println("************");
                    } 
                    

                case 4:
                    
                    System.out.println("*******************");
                    System.out.println("Total convertido: R$" + cofre.totalConvertido());
                    System.out.println("*******************");
                    break;


                case 5:
                    
                    System.out.println("Finalizando programa...");
                    teclado.close();
                   

                default:
                    
                    System.out.println("Opçao invalida! Tente novamente");

            }
        }
    }
}
