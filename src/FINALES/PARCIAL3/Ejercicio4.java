package FINALES.PARCIAL3;


public class Ejercicio4 {

    public static void mergeSort(int[] arr) {
        if (arr.length <= 1) return;

        int medio = arr.length / 2;

        int[] izquierda = new int[medio];
        int[] derecha = new int[arr.length - medio];

        // copiar elementos
        for (int i = 0; i < medio; i++) {
            izquierda[i] = arr[i];
        }
        for (int i = medio; i < arr.length; i++) {
            derecha[i - medio] = arr[i];
        }
        // llamadas recursivas
        mergeSort(izquierda);
        mergeSort(derecha);
        // fusionar
        merge(arr, izquierda, derecha);
    }

    private static void merge(int[] arr, int[] izq, int[] der) {
        int i = 0, j = 0, k = 0;

        // comparar de MAYOR a MENOR
        while (i < izq.length && j < der.length) {
            if (izq[i] >= der[j]) {
                arr[k++] = izq[i++];
            } else {
                arr[k++] = der[j++];
            }
        }

        // copiar sobrantes
        while (i < izq.length) {
            arr[k++] = izq[i++];
        }

        while (j < der.length) {
            arr[k++] = der[j++];
        }
    }
}
