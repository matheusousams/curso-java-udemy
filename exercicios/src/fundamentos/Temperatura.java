package fundamentos;

public class Temperatura {

	public static void main(String[] args) {
		
		final int ajuste = 32;
		final double fator = 5/9.0;
		
		double F = 150;
		double C = (F - ajuste)*fator;
		System.out.println(F + "ºF são " + C + "ºC");
		
		F = 86;
		C = (F - ajuste)*fator;
		System.out.println(F + "ºF são " + C + "ºC");

	}
}
