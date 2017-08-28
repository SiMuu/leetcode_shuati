package List;
/*
 * 链表逆置
 */
class ListNode{
	int val;
	ListNode next;
	ListNode(int x){
		val = x;
		next = null;
	}
}
public class ReverseList {
	public static ListNode Reverse(ListNode head){
			if(head == null && null == head.next){
				return head;
			}
			ListNode nextNode = head.next;
			head.next = null;  //尾置空
			while(nextNode!=null){
				ListNode tempNode = nextNode.next;
				nextNode.next = head;
				head = nextNode;
				nextNode = tempNode;
			}
			return head;
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode node = new ListNode(1);  
        ListNode nextnode = new ListNode(2);  
        ListNode node3 = new ListNode(3);  
        ListNode node4 = new ListNode(4);    
        ListNode node5 = new ListNode(5);    
        node.next = nextnode;  
        nextnode.next = node3;  
        node3.next = node4;  
        node4.next = node5;  
        node5.next = null;  
           
        ListNode newHead = Reverse(node);  
        while(newHead.next != null)  
        {  
            System.out.println(newHead.val);  
            newHead = newHead.next;  
        }  
        System.out.println(newHead.val);  
    }  


	}

