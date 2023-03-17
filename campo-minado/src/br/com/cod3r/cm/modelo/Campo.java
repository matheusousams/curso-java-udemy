package br.com.cod3r.cm.modelo;

import java.util.ArrayList;
import java.util.List;

public class Campo {

	private final int row;
	private final int column;
	
	private boolean aberto = false;
	private boolean marcado = false;
	private boolean minado = false;
	
	private List<Campo> vizinhos = new ArrayList<>();
	
	Campo(int row, int column) {
		this.row = row;
		this.column = column;
	}
	
	boolean adicionarVizinho(Campo vizinho) {
		
	}
}
