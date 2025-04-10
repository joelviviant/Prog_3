package TP_ARBOLES;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Tree {

    private TreeNode root;

    public Tree() {
        this.root = null;
    }

    public void add(Integer value) {
        if (this.root == null)
            this.root = new TreeNode(value);
        else
            this.add(this.root, value);
    }

    private void add(TreeNode actual, Integer value) {
        if (actual.getValue() > value) {
            if (actual.getLeft() == null) {
                TreeNode temp = new TreeNode(value);
                actual.setLeft(temp);
            } else {
                add(actual.getLeft(), value);
            }
        } else if (actual.getValue() < value) {
            if (actual.getRight() == null) {
                TreeNode temp = new TreeNode(value);
                actual.setRight(temp);
            } else {
                add(actual.getRight(), value);
            }
        }
    }


    public boolean hasElement(Integer value) {
        if (root == null) {
            return false;
        } else {
            return buscarValor(root, value);
        }
    }

    private boolean buscarValor(TreeNode actual, Integer value) {
        if (actual == null) {
            return false;
        } else if (actual.getValue().equals(value)) {
            return true;
        } else if (value < actual.getValue()) {
            return buscarValor(actual.getLeft(), value);
        } else {
            return buscarValor(actual.getRight(), value);
        }
    }

    private boolean isEmpty() {
        return root == null;
    }

    public void insert(Integer value) {
        if (root == null) {
            root = new TreeNode(value);
            return;
        }
        TreeNode actual = root;
        while (true) {
            if (value < actual.getValue()) {
                if (actual.getLeft() == null) {
                    actual.setLeft(new TreeNode(value));
                    return;
                } else {
                    actual = actual.getLeft();
                }
            } else if (value > actual.getValue()) {
                if (actual.getRight() == null) {
                    actual.setRight(new TreeNode(value));
                    return;
                } else {
                    actual = actual.getRight();
                }
            }
        }
    }

    public int getHeight() {
        if (root == null) {
            return 0;
        } else if (root != null && root.getLeft() == null && root.getRight() == null) {
            return 0;
        }
        return calculateHeight(root);
    }

    private int calculateHeight(TreeNode actual) {
        if (actual == null) {
            return -1; // Para que los nodos hoja tengan altura 0
        }

        int leftHeight = calculateHeight(actual.getLeft());
        int rightHeight = calculateHeight(actual.getRight());

        int maxHeight;
        if (leftHeight > rightHeight) {
            maxHeight = leftHeight;
        } else {
            maxHeight = rightHeight;
        }

        return 1 + maxHeight;
    }


    public void printPosOrder(TreeNode root) {
        TreeNode actual = root;
        if (actual == null) {
            return;
        } else {
            printPosOrder(actual.getLeft());
            printPosOrder(actual.getRight());
            System.out.print(actual.getValue());
        }
    }

    public void printPreOrder(TreeNode root) {
        TreeNode actual = root;
        if (actual == null) {
            return;
        } else {
            System.out.print(actual.getValue());
            printPreOrder(actual.getLeft());
            printPreOrder(actual.getRight());
        }
    }

    public void printInOrder(TreeNode root) {
        TreeNode actual = root;
        if (actual == null) {
            return;
        } else {
            printInOrder(actual.getLeft());
            System.out.print(actual.getValue());
            printInOrder(actual.getRight());
        }
    }


    public List<Integer> getLongestBranch(TreeNode node) {
        if (node == null) {
            return new LinkedList<>();
        }

        List<Integer> leftBranch = getLongestBranch(node.getLeft());
        List<Integer> rightBranch = getLongestBranch(node.getRight());

        LinkedList<Integer> longerBranch;

        if (leftBranch.size() > rightBranch.size()) {
            longerBranch = new LinkedList<>(leftBranch);
        } else {
            longerBranch = new LinkedList<>(rightBranch);
        }

        longerBranch.addFirst(node.getValue()); // insertFront!

        return longerBranch;
    }

    public List<Integer> getFrontera(TreeNode node) {
        List<Integer> hojas = new ArrayList<>();
        agregarHojas(node, hojas);
        return hojas;
    }

    private void agregarHojas(TreeNode node, List<Integer> hojas) {
        if (node == null) {
            return;
        }

        if (node.getLeft() == null && node.getRight() == null) {
            hojas.add(node.getValue()); // Es una hoja
        } else {
            agregarHojas(node.getLeft(), hojas);   // Recorre izquierda
            agregarHojas(node.getRight(), hojas);  // Recorre derecha
        }
    }


    public int getMaxElem(TreeNode node) {
        if (node == null) {
            throw new IllegalArgumentException("El árbol está vacío");
        }

        if (node.getRight() != null) {
            return getMaxElem(node.getRight()); // seguir bajando por la derecha
        } else {
            return node.getValue(); // el último nodo a la derecha es el máximo
        }
    }

    public List<Integer> getElemAtLevel(TreeNode node, int nivel) {
        List<Integer> elementos = new ArrayList<>();
        agregarElementosEnNivel(node, nivel, 0, elementos);
        return elementos;
    }

    private void agregarElementosEnNivel(TreeNode node, int nivelBuscado, int nivelActual, List<Integer> lista) {
        if (node == null) {
            return;
        }

        if (nivelActual == nivelBuscado) {
            lista.add(node.getValue());
        } else {
            agregarElementosEnNivel(node.getLeft(), nivelBuscado, nivelActual + 1, lista);
            agregarElementosEnNivel(node.getRight(), nivelBuscado, nivelActual + 1, lista);
        }
    }



}


