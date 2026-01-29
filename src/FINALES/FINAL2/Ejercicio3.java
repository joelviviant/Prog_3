package FINALES.FINAL2;

import java.util.HashMap;

public class Ejercicio3 {

    public int recolectarOro(int[][] mina) {
        int filas = mina.length;
        int cols = mina[0].length;
        boolean[][] visitado = new boolean[filas][cols];
        int maxOro = 0;

        // puedo empezar desde cualquier celda con oro
        for (int f = 0; f < filas; f++) {
            for (int c = 0; c < cols; c++) {
                if (mina[f][c] > 0) {
                    maxOro = Math.max(maxOro,
                            backtracking(mina, visitado, f, c, 0));
                }
            }
        }
        return maxOro;
    }

    private int backtracking(int[][] mina, boolean[][] visitado,
                             int fila, int col, int oroActual) {

        // marco y recolecto
        visitado[fila][col] = true;
        oroActual += mina[fila][col];

        int max = oroActual;

        // movimientos: arriba, abajo, izquierda, derecha
        int[] df = {-1, 1, 0, 0};
        int[] dc = {0, 0, -1, 1};

        for (int k = 0; k < 4; k++) {
            int nf = fila + df[k];
            int nc = col + dc[k];

            if (esValido(mina, visitado, nf, nc)) {
                max = Math.max(max,
                        backtracking(mina, visitado, nf, nc, oroActual));
            }
        }

        // desmarco (BACKTRACKING)
        visitado[fila][col] = false;

        return max;
    }

    private boolean esValido(int[][] mina, boolean[][] visitado,int f, int c) {
        return f >= 0 && f < mina.length &&
                c >= 0 && c < mina[0].length &&
                !visitado[f][c] &&
                mina[f][c] > 0;
    }




}
