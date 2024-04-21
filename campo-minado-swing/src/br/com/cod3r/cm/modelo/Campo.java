package br.com.cod3r.cm.modelo;

import java.util.ArrayList;
import java.util.List;

import br.com.cod3r.cm.excecao.ExplosaoException;

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

		if (deltaGeral == 1 && !diagonal) {
			vizinhos.add(vizinho);
			return true;
		} else if (deltaGeral == 2 && diagonal) {
			vizinhos.add(vizinho);
			return true;
		} else {
			return false;
		}
	}

	void alternaMarcacao() {
		if (!aberto) {
			marcado = !marcado;
		}
	}

	boolean abrir() {
		if (!aberto && !marcado) {
			aberto = true;
			if (minado) {
				// TODO Implementar nova versão
			}
			if (vizinhancaSegura()) {
				vizinhos.forEach(v -> v.abrir());
			}

			return true;
		} else {

			return false;
		}

	}

	boolean vizinhancaSegura() {
		return vizinhos.stream().noneMatch(v -> v.minado);
	}

	void minar() {
		minado = true;
	}

	public boolean isMinado() {
		return minado;
	}

	public boolean isMarcado() {
		return marcado;
	}

	void setAberto(boolean aberto) {
		this.aberto = aberto;
	}

	public boolean isAberto() {
		return aberto;
	}

	public boolean isFechado() {
		return !isAberto();
	}

	public int getRow() {
		return row;
	}

	public int getColumn() {
		return column;
	}

	boolean objetivoAlcancado() {
		boolean desvendado = !minado && aberto;
		boolean protegido = minado && marcado;
		return desvendado || protegido;
	}

	long minasNaVizinhanca() {
		return vizinhos.stream().filter(v -> v.minado).count();
	}

	void reiniciar() {
		aberto = false;
		minado = false;
		marcado = false;
	}

}
