package FINALES.FINAL1;

import org.w3c.dom.Node;

import javax.swing.tree.TreeNode;

public class Ejercicio4 {

    public boolean existeCamino(TreeNode raiz, int D) {
        return dfs(raiz, 0, D);
    }

    private boolean dfs(TreeNode actual, int suma, int D) {
        if (actual == null) return false;

        suma += actual.valor;

        // si es hoja
        if (actual.izq == null && actual.der == null) {
            return suma == D;
        }

        return dfs(actual.izq, suma, D) || dfs(actual.der, suma, D);
    }

}
