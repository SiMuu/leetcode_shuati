/**
 * 
 */
package leetcode;

/**
 * @author sihangjun
 * 下午2:23:09
 * Input: "babad"
 * Output: "bab"
 * Note: "aba" is also a valid answer.
 * 查找最长回文子字符串
 */
public class longest_palindromic_05 {
	//动态规划
public static String longestPalindrome(String s) {
	if(s.length()==0){
		return "";
	}
	if(s.length()==1){
		return s;
	}
	int maxlen = 0;
	String res = null;
	boolean[][] dp = new boolean[s.length()][s.length()];
	for(int i=s.length()-1;i>=0;i--){
		for(int j=i;j<s.length();j++){
			if(s.charAt(i)==s.charAt(j) && (j-i<=2 || dp[i+1][j-1])){
				dp[i][j] = true;
				if(maxlen<j-i+1){
					maxlen = j-i+1;
					res = s.substring(i,j+1);
				}
			}
		}
	}
	return res;
        
    }
public static void main(String[] args){
	String s = "abbad";
	String res = longestPalindrome(s);
	System.out.println(res);
}

}
