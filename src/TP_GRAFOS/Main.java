package TP_GRAFOS;

import java.util.List;

public class Main {
	public static void main(String[] args) {
		// Creamos el grafo dirigido
		GrafoDirigido<String> grafo = new GrafoDirigido<>();

		// Agregamos vértices
		grafo.agregarVertice(1);
		grafo.agregarVertice(2);
		grafo.agregarVertice(3);
		grafo.agregarVertice(4);
		grafo.agregarVertice(5);
		grafo.agregarVertice(6);

		// Agregamos los arcos según las adyacencias definidas
		// 1 → [2, 3]
		grafo.agregarArco(1, 2, "a");
		grafo.agregarArco(1, 3, "b");
		// 2 → [5]
		grafo.agregarArco(2, 5, "c");
		grafo.agregarArco(3,6,"w");
		// 3 → [4]
		grafo.agregarArco(3, 4, "d");
		// 4 → [5]
		grafo.agregarArco(4, 5, "e");
		// 5 → [6]
		grafo.agregarArco(5, 6, "f");

		// Instanciamos la clase de recorridos
		Recorridos<String> recorridos = new Recorridos<>();

		// Buscamos el camino más largo desde 1 hasta 6
		List<Integer> caminoMasLargo = recorridos.caminoMasCortoBFS(grafo, 1, 6);

		// Imprimimos el resultado
		System.out.println("El camino más CORTO de 1 a 6 es: " + caminoMasLargo);
	}
}
