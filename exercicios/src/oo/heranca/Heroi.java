package oo.heranca;

public class Heroi extends Jogador{

	boolean atacar(Jogador adversario) {
		boolean ataque1 = super.atacar(adversario);
		boolean ataque2 = super.atacar(adversario);
		boolean ataque3 = super.atacar(adversario);
		return ataque1 || ataque2 || ataque3;
	}
}
