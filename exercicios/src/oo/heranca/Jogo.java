package oo.heranca;

public class Jogo {

	public static void main(String[] args) {
		
		Jogador jogador1 = new Vilao();
		jogador1.x = 10;
		jogador1.y = 10;
		
		Jogador jogador2 = new Heroi();
		jogador2.x = 10;
		jogador2.y = 11;
		
		
//		jogador.andar(Direcao.NORTE);
//		jogador.andar(Direcao.LESTE);
//		jogador.andar(Direcao.NORTE);
//		jogador.andar(Direcao.LESTE);
		
		System.out.println(jogador1.life);
		System.out.println(jogador2.life);
		
		jogador2.atacar(jogador1);
		
		System.out.println(jogador1.life);
		System.out.println(jogador2.life);
		
	}
}
