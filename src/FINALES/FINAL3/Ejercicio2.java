package FINALES.FINAL3;

import java.util.HashSet;

public class Ejercicio2 {

    public boolean sePuedeDibujar(TP_GRAFOS.Grafo grafo) {

        if (!esConexo(grafo)) {
            return false;
        }

        int impares = 0;

        for (Vertice v : grafo.getVertices()) {
            if (v.getVecinos().size() % 2 != 0) {
                impares++;
            }
        }

        return impares == 0 || impares == 2;
    }


    private boolean esConexo(TP_GRAFOS.Grafo grafo) {

        Set<Vertice> visitados = new HashSet<>();
        dfs(grafo.getVertices().get(0), visitados);

        return visitados.size() == grafo.getVertices().size();
    }

    private void dfs(Vertice v, Set<Vertice> visitados) {
        visitados.add(v);

        for (Vertice vecino : v.getVecinos()) {
            if (!visitados.contains(vecino)) {
                dfs(vecino, visitados);
            }
        }
    }


}
