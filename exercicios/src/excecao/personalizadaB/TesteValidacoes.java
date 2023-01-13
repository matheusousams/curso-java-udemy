package excecao.personalizadaB;

import excecao.Aluno;

public class TesteValidacoes {

	public static void main(String[] args) {
		
		try {
			Aluno aluno = new Aluno("Kaio", 5);
			Validar.aluno(aluno);
			Validar.aluno(null);
		} catch (StringVaziaException | NumeroForaDoIntervaloException e) {
			System.out.println(e.getMessage());
		} catch (IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}
		
		System.out.println("Fim!");
	}
}
