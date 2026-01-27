package FINALES.FINAL1;

import org.w3c.dom.Node;

import java.util.*;

public class Ejercicio3 {
    public int caminoCorto (List<Integer> esquinas, Node v, Node w) {
        List<Node> cola = new ArrayList<Node>();
        Set<Node> visitados = new HashSet<>();
        Map<Node, Node> padre = new HashMap<>();

        cola.add(v);
        visitados.add(v);
        Node actual = null;

        while (!cola.isEmpty()) {
            actual = cola.remove(0);
            if (actual == w){
                break;
            }
            List<Node> vecinos = actual.getVecinos();
            for (Node vecino : vecinos) {
                if(!visitados.contains(vecino)) {
                    visitados.add(vecino);
                    padre.put(vecino, actual);
                    cola.add(vecino);
                }
            }
        }

        List<Node> camino = new ArrayList<>();
        Node a = w;

        while (a != null) {
            camino.add(a);
            a = padre.get(a);
        }

        Collections.reverse(camino);

        int largo = (camino.size()-1)*100;
        System.out.println(camino);
        return largo;
    }

}
