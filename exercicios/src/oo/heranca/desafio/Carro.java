package oo.heranca.desafio;

public class Carro {

	double velocidadeAtual;
	
	double acelerar() {
		velocidadeAtual+=5;
		return velocidadeAtual;
	}
	
	double frear() {
		if(velocidadeAtual>=5) {
			velocidadeAtual-=5;
		}
		return velocidadeAtual;
	}
	
	
}
