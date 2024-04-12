package tp2;

public class ejercicio1 {

    public static boolean estaOrdenado(int[] arr, int index) {
        if (index >= arr.length - 1) {
            return true;
        } else if (arr[index] > arr[index + 1]) {
            return false;
        }
        return estaOrdenado(arr, index + 1);
    }
}
