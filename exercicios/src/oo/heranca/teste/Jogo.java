package oo.heranca.teste;

import oo.heranca.Direcao;
import oo.heranca.Heroi;
import oo.heranca.Jogador;
import oo.heranca.Vilao;

public class Jogo {

	public static void main(String[] args) {
		
		Jogador villan = new Vilao();
		villan.x = 10;
		villan.y = 10;
		
		Jogador hero = new Heroi(10,11);
//		hero.x = 10;
//		hero.y = 11;
		
//		jogador.andar(Direcao.NORTE);
//		jogador.andar(Direcao.LESTE);
//		jogador.andar(Direcao.NORTE);
//		jogador.andar(Direcao.LESTE);
		
		System.out.println("Vida do monstro: " + villan.life);
		System.out.println("Vida do herói: " + hero.life);
		
		hero.atacar(villan);
		villan.atacar(hero);
		
		System.out.println("Vida do monstro: " + villan.life);
		System.out.println("Vida do herói: " + hero.life);

		hero.andar(Direcao.NORTE);
		hero.atacar(villan);
		villan.atacar(hero);
		
		System.out.println("Vida do monstro: " + villan.life);
		System.out.println("Vida do herói: " + hero.life);
		
		villan.andar(Direcao.NORTE);
		
	}
}
