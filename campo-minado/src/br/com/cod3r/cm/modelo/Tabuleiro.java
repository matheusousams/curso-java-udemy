package br.com.cod3r.cm.modelo;

import java.util.ArrayList;
import java.util.List;

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
		
	}	
	
}