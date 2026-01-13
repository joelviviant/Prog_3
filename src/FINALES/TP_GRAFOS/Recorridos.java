package TP_GRAFOS;

import java.util.*;

public class Recorridos<T> {
    public <T> void dfs(Grafo<T> grafo, int verticeInicial) {
        Set<Integer> visitados = new HashSet<>();
        dfsRecursivo(grafo, verticeInicial, visitados);
    }

    private <T>void dfsRecursivo(Grafo<T> grafo, int actual, Set<Integer> visitados) {
        if (visitados.contains(actual))
            return;
        visitados.add(actual);
        System.out.println(actual);
        Iterator<Integer> adyacentes = grafo.obtenerAdyacentes(actual);
        while (adyacentes.hasNext()) {
            int vecino = adyacentes.next();
            dfsRecursivo(grafo, vecino, visitados);
        }
    }

    public void bfs(Grafo<T> grafo, int verticeInicial) {
        Set<Integer> visitados = new HashSet<>();
        Queue<Integer> cola = new LinkedList<>();
        cola.add(verticeInicial);
        visitados.add(verticeInicial);
        while (!cola.isEmpty()) {
            int actual = cola.poll();
            System.out.println("Visitando (BFS): " + actual);

            Iterator<Integer> adyacentes = grafo.obtenerAdyacentes(actual);
            while (adyacentes.hasNext()) {
                int vecino = adyacentes.next();
                if (!visitados.contains(vecino)) {
                    visitados.add(vecino);
                    cola.add(vecino);
                }
            }
        }
    }


    public <T> boolean tieneCiclo(Grafo<T> grafo) {
        Set<Integer> visitados = new HashSet<>();
        Set<Integer> enCamino = new HashSet<>();
        for (Iterator<Integer> it = grafo.obtenerVertices(); it.hasNext(); ) {
            int vertice = it.next();
            if (!visitados.contains(vertice)) {
                if (dfsCiclo(grafo, vertice, visitados, enCamino)) {
                    return true; // ciclo encontrado
                }
            }
        }
        return false;
    }

    private <T> boolean dfsCiclo(Grafo<T> grafo, int actual, Set<Integer> visitados, Set<Integer> enCamino) {
        visitados.add(actual);
        enCamino.add(actual);
        Iterator<Integer> adyacentes = grafo.obtenerAdyacentes(actual);
        while (adyacentes.hasNext()) {
            int vecino = adyacentes.next();
            if (enCamino.contains(vecino)) {
                System.out.println("Ciclo encontrado: " + enCamino);
                return true; // ciclo detectado
            }
            if (!visitados.contains(vecino)) {
                if (dfsCiclo(grafo, vecino, visitados, enCamino)) {
                    return true;
                }
            }
        }
        enCamino.remove(actual); // terminamos con este nodo
        return false;
    }


        public List<Integer> caminoMasLargo(Grafo<?> grafo, int origen, int destino) {
            List<Integer> caminoActual = new ArrayList<>();
            List<Integer> mejorCamino = new ArrayList<>();
            Set<Integer> visitados = new HashSet<>();
            dfsMasLargo(grafo, origen, destino, caminoActual, mejorCamino, visitados);
            return mejorCamino;
        }

        private void dfsMasLargo(Grafo<?> grafo, int actual, int destino,List<Integer> caminoActual,List<Integer> mejorCamino,
                                 Set<Integer> visitados) {
            caminoActual.add(actual);
            visitados.add(actual);
            if (actual == destino) {
                if (caminoActual.size() > mejorCamino.size()) {
                    mejorCamino.clear();
                    mejorCamino.addAll(new ArrayList<>(caminoActual));
                }
            } else {
                Iterator<Integer> it = grafo.obtenerAdyacentes(actual);
                while (it.hasNext()) {
                    int vecino = it.next();
                    if (!visitados.contains(vecino)) {
                        dfsMasLargo(grafo, vecino, destino, caminoActual, mejorCamino, visitados);
                    }
                }
            }
            caminoActual.remove(caminoActual.size() - 1);
            visitados.remove(actual);
        }


    public List<Integer> caminoMasCortoBFS(Grafo<?> grafo, int origen, int destino) {
        Queue<Integer> queue = new LinkedList<>();
        Map<Integer, Integer> padres = new HashMap<>();
        Set<Integer> visitados = new HashSet<>();

        queue.add(origen);
        visitados.add(origen);
        padres.put(origen, null);

        while (!queue.isEmpty()) {
            int actual = queue.poll();

            if (actual == destino) {
                // Reconstruir camino desde destino hasta origen
                List<Integer> camino = new LinkedList<>();
                Integer paso = destino;
                while (paso != null) {
                    camino.add(0, paso);  // agregar al inicio para invertir orden
                    paso = padres.get(paso);
                }
                return camino;
            }

            Iterator<Integer> adyacentes = grafo.obtenerAdyacentes(actual);
            while (adyacentes.hasNext()) {
                int vecino = adyacentes.next();
                if (!visitados.contains(vecino)) {
                    visitados.add(vecino);
                    padres.put(vecino, actual);
                    queue.add(vecino);
                }
            }
        }

        // No hay camino
        return new ArrayList<>();
    }

    public Set<Integer> verticesQueLleganAG(Grafo<?> grafo, int destino) {
        Set<Integer> resultado = new HashSet<>();
        Queue<Integer> cola = new LinkedList<>();
        cola.add(destino);
        while (!cola.isEmpty()) {
            int actual = cola.poll();
            Iterator<Integer> vertices = grafo.obtenerVertices();
            while (vertices.hasNext()) {
                int vertice = vertices.next();
                Iterator<Integer> adyacentes = grafo.obtenerAdyacentes(vertice);
                while (adyacentes.hasNext()) {
                    int ady = adyacentes.next();
                    if (ady == actual && !resultado.contains(vertice)) {
                        resultado.add(vertice);
                        cola.add(vertice);
                    }
                }
            }
        }
        return resultado;
    }


    public List<List<String>> buscarCaminos(Grafo<String> grafo, String origen, String destino) {
        List<List<String>> caminos = new ArrayList<>();
        Set<String> visitados = new HashSet<>();
        List<String> caminoActual = new ArrayList<>();

        dfs(grafo, origen, destino, visitados, caminoActual, caminos);
        return caminos;
    }

    private void dfs(Grafo<String> grafo, String actual, String destino,
                     Set<String> visitados, List<String> caminoActual,
                     List<List<String>> caminos) {

        visitados.add(actual);
        caminoActual.add(actual);
        if (actual.equals(destino)) {
            caminos.add(new ArrayList<>(caminoActual));
        } else {
            Iterator<Integer> adyacentes = grafo.obtenerAdyacentes(Integer.parseInt(actual));
            while (adyacentes.hasNext()) {
                String vecino = String.valueOf(adyacentes.next());
                // ⚠️ Evitamos el tramo cortado
                if ((actual.equals("Las Flores") && vecino.equals("Rauch")) ||
                        (actual.equals("Rauch") && vecino.equals("Las Flores"))) {
                    continue;
                }
                if (!visitados.contains(vecino)) {
                    dfs(grafo, vecino, destino, visitados, caminoActual, caminos);
                }
            }
        }
        visitados.remove(actual);
        caminoActual.remove(caminoActual.size() - 1);
    }



}


