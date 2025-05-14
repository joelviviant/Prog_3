package TP_GRAFOS;

import java.util.*;

public class GrafoDirigido<T> implements Grafo<T> {
	private Map<Integer, Map<Integer, T>> adyacencias;

	public GrafoDirigido() {
		this.adyacencias = new HashMap<>();
	}
	@Override
	public void agregarVertice(int verticeId) {
		adyacencias.putIfAbsent(verticeId, new HashMap<>());
	}

	@Override
	public void borrarVertice(int verticeId) {
		adyacencias.remove(verticeId);
	}

	@Override
	public void agregarArco(int verticeId1, int verticeId2, T etiqueta) {
		this.adyacencias.putIfAbsent(verticeId1, new HashMap<>());
		this.adyacencias.get(verticeId1).put(verticeId2, etiqueta);
	}

	@Override
	public void borrarArco(int verticeId1, int verticeId2) {
	this.adyacencias.get(verticeId1).remove(verticeId2);
	}
 	@Override
	public boolean contieneVertice(int verticeId) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean existeArco(int verticeId1, int verticeId2) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Arco<T> obtenerArco(int verticeId1, int verticeId2) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int cantidadVertices() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int cantidadArcos() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Iterator<Integer> obtenerVertices() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Iterator<Integer> obtenerAdyacentes(int verticeId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Iterator<Arco<T>> obtenerArcos() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Iterator<Arco<T>> obtenerArcos(int verticeId) {
		// TODO Auto-generated method stub
		return null;
	}

}
