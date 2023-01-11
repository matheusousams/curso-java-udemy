package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class Filter {

	public static void main(String[] args) {
		
		Aluno a1 = new Aluno("Adelaide", 9.3);
		Aluno a2 = new Aluno("Antônio", 8.2);
		Aluno a3 = new Aluno("Alberto", 7.0);
		Aluno a4 = new Aluno("Adelia", 5.9);
		
		List<Aluno> alunos = Arrays.asList(a1, a2, a3, a4);
		
		Predicate<Aluno> aprovado = n -> n.nota>=7;
		Predicate<Aluno> reprovado = n -> n.nota<7;

		Function<Aluno, String> mensagemAprovado =
				n -> "Parabéns " + n.nome + "! Aprovado(a)!";
		Function<Aluno, String> mensagemReprovado =
				n -> "Lamento, " + n.nome + ", você foi reprovado(a)!";
		
		alunos.stream()
			.filter(aprovado)
			.map(mensagemAprovado)
			.forEach(System.out::println);
		
		alunos.stream()
			.filter(reprovado)
			.map(mensagemReprovado)
			.forEach(System.out::println);
	}
}
