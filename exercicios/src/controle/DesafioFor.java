package controle;

public class DesafioFor {

	public static void main(String[] args) {
		
		String valor = "#";
		for(int i=valor.length(); i<="#####".length(); i++) {
			System.out.println(valor);
			valor+="#";
		}
	}
}
