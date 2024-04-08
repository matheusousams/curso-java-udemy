package br.com.cod3r.cm.modelo;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import br.com.cod3r.cm.excecao.ExplosaoException;

public class Tabuleiro {

	private int rows;
	private int columns;
	private int minas;
	
	private final List<Campo> campos = new ArrayList<>();
	
	public Tabuleiro(int rows, int columns, int minas) {
		this.rows=rows;
		this.columns=columns;
		this.minas=minas;
		
		gerarCampos();
		associarOsVizinhos();
		sortearMinas();
		
	}

	public void abrir(int row, int column) {
		try {
			campos.parallelStream().filter(c -> c.getRow() == row && c.getColumn() == column)
				.findFirst().ifPresent(c -> c.abrir());
		} catch (ExplosaoException e) {
			campos.forEach(c -> c.setAberto(true));
			throw e;
		}
	}
	
	public void alternaMarcacao(int row, int column) {
		campos.parallelStream().filter(c -> c.getRow() == row && c.getColumn() == column)
		.findFirst().ifPresent(c -> c.alternaMarcacao());
	}
	
	private void gerarCampos() {
		for (int row = 0; row < rows; row++) {
			for (int column = 0; column < columns; column++) {
				campos.add(new Campo(row, column));
			}
		}
	}

	private void associarOsVizinhos() {
		for(Campo c1: campos) {
			for(Campo c2: campos) {
				c1.adicionarVizinho(c2);
			}
		}
	}
	
	private void sortearMinas() {
		long minasArmadas = 0;
		Predicate<Campo> minado = c -> c.isMinado();
		
		do { 
			int aleatorio = (int) (Math.random() * campos.size());
			campos.get(aleatorio).minar();
			minasArmadas = campos.stream().filter(minado).count();
		} while (minasArmadas < minas);
	}	
	
	public boolean objetivoAlcancado() {
		return campos.stream().allMatch(c -> c.objetivoAlcancado());
	}
	
	public void reiniciar() {
		campos.stream().forEach(c -> c.reiniciar());
		sortearMinas();
	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		
		sb.append("  ");
		for (int column = 0; column < columns; column++) {
			sb.append(" ");
			sb.append(column);
			sb.append(" ");
		}

		sb.append("\n");

		int i = 0;
		for (int row = 0; row < rows; row++) {
			sb.append(row);
			sb.append(" ");
			for (int column = 0; column < columns; column++) {
				sb.append(" ");
				sb.append(campos.get(i));
				sb.append(" ");
				i++;
			}
			sb.append("\n");
		}
		
		return sb.toString();
	}
	
}