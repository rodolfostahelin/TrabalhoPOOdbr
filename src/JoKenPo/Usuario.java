package JoKenPo;

import java.util.Scanner;

public class Usuario extends Jogador {
	
	public Usuario() {
		Escolha escolha = new Escolha();
		Scanner leitor = new Scanner(System.in);
		escolha.setJogada(leitor.nextInt());
		this.setEscolha(escolha);
	}
}