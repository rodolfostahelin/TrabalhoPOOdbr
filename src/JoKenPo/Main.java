package JoKenPo;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("--Opções--");
		System.out.println("Papel = 0");
		System.out.println("Pedra = 1");
		System.out.println("Tesoura = 2");
		System.out.println("-----------");		
		System.out.print("Usuario: ");
		
		Usuario usuario = new Usuario();
		int jogadaUsuario = usuario.getEscolha().getJogada();
		
		Computador computador = new Computador();
		int jogadaComputador = computador.getEscolha().getJogada();
				
		
		
		switch (jogadaComputador) {
		case 0:
			System.out.println("-----------");
			System.out.println("Computador escolheu papel.");
			
			break;
		case 1:
			System.out.println("-----------");
			System.out.println("Computador escolheu pedra.");
			
			break;
			
		case 2:
			System.out.println("-----------");
			System.out.println("Computador escolheu tesoura.");
			
			break;
			
		}
		
		if (0 <= jogadaUsuario && jogadaUsuario <= 2) {
			System.out.println("-----------");
			
			if (jogadaUsuario == jogadaComputador) {
				System.out.println("Empate");
			} else {
				if ((jogadaUsuario == 0 && jogadaComputador == 2) || (jogadaUsuario == 1 && jogadaComputador == 0)
						|| (jogadaUsuario == 2 && jogadaComputador == 1)) {
					System.out.println("Computador venceu!");
				} else {
					System.out.println("Jogador venceu!");
				}
			}
		} else {
			System.out.println("Você jogou um número inválido!");
		}
		
	
	}

}