package BiTree;

import java.util.LinkedList;
import java.util.Queue;


class TreeLinkNode {
	int val;
	TreeLinkNode left, right, next;

	TreeLinkNode(int x) {
		val = x;
	}
}

public class connectright {
	public static void connect(TreeLinkNode root) {
		if (root != null) {
			root.next = null;
			Queue<TreeLinkNode> stack = new LinkedList<TreeLinkNode>();
			stack.add(root);
			TreeLinkNode indexNode = root;
			TreeLinkNode lastNode = root;
			while (!stack.isEmpty()) {
				TreeLinkNode node = stack.poll();	
				if(node.left!=null){
					stack.add(node.left);
					lastNode = node.left;
				}
				if(node.right!=null){
					stack.add(node.right);
					lastNode = node.right;
				}
				if (node.equals(indexNode)) {
					node.next = null;
					indexNode = lastNode;
				} else {
					node.next = stack.peek();
				}
			}
		}
	}

	public static void main(String[] args) {
		TreeLinkNode node1 = new TreeLinkNode(1);
		TreeLinkNode node2 = new TreeLinkNode(2);
		TreeLinkNode node3 = new TreeLinkNode(3);
		node1.right = node3;
		node1.left = node2;
		node1.next = null;
		node2.left = null;
		node2.right = null;
		node2.next =null;
		node3.left = null;
		node3.right = null;
		node3.next = null;
		connect(node1);
		System.out.println(node1.left.next.val);
		
	}
}
