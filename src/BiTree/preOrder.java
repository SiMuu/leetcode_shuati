package BiTree;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Stack;

public class preOrder {
	public static ArrayList<Integer> preorder(TreeNode root){
		ArrayList<Integer> list = new ArrayList<Integer>();
		if(root!=null){
			Stack<TreeNode> stack = new Stack<TreeNode>();
			stack.add(root);
			while(!stack.isEmpty()){
				TreeNode node = stack.pop();
				list.add(node.val);
				if(node.right!=null){
					stack.push(node.right);
				}
				if(node.left!=null){
					node = stack.push(node.left);
				}
			}		
		}	
		return list;
	}
	public static void main(String args[]){
		ArrayList<Integer> li = new ArrayList<Integer>();
		TreeNode node1 = new TreeNode(2);
		TreeNode node2 = new TreeNode(1);
		TreeNode node3 = new TreeNode(3);
		TreeNode node4 = new TreeNode(4);
		node1.right = node2;
		node2.left = node3;
		node1.left = node4;
		li = preorder(node1);
		if(li!=null){
			Iterator it  = li.iterator();
			while(it.hasNext()){
				System.out.println(it.next());
			}
		}
	}

}
