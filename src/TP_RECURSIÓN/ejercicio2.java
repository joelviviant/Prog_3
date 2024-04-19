package TP_RECURSIÓN;

public class ejercicio2 {
    public static boolean buscarElemento(int[]arr, int elemento, int inicio, int fin){
        if(inicio >= fin) {
            return false;
        }
        int medio = (fin + inicio) / 2;
        if(arr[medio] == elemento) {
            return true;
        }
        if(arr[medio] > elemento) {
            return buscarElemento(arr, elemento, inicio, medio-1);
        }
        return buscarElemento(arr, elemento, medio+1, fin);
    }
}
