package colecoes;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {

	public static void main(String[] args) {
		
		Queue<String> fila = new LinkedList<>();
		
		//Offer e Add -> adicionam elementos na fila
		//Diferen�a � o comportamento quando a fila est� CHEIA!
		fila.add("Ana"); //lan�a uma exce��o caso a fila esteja cheia
		fila.offer("Bia"); //retorna false caso a fila esteja cheia
		fila.add("Carlos");
		fila.offer("Daniel");
		fila.add("Rafaela");
		fila.offer("Gui");
		
		// Peek e Element -> obter o pr�ximo elemento da fila (sem remover)
		//Diferen�a � o comportamento que ocorre quando a fila est� VAZIA!
		System.out.println(fila.peek()); //retorna false
		System.out.println(fila.peek());
		System.out.println(fila.element()); //lan�a uma exce��o
		System.out.println(fila.element());
		
		//Pool e Remove -> obter o pr�ximo elemento da fila e remove
		//Diferen�a � o comportamento que ocorre quando a fila est� VAZIA!
		System.out.println(fila.poll());
		System.out.println(fila.remove());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
	}
}
