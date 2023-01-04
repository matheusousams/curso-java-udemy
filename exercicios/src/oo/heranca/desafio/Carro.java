package oo.heranca.desafio;

public class Carro {

	final double VELOCIDADE_MAXIMA;
	public double velocidadeAtual;
	double delta = 5;
	
	Carro(double velocidadeMaxima) {
		VELOCIDADE_MAXIMA = velocidadeMaxima;
	}
	
	public double acelerar() {
		if(velocidadeAtual + delta > VELOCIDADE_MAXIMA) {
			velocidadeAtual=VELOCIDADE_MAXIMA;
			return velocidadeAtual;
		} else { 
			velocidadeAtual+=delta;
			return velocidadeAtual;
		}
	}
	
	public double frear() {
		if(velocidadeAtual>=5) {
			velocidadeAtual-=5;
		}
		return velocidadeAtual;
	}
	
	public String toString() {
		return "A velocidade atual é " + velocidadeAtual + "Km/h.";
	}
	
}
