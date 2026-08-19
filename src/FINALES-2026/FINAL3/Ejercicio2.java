package FINAL3;

import TP_GRAFOS.Arco;
import TP_GRAFOS.Grafo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Ejercicio2 {

    public void caminoEureliano(Grafo grafo, int verticeInicial) {
        Iterator<Integer> t = grafo.obtenerVertices();
        int impar = 0;
        List<Integer> verticesImpares = new ArrayList<>();
        List<Arco> utilizados = new ArrayList<>();
        while (t.hasNext()) {
            int cantidadVecinos = 0;
            int vertice = t.next();
            Iterator<Integer> adyacentes = grafo.obtenerAdyacentes(vertice);
            while (adyacentes.hasNext()) {
                cantidadVecinos++;
                adyacentes.next();
            }
            if (cantidadVecinos % 2 == 1) {
                verticesImpares.add(vertice);
                impar++;
            }
        }
        if (impar == 0) {
            // posible
        } else if (impar == 2) {
            if (verticesImpares.contains(verticeInicial)) {
                boolean posible = recorrido(grafo, verticeInicial, utilizados);
            } else {
                // no posible
            }
        } else {
            // no posible
        }
    }

    public boolean recorrido(Grafo grafo, int verticeInicial, List<Arco> utilizados) {
        // Si ya usamos todos los arcos, pudimos dibujar toda la figura
        if (utilizados.size() == grafo.cantidadArcos()) {
            return true;
        }
        Iterator<Arco> arcos = grafo.obtenerArcos(verticeInicial);
        while (arcos.hasNext()) {
            Arco arco = arcos.next();
            // Si el arco todavía no fue utilizado
            if (!utilizados.contains(arco)) {
                // Lo usamos
                utilizados.add(arco);
                // Continuamos desde el vértice destino
                if (recorrido(grafo, arco.getVerticeDestino(), utilizados)) {
                    return true;
                }
                // Si por este camino no se pudo,
                // deshacemos la elección
                utilizados.remove(arco);
            }
        }
        return false;
    }
}
