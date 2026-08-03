package FINAL2;

import org.w3c.dom.Node;

import javax.swing.tree.TreeNode;
import java.util.ArrayList;
import java.util.List;

public class Ejercicio2 {
    public List<Integer> ejercicio2(int m, int n, TreeNode root) {

        List<Integer> lista = new ArrayList<>();

        recorrer(root.getRaiz(), m, n, lista);

        return lista;
    }

    private void recorrer(Node actual, int m, int n, List<Integer> lista) {
        if(actual == null)
            return;
        if(actual.getValor() > m)
            recorrer(actual.getIzquierdo(), m, n, lista);

        if(actual.getValor() >= m && actual.getValor() <= n)
            lista.add(actual.getValor());

        if(actual.getValor() < n)
            recorrer(actual.getDerecho(), m, n, lista);
    }
}

