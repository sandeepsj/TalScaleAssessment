package bstTalScale;
import node.*;

public class BstPair {
	static boolean flag = false;
	public static void main(String args[]) {
		TreeNode root1 = new TreeNode(8);
		root1.insertAtLeft(root1,5);
		root1.insertAtRight(root1,9);
		root1.left.insertAtLeft(root1,3);
		root1.left.insertAtRight(root1,6);
		TreeNode root2 = new TreeNode(7);
		root2.insertAtLeft(root2,3);
		root2.left.insertAtLeft(root2,1);
		root2.left.insertAtRight(root2,5);
		int sum = 16;
		if(root1.length<root2.length)
			traverse(root1,root2,sum);
		else
			traverse(root2,root1,sum);
		if(!flag)
			System.out.println("no pairs found");
	}
	public static void traverse(TreeNode root1, TreeNode root2, int sum) {
		if(!flag && root1!=null) {
			findPair(root1,root2,sum);
			traverse(root1.left,root2,sum);
			traverse(root1.right,root2,sum);
		}
	}
	public static void findPair(TreeNode root1, TreeNode root2, int sum) {
		if(flag == true)
			return;
		if(root2 != null) {
			if(root1.data + root2.data == sum) {
				System.out.println(root1.data+" "+root2.data);
				flag = true;
			}
			else if(sum - root1.data < root2.data) 
				findPair(root1,root2.left,sum);
			else if(sum - root1.data > root2.data)
				findPair(root1,root2.right,sum);
		}
	}
}
