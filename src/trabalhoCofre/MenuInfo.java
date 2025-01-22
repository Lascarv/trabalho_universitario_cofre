package trabalhoCofre;

public class MenuInfo implements Menu{

	// A classe MenuInfo implementa a interface Menu e fornece a funcionalidade do menu para o cofrinho
	 
		@Override
	public void infoEntrada() {
        System.out.println("\n--- COFRINHO ---\n");
        System.out.println("SELECIONE UMA OPÇÃO: ");
        System.out.println("1 - Adicionar moeda");
        System.out.println("2 - Remover moeda");
        System.out.println("3 - Listar todas as moedas");
        System.out.println("4 - Calcular total convertido para Real");
        System.out.println("5. - Sair");
	}

		@Override
	public void adicionarMoeda() {
		System.out.println("\nSelecione a moeda para adicionar:");
        System.out.println("1 - Dólar");
        System.out.println("2 - Euro");
        System.out.println("3 - Real");
			
		}
		
		@Override
		public void removerMoeda() {
			System.out.println("\nSelecione a moeda para adicionar:");
	        System.out.println("1 - Dólar");
	        System.out.println("2 - Euro");
	        System.out.println("3 - Real");
		}
}