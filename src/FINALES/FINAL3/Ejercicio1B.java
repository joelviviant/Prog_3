package FINALES.FINAL3;

import java.util.*;

public class Ejercicio1B {

    public void caminoCorto(int verticeV, int verticeW, int verticeZ){
        List<Integer> cola = new ArrayList<Integer>();
        Set<Integer> visitados = new HashSet<Integer>();
        Map<Integer,Integer> padre =  new HashMap<>();

        if (verticeV == verticeZ)return;
        cola.add(verticeV);
        visitados.add(verticeV);
        padre.put(verticeV, null);

        while (!cola.isEmpty()){
            int actual = cola.remove(0);
            if (actual == verticeW){
                break;
            }
            List<Integer> vecinos = actual.getVecinos();
            for (int v:vecinos){
                if(!visitados.contains(v)&&v!=verticeZ){
                    visitados.add(v);
                    padre.put(v, actual);
                    cola.add(v);
                }
            }

        }
        if (!padre.containsKey(verticeW)) return;

        List<Integer> camino = new ArrayList<>();
        Integer actual = verticeW;
        while (actual != null){
            camino.add(actual);
            actual = padre.get(actual);
        }
        Collections.reverse(camino);

    }

}
