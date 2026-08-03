package FINAL2;

import TP_GRAFOS.Grafo;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Ejercicio4 {
    public List<Integer> caminoMayor(Grafo grafo, int v, int w, int d) {
        if (!grafo.contieneVertice(v) || !grafo.contieneVertice(w)) {
            return null;
        }
        Set<Integer> visitados = new HashSet<>();
        List<Integer> caminoActual = new ArrayList<>();
        return backtracking(grafo, v, w, d, visitados, caminoActual);
    }

    private List<Integer> backtracking(Grafo grafo, int actual, int w, int d, Set<Integer> visitados, List<Integer> caminoActual) {
        visitados.add(actual);
        caminoActual.add(actual);

        if (actual == w && (caminoActual.size() - 1) > d) {
            return new ArrayList<>(caminoActual);
        }

        for (int adyacente : grafo.obtenerAdyacentes(actual)) {
            if (!visitados.contains(adyacente)) {
                List<Integer> resultado = backtracking(grafo, adyacente, w, d, visitados, caminoActual);
                if (resultado != null) {
                    return resultado;
                }
            }
        }

        visitados.remove(actual);
        caminoActual.remove(caminoActual.size() - 1);
        return null;
    }
}