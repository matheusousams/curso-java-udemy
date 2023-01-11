package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Predicate;

public class Reduce2 {

	public static void main(String[] args) {
		Aluno a1 = new Aluno("Jhon", 7.1);
		Aluno a2 = new Aluno("Paul", 6.1);
		Aluno a3 = new Aluno("Louis", 8.1);
		Aluno a4 = new Aluno("Kate", 10);
		
		List<Aluno> alunos = Arrays.asList(a1, a2, a3, a4);
		
		Predicate<Aluno> aprovado = x -> x.nota >= 7;
		Function<Aluno, Double> apenasNota = x -> x.nota;
		BinaryOperator<Double> somatorio = (x, y) -> x + y;
		
		alunos.parallelStream()
			.filter(aprovado)
			.map(apenasNota)
			.reduce(somatorio)
			.ifPresent(System.out::println);
		
	}
	
}
