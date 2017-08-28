package List;

public class Sort {
	public static ListNode sortList(ListNode head) {
		quickSort(head,null);
        return head;
    }
	public static void quickSort(ListNode head,ListNode tail){
		if(head!=tail){
			ListNode p = partion(head,tail);
			quickSort(head,p);
			quickSort(p.next,tail);
		}
	}
	public static ListNode partion(ListNode h,ListNode t){
		int value = h.val;
		ListNode pre = h;
		ListNode nex = h.next;
		while(nex!=t){
			if(value>nex.val){
				int temp = pre.val;
			}
		}
		return h;
		
	}
	
	public static void main(String[] args) {
		ListNode head = new ListNode(5);
		ListNode head1 = new ListNode(3);
		ListNode head2 = new ListNode(6);
		ListNode head3 = new ListNode(8);
		ListNode head4 = new ListNode(4);
		head.next = head1;
		head1.next = head2;
		head2.next = head3;
		head3.next = head4;
		head4.next = null;
		
		ListNode res = sortList(head);
		while(res != null){
			System.out.print(res.val + " ");
			res = res.next;
		}
		System.out.println();
	}

}
