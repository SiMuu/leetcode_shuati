/**
 * 
 */
package leetcode;

/**
 * @author sihangjun
 * 上午10:08:20
 */
public class mergeTwoLists_23 {
	public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if(l1==null || l2==null) return l1==null?l2:l1;
        ListNode head = new ListNode(0);
        ListNode l3 = head;
        while(l1!=null && l2!=null){
            if(l1.val<l2.val){
                l3.next = l1;    
                l1 = l1.next;
            }else{
                l3.next = l2;
                l2 = l2.next;
            }
            l3 = l3.next;
        }
        if(l1==null || l2==null){
            l3.next = l1==null?l2:l1;
        }
        return head.next;
    }
	public static void main(String[] args){
		ListNode l1 = new ListNode(5);
		ListNode l2 = new ListNode(1);
		ListNode n1 = new ListNode(2);
		ListNode n2 = new ListNode(4);
		l2.next = n1;
		l2 = l2.next;
		l2.next = n2;

		l1 = mergeTwoLists(l1,l2);
		while(l1!=null){
			System.out.println(l1.val);
			l1 = l1.next;
		}
	}

}
