package FINALES.FINAL1;

import java.util.ArrayList;
import java.util.List;

public class Ejercicio2 {

    public void resolver(List<Integer> lista) {
        int sumaTotal = 0;
        for (int n : lista) {
            sumaTotal += n;
        }

        if (sumaTotal % 3 != 0) {
            System.out.println("NO ES COMPATIBLE");
            return;
        }

        int objetivo = sumaTotal / 3;

        backtracking(lista, 0,
                new ArrayList<>(), new ArrayList<>(), new ArrayList<>(),
                0, 0, 0, objetivo);
    }

    private void backtracking(List<Integer> lista, int index,
                              List<Integer> s1, List<Integer> s2, List<Integer> s3,
                              int suma1, int suma2, int suma3, int objetivo) {

        // Caso base
        if (index == lista.size()) {
            if (suma1 == objetivo && suma2 == objetivo && suma3 == objetivo) {
                System.out.println("Solución encontrada:");
                System.out.println(s1);
                System.out.println(s2);
                System.out.println(s3);
            }
            return;
        }

        int valor = lista.get(index);

        // Probar en subconjunto 1
        if (suma1 + valor <= objetivo) {
            s1.add(valor);
            backtracking(lista, index + 1, s1, s2, s3,
                    suma1 + valor, suma2, suma3, objetivo);
            s1.remove(s1.size() - 1);
        }

        // Probar en subconjunto 2
        if (suma2 + valor <= objetivo) {
            s2.add(valor);
            backtracking(lista, index + 1, s1, s2, s3,
                    suma1, suma2 + valor, suma3, objetivo);
            s2.remove(s2.size() - 1);
        }

        // Probar en subconjunto 3
        if (suma3 + valor <= objetivo) {
            s3.add(valor);
            backtracking(lista, index + 1, s1, s2, s3,
                    suma1, suma2, suma3 + valor, objetivo);
            s3.remove(s3.size() - 1);
        }
    }
}
