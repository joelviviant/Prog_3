package FINALES.FINAL2;

import java.util.ArrayList;
import java.util.List;

public class Ejercicio3 {

    public void Piramide(){

        int N = 6;
        int[][] piramide = new int[N][N];
        List<Integer> usados = new ArrayList<>();
        int colActual=0;
        int max =200;
        backtracking(piramide,usados,colActual,N,max);
    }

    private int[][] backtracking(int[][] piramide, List<Integer> usados, int colActual, int n, int max) {
        //CASO BASE
        if (colActual == n){
             calcularPiramide(piramide,n);
             return piramide;
        }

        //PROBAR CON NUMEROS EN LA BASE
        piramide[5][colActual] = (int) Math.random();
        if (piramide[5][colActual]<200 && usados.contains(piramide[5][colActual])){
            backtracking(piramide,usados,colActual+1,n,max);
        }
        piramide[5][colActual] = 0;
        usados.remove(piramide[5][colActual]);
        return piramide;
    }

    private void calcularPiramide(int[][] piramide, int n){
        for (int fila = n -2; fila >= 0; fila--) {
            for (int col = 0; col <= n-fila-2; col++) {
                piramide[fila][col] = piramide[fila+1][col] + piramide[fila+1][col+1];
            }
        }
    }

}
