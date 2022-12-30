package colecoes;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {

	public static void main(String[] args) {
		
		Queue<String> fila = new LinkedList<>();
		
		//Offer e Add -> adicionam elementos na fila
		//Diferença é o comportamento quando a fila está CHEIA!
		fila.add("Ana"); //lança uma exceção caso a fila esteja cheia
		fila.offer("Bia"); //retorna false caso a fila esteja cheia
		fila.add("Carlos");
		fila.offer("Daniel");
		fila.add("Rafaela");
		fila.offer("Gui");
		
		// Peek e Element -> obter o próximo elemento da fila (sem remover)
		//Diferença é o comportamento que ocorre quando a fila está VAZIA!
		System.out.println(fila.peek()); //retorna false
		System.out.println(fila.peek());
		System.out.println(fila.element()); //lança uma exceção
		System.out.println(fila.element());
		
		//Pool e Remove -> obter o próximo elemento da fila e remove
		//Diferença é o comportamento que ocorre quando a fila está VAZIA!
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
