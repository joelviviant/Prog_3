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
		return this.adyacencias.containsKey(verticeId);
	}

	@Override
	public boolean existeArco(int verticeId1, int verticeId2) {
		return this.adyacencias.get(verticeId1).containsKey(verticeId2);
	}

	@Override
	public Arco<T> obtenerArco(int verticeId1, int verticeId2) {
		if (this.existeArco(verticeId1, verticeId2)) {
			return new Arco<>(verticeId1, verticeId2, this.adyacencias.get(verticeId1).get(verticeId2));
		}
		return null;
	}

	@Override
	public int cantidadVertices() {
		return this.adyacencias.size();
	}

	@Override
	public int cantidadArcos() {
		int cantidad = 0;
		for (Map<Integer, T> vecinos : adyacencias.values()) {
			cantidad += vecinos.size();
		}
		return cantidad;
	}

	@Override
	public Iterator<Integer> obtenerVertices() {
		return this.adyacencias.keySet().iterator();
	}

	@Override
	public Iterator<Integer> obtenerAdyacentes(int verticeId) {
		return this.adyacencias.get(verticeId).keySet().iterator();
	}

	@Override
	public Iterator<Arco<T>> obtenerArcos() {
		List<Arco<T>> arcos = new ArrayList<>();
		for (Map.Entry<Integer, Map<Integer, T>> entrada : adyacencias.entrySet()) {
			Integer origen = entrada.getKey();
			Map<Integer, T> destinos = entrada.getValue();
			for (Map.Entry<Integer, T> destino : destinos.entrySet()) {
				arcos.add(new Arco<>(origen, destino.getKey(), destino.getValue()));
			}
		}
		return arcos.iterator();
	}

	@Override
	public Iterator<Arco<T>> obtenerArcos(int verticeId) {
		List<Arco<T>> arcos = new ArrayList<>();
		if (this.contieneVertice(verticeId)) {
			Map<Integer, T> adyacentes = this.adyacencias.get(verticeId);
			for (Map.Entry<Integer, T> adyacente : adyacentes.entrySet()) {
				arcos.add(new Arco<>(verticeId, adyacente.getKey(), adyacente.getValue()));
			}
		}
		return arcos.iterator();
	}

}
