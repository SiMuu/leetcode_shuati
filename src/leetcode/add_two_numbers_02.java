package leetcode;
/*
 * @author sihangjun
 * 下午11:06:46
 * 
 * Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
 * Output: 7 -> 0 -> 8
 * 
 */

public class add_two_numbers_02 {
	public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		return process(l1,l2,0);
    }
	public static ListNode process(ListNode l1,ListNode l2,int jinwei){
		if(l1==null && l2 == null){
			return jinwei==0?null : new ListNode(jinwei);
		}
		if(l1==null && l2!=null){
			//如果l1为空补0
			l1 = new ListNode(0);
		}
		if(l2==null && l1!=null){
			//入伙l2为空补0
			l2 = new ListNode(0);
		}
		int sum  = l1.val + l2.val + jinwei;
		ListNode node = new ListNode(sum%10);
		node.next = process(l1.next,l2.next,sum/10);
		return node;
		
	}
	public static void main(String[] args){
		ListNode l1 = new ListNode(2);
		l1.next = new ListNode(4);
		l1.next.next = new ListNode(3);
		ListNode l2 = new ListNode(5);
		l2.next = new ListNode(6);
		l2.next.next = new ListNode(4);
		ListNode res = addTwoNumbers(l1,l2);
		System.out.println(res.val + " " + res.next.val+" "+ res.next.next.val);
	}


}
