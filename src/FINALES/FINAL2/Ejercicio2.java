package FINALES.FINAL2;

import javax.swing.tree.TreeNode;
import java.util.ArrayList;
import java.util.List;

public class Ejercicio2 {

    public List<Integer> valoresEnRango(TreeNode raiz, int M , int N){
        List<Integer> resultado = new ArrayList<>();
        inOrderRango(raiz, M,N, resultado);
        return resultado;
    }

    public void inOrderRango(TreeNode nodo, int M, int N, List<Integer> resultado){
        if(nodo == null){
            return;
        }
        if (nodo.getValor()<M){
            inOrderRango(nodo.getIzq,M,N,res);
        }
        if (nodo.getValor()>=M && nodo.getValor <=N){
            res.add(nodo.getValor());
        }
        if (nodo.getValor()<M){
            inOrderRango(nodo.getDer,M,N,res);
        }
    }

}
