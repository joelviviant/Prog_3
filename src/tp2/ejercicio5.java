package tp2;

public class ejercicio5 {

    public static boolean elemetosIguales(int[] arr, int index) {
        if (index == arr.length) {
            return false;
        }
        if (arr[index] == index) {
            return true;
        }
        return elemetosIguales(arr, index + 1);
    }
}
