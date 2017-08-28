package BiTree;

import java.util.LinkedList;

public class minDepth {
	public static int GetMinDepth(TreeNode root){
         int depth = 1;
		if(root == null){
			return 0;
		}
		LinkedList <TreeNode> queue= new LinkedList<TreeNode>();
		queue.add(root);
		TreeNode lastNode = root;
		TreeNode nextNode = root.right!=null?root.right:root.left;
		if(root.left==null&& root.right==null){
			return 1;
		}
		while(!queue.isEmpty()){
			TreeNode node = queue.pop();
			if(node.left!=null){
				queue.add(node.left);
			}
			if(node.right!=null){
				queue.add(node.right);
			}
			if(node.left==null && node.right==null){
				depth += 1;
				break;
			}
			if(node==nextNode && nextNode!=null){
				depth += 1;
				nextNode = nextNode.right!=null?nextNode.right:nextNode.left;
			}
		}
		return depth;
	}
	public static void main(String args[]){
		TreeNode node1 = new TreeNode(2);
		TreeNode node2 = new TreeNode(1);
		TreeNode node3 = new TreeNode(3);
		TreeNode node4 = new TreeNode(4);
		node1.right = node2;
		node2.left = null;
		node1.left = null;
		node2.right = null;
		//node3.left = null;
		//node3.right = null;
		//node4.left = null;
		//node4.right = null;
		int min = GetMinDepth(node1);
		System.out.println(min);
		
	}

}
