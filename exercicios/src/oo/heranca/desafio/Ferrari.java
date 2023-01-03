package oo.heranca.desafio;

public class Ferrari extends Carro{

	@Override
	double acelerar() {
		velocidadeAtual += 15;
		return velocidadeAtual;
	}
}
