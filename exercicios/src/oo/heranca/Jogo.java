package oo.heranca;

public class Jogo {

	public static void main(String[] args) {
		
		Jogador jogador = new Jogador();
		jogador.x = 10;
		jogador.y = 10;
		
		jogador.andar(Direcao.NORTE);
		jogador.andar(Direcao.LESTE);
		jogador.andar(Direcao.NORTE);
		jogador.andar(Direcao.LESTE);
		
		System.out.println(jogador.x);
		System.out.println(jogador.y);
		
	}
}
