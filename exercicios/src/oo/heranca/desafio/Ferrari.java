package oo.heranca.desafio;

public class Ferrari extends Carro implements Esportivo, Luxo{

	private boolean ligarTurbo;
	private boolean ligaAr;
	
	public Ferrari(){
		this(340);
	}
	
	public Ferrari(double velocidadeMaxima){
		super(velocidadeMaxima);
		setDelta(15);
	}
	
	@Override
	public void ligarTurbo() {
		ligarTurbo = true;
		
	}
	
	@Override
	public void desligarTurbo() {
		ligarTurbo = false;
	}
	
	@Override
	public void ligarAr() {
		ligaAr = true;
		
	}
	
	@Override
	public void desligarAr() {
		ligaAr = false;
		
	}
	
	@Override
	public double getDelta() {
		if(ligarTurbo && !ligaAr) {
			return 35;
		}else if(ligarTurbo && ligaAr){
			return 30;
		}else if(ligarTurbo && !ligaAr){
			return 20;
		}else {
			return 15;
		}
	}
	
//	@Override
//	public double acelerar() {
//		velocidadeAtual+=15;
//		return velocidadeAtual;
//		//super.acelerar();
//	}
	
}
