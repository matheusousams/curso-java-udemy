package oo.composicao;

public class CursoTeste {

	public static void main(String[] args) {
		
		Aluno aluno1 = new Aluno("Chen");
		Aluno aluno2 = new Aluno("Mina");
		Aluno aluno3 = new Aluno("Tayeon");
		
		Curso curso1 = new Curso("Java");
		Curso curso2 = new Curso("Python");
		Curso curso3 = new Curso("JavaScript");
		
		curso1.adicionarAluno(aluno1);
		curso1.adicionarAluno(aluno2);
		
		curso2.adicionarAluno(aluno1);
		curso2.adicionarAluno(aluno3);
		
		aluno1.adicionarCurso(curso3);
		aluno2.adicionarCurso(curso3);
		aluno3.adicionarCurso(curso3);
		
		for (Aluno aluno : curso3.alunos) {
			System.out.print("Meu nome � " + aluno.nome + " ");
			System.out.println("e estou matriculado no curso de " + curso1.nome +"...");
		}
		
		System.out.println(aluno1.cursos.get(0).alunos);
		
		Curso cursoEncontrado = aluno1.obterCursoPorNome("Java");
		
		if(cursoEncontrado != null) {
			System.out.println(cursoEncontrado.nome);
			System.out.println(cursoEncontrado.alunos);
		}
	}
}
