package BiTree;
public class hasSumPath {
public static boolean hasPathSum(TreeNode root, int sum) {
	if (root == null )
	    return false;
	if (root != null) {
	    sum -= root.val;
	if (root.left == null && root.right == null && sum == 0)
	        return true;
	}
	return hasPathSum(root.right, sum)|| hasPathSum(root.left, sum);
    }
public static void main(String[] args){
	TreeNode node1 = new TreeNode(5);
	TreeNode node2 = new TreeNode(4);
	TreeNode node3 = new TreeNode(8);
	TreeNode node4 = new TreeNode(11);
	TreeNode node5 = new TreeNode(13);
	TreeNode node6 = new TreeNode(4);
	TreeNode node7 = new TreeNode(7);
	TreeNode node8 = new TreeNode(2);
	TreeNode node9 = new TreeNode(1);
	node1.left = node2;
	node1.right = node3;
	node2.left = node4;
	node2.right=null;
	node3.right = node6;
	node3.left = node5;
	node4.left = node7;
	node4.right = node8;
	node5.left=null;
	node5.right=null;
	node6.left=null;
	node6.right=node9;
	node7.left=null;
	node7.right=null;
	node8.left=null;
	node8.right=null;		
	node9.left = null;
	node9.right=null;
	/*TreeNode node1 = new TreeNode(-2);
	TreeNode node2 = new TreeNode(-3);
	node1.left=null;
	node1.right=node2;
	node2.left=null;
	node2.right=null;*/
	boolean res = hasPathSum(node1,22);
	System.out.println(res);
}
}






