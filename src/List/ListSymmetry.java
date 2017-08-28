package List;
public class ListSymmetry {
	public static boolean Symmetry(ListNode head){
		//若为空或者只有一个节点则返回正确
		if(head == null && null == head.next){
			return true;
		}
		ListNode lastNode = head;
		ListNode midNode = head;
		int i=1;
		while(lastNode.next!=null && lastNode.next.next != null){
			i++;
			lastNode = lastNode.next.next;
			midNode = midNode.next;
		}
		if(midNode.val != midNode.next.val){
			return false;
		}
		ListNode nextNode = midNode.next;
		ListNode preNode = head;
		for(int j=i-1;j>1;j--){
			preNode = preNode.next;
			nextNode = nextNode.next;
			if(preNode.val != nextNode.val){
				return false;
			}
		}
		return true;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
				ListNode node = new ListNode(1);  
		        ListNode nextnode = new ListNode(2);  
		        ListNode node3 = new ListNode(3);  
		        ListNode node4 = new ListNode(3); 
		        ListNode node5 = new ListNode(2);  
		        ListNode node6 = new ListNode(1);  
		        node.next = nextnode;  
		        nextnode.next = node3;  
		        node3.next = node4;  
		        node4.next = node5;
		        node5.next = node6;
		        node6.next = null;
		        boolean ans = Symmetry(node);
		        System.out.println(ans);
	}

}
