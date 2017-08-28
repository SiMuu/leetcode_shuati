/**
 * 
 */
package leetcode;

import java.util.Stack;

/**
 * @author sihangjun
 * 下午4:02:18
 */
public class valid_Parentheses_20 {
	public static boolean isValid(String s) {
		if(s==null || s.length()==1) return false;
        int i= 0;
        Stack<Character> stack = new Stack<Character>();
        stack.push(s.charAt(i++)); 
        while(i<s.length()){
        	if(!stack.isEmpty()){
        		if(stack.peek()=='(' && s.charAt(i)==')'){
        			stack.pop();
        			i++;
        		}else if(stack.peek()=='[' && s.charAt(i)==']'){
        			stack.pop();
        			i++;
        		}else if(stack.peek()=='{' && s.charAt(i)=='}'){
        			stack.pop();
        			i++;
        		}else{
        			stack.push(s.charAt(i));
        			i++;
        		}
        	}else{
        		stack.push(s.charAt(i));
        		i++;
        	}
        }
        return stack.isEmpty();
    }
	public static void main(String[] args) {
		String x = "{[]}()";
		boolean res = isValid(x);
		System.out.println(res);
	}
}
