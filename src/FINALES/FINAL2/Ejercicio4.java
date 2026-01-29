package FINALES.FINAL2;

import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;

public class Ejercicio4 {

    public List<Integer> recorrerNodo(int d, int v,int w){
        List<Integer> camino = new LinkedList<>();
        List<Integer> visitados = new LinkedList<>();
        List<Integer> resultado = backtracking(d,v,w,camino,visitados,0);
        return resultado;
    }

    private List<Integer> backtracking(int d, int actual, int w,
                                       List<Integer> camino,
                                       List<Integer> visitados,
                                       int longitudActual) {

        visitados.add(actual);
        camino.add(actual);

        // CASO SOLUCIÓN
        if (actual == w && longitudActual > d) {
            return new LinkedList<>(camino); // copia
        }

        // OBTENER VECINOS
        List<Integer> vecinos = grafo.getVecinos(actual);

        for (Integer vecino : vecinos) {
            if (!visitados.contains(vecino)) {
                List<Integer> res = backtracking(
                        d,
                        vecino,
                        w,
                        camino,
                        visitados,
                        longitudActual + 1
                );

                if (res != null) {
                    return res; // corto apenas encuentro uno
                }
            }
        }

        // BACKTRACKING
        visitados.remove(visitados.size() - 1);
        camino.remove(camino.size() - 1);

        return null;
    }


}
