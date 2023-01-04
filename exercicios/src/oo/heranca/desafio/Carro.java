package oo.heranca.desafio;

public class Carro {

	public final double VELOCIDADE_MAXIMA;
	public double velocidadeAtual;
	private double delta = 5;
	
	protected Carro(double velocidadeMaxima) {
		VELOCIDADE_MAXIMA = velocidadeMaxima;
	}
	
	public double acelerar() {
		if(velocidadeAtual + getDelta() > VELOCIDADE_MAXIMA) {
			velocidadeAtual=VELOCIDADE_MAXIMA;
			return velocidadeAtual;
		} else { 
			velocidadeAtual+=getDelta();
			return velocidadeAtual;
		}
	}
	
	public double frear() {
		if(velocidadeAtual>=5) {
			velocidadeAtual-=5;
		}
		return velocidadeAtual;
	}
	
	
	public double getDelta() {
		return delta;
	}

	public void setDelta(double delta) {
		this.delta = delta;
	}

	public String toString() {
		return "A velocidade atual é " + velocidadeAtual + "Km/h.";
	}
	
}
