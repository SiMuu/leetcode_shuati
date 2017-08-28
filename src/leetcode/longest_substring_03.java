/**
 * 
 */
package leetcode;

import java.util.HashMap;

/**
 * @author sihangjun
 * 下午10:20:53
 */
public class longest_substring_03 {
//传统方法	 
public static int lengthOfLongestSubstring(String s) {
	    char[] c = s.toCharArray();
	    HashMap <Character,Integer> map = new HashMap<Character,Integer>();
	    int maxlen = 0;
	    for(int i=0,j=0;i<c.length;i++){
	    	if(map.containsKey(c[i])){
	    		j = Math.max(j, map.get(c[i])+1);
	    	}
	    	map.put(c[i], i);
	    	maxlen = Math.max(maxlen, i-j+1);
	    }
        return maxlen;
    }
//动态规划
/*	
	public static int lengthOfLongestSubstring(String s) {
		
		return 0;
	}
*/
public static void main(String[] args){
	
	int res = lengthOfLongestSubstring("ddgffddfg#d");
	System.out.println(res);

}

}
