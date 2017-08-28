/**
 * 
 */
package leetcode;

/**
 * @author sihangjun 下午9:16:14
 */
public class zig_Zag_06 {
	public static String convert(String s, int numRows) {
		if (s.length()==1 || numRows == 1 || s.length()==0) {
			return s;
		}
		int len = s.length();
		String res = null;
		res = s.substring(0,1);
		for(int i= 0; i<numRows ;i++){
			int deta = 2*i;
			int j = i;
			while(j<len){
				if(deta!=0)
					res = res+s.charAt(j);
				j = j + 2*numRows - 2-deta;
				deta = 2*numRows - 2-deta;
			}
		}
		return res;
	}

	public static void main(String[] args) {
		String s = "AB";
		String res = convert(s, 1);
		System.out.println(res);
	}
}
