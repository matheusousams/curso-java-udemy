package arrays;

import java.util.Arrays;

public class Exercicio {

	public static void main(String[] args) {
		
		double[] notasAlunosA = new double[3];
		System.out.println(Arrays.toString(notasAlunosA));

		notasAlunosA[0] = 7.9;
		notasAlunosA[1] = 8;
		notasAlunosA[2] = 6.7;

		System.out.println(Arrays.toString(notasAlunosA));
		
		double totalA = 0;
		for(int i=0;i<notasAlunosA.length;i++) {
			totalA += notasAlunosA[i];
		}
		System.out.println(totalA/notasAlunosA.length);
		
		double[] notasAlunoB = {6.6,7.8,9.7,10.0};
		
		double totalB = 0;
		for (int i = 0; i < notasAlunoB.length; i++) {
			totalB += notasAlunoB[i];
		}
		System.out.println(totalB/notasAlunoB.length);
		
	}
}
