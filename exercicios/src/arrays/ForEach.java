package arrays;

public class ForEach {

	public static void main(String[] args) {
		
		double[] notas = {1.0, 2.0, 6.4, 23.77};
		
		for (int i = 0; i < notas.length; i++) {
			System.out.println(notas[i] + " ");
		}
		
		System.out.println();
		
		for(double nota : notas) {
			System.out.println(nota + " ");
		}
	}
}
