package br.com.cod3r.cm.modelo;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

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

	private void gerarCampos() {
		for (int r = 0; r < rows; r++) {
			for (int c = 0; c < columns; c++) {
				campos.add(new Campo(r, c));
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
			minasArmadas = campos.stream().filter(minado).count();
			int aleatorio = (int) Math.random() * campos.size();
			campos.get(aleatorio).minar();
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
		
	}
	
}