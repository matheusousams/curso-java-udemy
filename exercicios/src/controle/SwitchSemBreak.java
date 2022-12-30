package controle;

public class SwitchSemBreak {

	public static void main(String[] args) {
		
		String faixa = "preta";
		
		switch(faixa.toLowerCase()) {
		case "preta":
			System.out.println("preta");
		case "marrom":
			System.out.println("marrom");
		case "roxa":
			System.out.println("roxa");
		case "verde":
			System.out.println("verde");
		}
	}
}
