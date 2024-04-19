package TP_ARBOLES;

public class Tree {

	private TreeNode root;
	
	public Tree() {
		this.root = null;
	}
	
	public void add(Integer value) {
		if (this.root == null)
			this.root = new TreeNode(value);
		else
			this.add(this.root,value);
	}
	
	private void add(TreeNode actual, Integer value) {
		if (actual.getValue() > value) {
			if (actual.getLeft() == null) { 
				TreeNode temp = new TreeNode(value);
				actual.setLeft(temp);
			} else {
				add(actual.getLeft(),value);
			}
		} else if (actual.getValue() < value) {
			if (actual.getRight() == null) { 
				TreeNode temp = new TreeNode(value);
				actual.setRight(temp);
			} else {
				add(actual.getRight(),value);
			}
		}
	}

	public Integer getRoot() {
		return root.getValue();
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
}
