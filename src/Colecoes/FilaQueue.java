package Colecoes;

import java.util.LinkedList;
import java.util.Queue;

public class FilaQueue {

	public static void main(String[] args) {
		//Queue - Fila
		Queue<String> fila = new LinkedList<>();
		//add - retorna Exception erro se não couber mais item na lista.
		//offer - retorna FALSE se não couber mais item na lista.
		fila.add("Ana");
		fila.offer("Bia");
		fila.add("Carlos");
		fila.offer("Daniel");
		fila.add("Rafaela");
		fila.offer("Gui");
		
		//peek e element pegam o primeiro da fila.
		//a diferença: se a fila estiver vazia.
		//peek return null e element return Exception erro
		System.out.println(fila.peek());
		System.out.println(fila.peek());
		System.out.println(fila.element());
		
		//fila.size() - Qtde de elementos na fila.
		System.out.println(fila.size());
		
		//fila.clear() - Limpa a fila.
		//fila.isEmpty() - verifica se a fila está vazia.
		//fila.pool() - retira o elemento na fila e retorna null se fila vazia.
		//fila.remove() - retira o elemento na fila e retorna Exception erro se fila estiver vazia.
		System.out.println(fila.poll());
		System.out.println(fila.remove());
		System.out.println();
		for (String f : fila) {
			System.out.println(f);
		}
		
		//fila.contains(...) - verifica se conteúdo existe na fila
		
	}

}
