package oo.heranca;

public class Vilao extends Jogador{

	Vilao() {
		super(0, 0);
	}
	
	Vilao(int x, int y){
		super(x, y);
	}
	
	boolean atacar(Jogador adversario) {
		
		int deltaX = Math.abs(x - adversario.x);
		int deltaY = Math.abs(y - adversario.y);
		
		if(deltaX == 0 && deltaY == 1) {
			adversario.life -= 12;
			return true;
		} else if (deltaX == 1 && deltaY == 0) {
			adversario.life -= 12;
			return true;			
		} else {
			return false;
		}
		
	}
}
