package JoKenPo;

import java.util.Random;

public class Computador extends Jogador {

	public Computador() {
		Escolha escolha = new Escolha();
		Random geradorN = new Random();
		escolha.setJogada(geradorN.nextInt(3));
		this.setEscolha(escolha);

	}
}