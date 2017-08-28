package BiTree;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Stack;

public class postorderTraversal {
	public static ArrayList<Integer> postorderTraversal(TreeNode root) {
		ArrayList<Integer> array = new ArrayList<Integer>();
		Stack<TreeNode> Tstack = new Stack<TreeNode>();
		Stack<TreeNode> Ostack = new Stack<TreeNode>();
		if(root == null) return array;
		TreeNode node  = root;
		while(node!=null || Tstack.size()>0){
			if(node!=null){
				Tstack.push(node);
				Ostack.push(node);
				node = node.right;
			}else{
				node = Tstack.pop();
				node = node.left;
			}		
		}
		while(!Ostack.isEmpty()){
			array.add(Ostack.pop().val);
		}		
		return array;
	}

	public static void main(String[] args) {
		ArrayList<Integer> li = new ArrayList<Integer>();
		TreeNode node1 = new TreeNode(2);
		TreeNode node2 = new TreeNode(1);
		TreeNode node3 = new TreeNode(3);
		TreeNode node4 = new TreeNode(4);
		node1.right = node2;
		node2.left = node3;
		node1.left = node4;
		li = postorderTraversal(node1);
		Iterator<Integer> iter = li.iterator();
		while (iter.hasNext()) {
			System.out.println(iter.next());
		}
	}
}
