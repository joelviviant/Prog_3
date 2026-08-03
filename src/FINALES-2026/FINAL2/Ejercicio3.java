package FINAL2;

public class Ejercicio3{

    boolean[][] visitados;
    int mejorOro =0;
    int[][] mina;
    public int minar(int[][] mina){
        this.mina = mina;
        visitados = new boolean[mina.length][mina[0].length];
        for(int i=0; i<mina.length; i++){
            for(int j=0; j<mina[0].length; j++){
                if(mina[i][j] >= 1){
                    backtraking(i, j, 0);
                }
            }
        }
        return mejorOro;
    }

    void backtraking(int fila, int columna, int oroActual){
        visitados[fila][columna] = true;

        oroActual += mina[fila][columna];

        if(oroActual > mejorOro){
            mejorOro = oroActual;
        }

        if(fila > 0 && !visitados[fila-1][columna] && mina[fila-1][columna] >= 1){
            backtraking(fila-1, columna, oroActual);
        }

        if(columna > 0 && !visitados[fila][columna-1] && mina[fila][columna-1] >= 1){
            backtraking(fila, columna-1, oroActual);
        }

        if(fila < mina.length-1 && !visitados[fila+1][columna] && mina[fila+1][columna] >= 1){
            backtraking(fila+1, columna, oroActual);
        }

        if(columna < mina[0].length-1 && !visitados[fila][columna+1] && mina[fila][columna+1] >= 1){
            backtraking(fila, columna+1, oroActual);
        }

        visitados[fila][columna] = false;
    }
}
