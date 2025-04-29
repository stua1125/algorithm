package leetCode;

public class SymmetricTree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TreeNode inputTree = new TreeNode();
	}

	public boolean isSymmetric(TreeNode root) {

		return false;
	}

	

}

class TreeNode {
	int val;
	TreeNode left;
	TreeNode right;

	TreeNode() {
	}

	TreeNode(int val) {
		this.val = val;
	}

	TreeNode(int val, TreeNode left, TreeNode right) {
		this.val = val;
		this.left = left;
		this.right = right;
	}
}