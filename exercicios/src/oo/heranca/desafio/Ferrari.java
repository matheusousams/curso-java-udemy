package oo.heranca.desafio;

public class Ferrari extends Carro{

	Ferrari(double velocidadeMaxima){
		super(velocidadeMaxima);
	}
	
	@Override
	double acelerar() {
		if(velocidadeAtual + 15 > VELOCIDADE_MAXIMA) {
			velocidadeAtual=VELOCIDADE_MAXIMA;
			return velocidadeAtual;
		} else { 
			velocidadeAtual+=15;
			return velocidadeAtual;
		}
	}
}
