package FINALES.FINAL3;

import java.util.ArrayList;
import java.util.List;

public class Ejercicio5 {

    public List<List<Integer>> combinaciones(int N, int V){

        List<List<Integer>> res = new ArrayList<>();
        backtrack(1, N, V, 0, new ArrayList<>(), res);
        return res;
    }

    private void backtrack(int start, int N, int V,
                           int suma,
                           List<Integer> actual,
                           List<List<Integer>> res){

        if(suma == V){
            res.add(new ArrayList<>(actual));
            return;
        }

        if(suma > V){
            return; // PODA
        }

        for(int i = start; i <= N; i++){

            actual.add(i);

            backtrack(i, N, V, suma + i, actual, res);

            actual.remove(actual.size()-1);
        }
    }

}
