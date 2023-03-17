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
		boolean linhaDiferente = row != vizinho.row;
		boolean colunaDiferente = column != vizinho.column;
		boolean diagonal = linhaDiferente && colunaDiferente;
		
		int deltaLinha = Math.abs(row - vizinho.row);
		int deltaColuna = Math.abs(column - vizinho.column);
		int deltaGeral = deltaColuna + deltaLinha;
		
		if(deltaGeral == 1 && !diagonal) {
			vizinhos.add(vizinho);
			return true;
		} else if(deltaGeral == 2 && diagonal) {
			vizinhos.add(vizinho);
			return true;
		} else {
			return false;
		}
	}
}
