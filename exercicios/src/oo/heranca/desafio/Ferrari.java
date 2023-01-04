package oo.heranca.desafio;

public class Ferrari extends Carro{

	public Ferrari(){
		this(340);
	}
	
	public Ferrari(double velocidadeMaxima){
		super(velocidadeMaxima);
		delta = 15;
	}
	
//	@Override
//	double acelerar() {
//		velocidadeAtual+=15;
//		return velocidadeAtual;
//		//super.acelerar();
//	}
	
}
