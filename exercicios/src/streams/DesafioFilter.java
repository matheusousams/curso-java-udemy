package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class DesafioFilter {

	public static void main(String[] args) {
		
		CandidatoDesafio candidato1 = new CandidatoDesafio("João", 18, true);
		CandidatoDesafio candidato2 = new CandidatoDesafio("Maria", 19, false);
		CandidatoDesafio candidato3 = new CandidatoDesafio("Ana", 17, true);
		CandidatoDesafio candidato4 = new CandidatoDesafio("Enzo", 30, true);
		
		List<CandidatoDesafio> candidatos = Arrays.asList(candidato1, candidato2, candidato3, candidato4);
		
		Predicate<CandidatoDesafio> temIdadeMinima = d -> d.idade >= 18;
		Predicate<CandidatoDesafio> pagouMatricula = d -> d.pagouMatricula == true;
		
		Function<CandidatoDesafio, String> podeIniciarAulas = d -> "Bem-vindo as aulas, " + d.nome + ".";
		
		candidatos.stream()
			.filter(temIdadeMinima)
			.filter(pagouMatricula)
			.map(podeIniciarAulas)
			.forEach(System.out::println);
		
	}	
	
}
