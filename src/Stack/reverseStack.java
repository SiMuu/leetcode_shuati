/**
 * 
 */
/**
 * @author sihangjun
 *
 */
package Stack;
import java.util.Stack;
public class reverseStack {
	//移除栈底元素，并返回
	public static int getReverse(Stack<Integer> stack) {
		int res = stack.pop();
		if (stack.isEmpty()) {
			return res;
		} else {
			int last = getReverse(stack);
			stack.push(res);
			return last;
		}
	}
	//递归逆置元素
	public static void reverse(Stack<Integer> stack){
		if(stack.isEmpty()){
			return;
		}
		int i = getReverse(stack);
		reverse(stack);
		stack.push(i);
	}

	public static void main(String args[]) {
		Stack<Integer> stack = new Stack<Integer>();
		stack.push(1);
		stack.push(2);
		stack.push(3);
		stack.push(4);
		reverse(stack);
		System.out.println("After-------");
		//System.out.println(last);
		while (!stack.isEmpty()) {
			System.out.println(stack.pop());
		}
	}
}