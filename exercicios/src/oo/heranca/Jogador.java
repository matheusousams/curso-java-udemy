package oo.heranca;

public class Jogador {

	int life=100;
	int x, y;
	
	boolean atacar(Jogador adversario) {
		
		int deltaX = Math.abs(x - adversario.x);
		int deltaY = Math.abs(y - adversario.y);
		
		if(deltaX == 0 && deltaY == 1) {
			adversario.life -= 10;
			return true;
		} else if (deltaX == 1 && deltaY == 0) {
			adversario.life -= 10;
			return true;			
		} else {
			return false;
		}
		
	}
	
	boolean andar(Direcao direcao) {
		switch (direcao) {
		case NORTE:
			y--;
			break;
		case LESTE:
			x++;
			break;
		case SUL:
			y++;
			break;
		case OESTE:
			x--;
			break;
		}
		
		return true;
	}
}
