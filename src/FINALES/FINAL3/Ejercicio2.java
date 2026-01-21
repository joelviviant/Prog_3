package FINALES.FINAL3;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Ejercicio2 {


    public void generarPermutaciones(int[] numeros) {
        List<Integer> camino = new ArrayList<>();
        Set<Integer> usados = new HashSet<>();
        backtracking(numeros, camino, usados);
    }

    private void backtracking(int[] numeros, List<Integer> camino, Set<Integer> usados) {
        if (camino.size() == numeros.length) {
            return;
        }
        for (int n: numeros){
            if (!usados.contains(n)) {
                usados.add(n);
                camino.add(n);
                backtracking(numeros, camino, usados);
            }
        }
        int ultimo = camino.remove(camino.size() - 1);
        usados.remove(ultimo);
    }


}
