/**
 * 
 */
package leetcode;

/**
 * @author sihangjun
 * 上午10:07:18
 * Example1: x = 123, return 321
 * Example2: x = -123, return -321
 */
public class reverse_Integer {
	public static int reverse(int x) {	
		int res = 0;
		int temp = Math.abs(x);
		while(temp>0){
			if(Integer.MAX_VALUE/10<res) return 0;
			res = res*10+temp%10;
			temp = temp/10;
		}
		if(x>0) return res;
		else return -1*res;
        
    }
public static void main(String[] args) {
	int x = 1534236469;
	int res = reverse(x);
	System.out.println(res);
}
}
