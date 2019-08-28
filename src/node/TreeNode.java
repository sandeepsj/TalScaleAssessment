package node;

public class TreeNode {
	public int length = 1;
	public TreeNode left = null;
	public TreeNode right = null;
	public int data;
	public TreeNode(int d){
		this.data = d;
	}
	public void insertAtLeft(TreeNode root, int d) {
		root.length++;
		TreeNode n = new TreeNode(d); 
		this.left = n;
	}
	public void insertAtRight(TreeNode root, int d) {
		root.length++;
		TreeNode n = new TreeNode(d); 
		this.right = n;
	}
}
