package FINALES.PARCIAL3;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Ejercicio1A {
    List<Integer> mejorCaminoLargo = new ArrayList<>();


    public void caminoMasLargo(int verticeV, int verticeW, int verticeZ){
        List<Integer> camino = new ArrayList<>();
        Set<Integer> visitados = new HashSet<>();
        int actual= verticeV;
        backtrakingCaminoLargo(actual,verticeW,verticeZ,visitados,camino);
    }

    private void backtrakingCaminoLargo(int actual, int verticeW, int verticeZ, Set<Integer> visitados, List<Integer> camino) {
        //Caso Base
        if (actual == verticeZ) return;
        visitados.add(actual);
        camino.add(actual);
        if (actual==verticeW){
            if (camino.size()> mejorCaminoLargo.size()){
                mejorCaminoLargo = new ArrayList<>(camino);
            }
        }else {
            List<Integer> vecinos= actual.getVecinos();
            for (int v:vecinos){
                if (!visitados.contains(v)) {
                    backtrakingCaminoLargo(v, verticeW, verticeZ, visitados, camino);
                }
            }
        }
        visitados.remove(actual);
        camino.remove(camino.size()-1);
    }



}
