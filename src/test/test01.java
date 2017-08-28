/**
 * 
 */
package test;

import java.util.HashMap;
import java.util.Map;

/**
 * @author sihangjun
 * 上午10:55:02
 */
public class test01 {
	public static int lengthOfLongestSubstring(String s) {
		char[] c = s.toCharArray();
		Map<Character,Integer> map = new HashMap<Character,Integer>();
		int max = 0;
		for(int i=0,j=0;i<c.length;i++){
			if(map.containsKey(c[i])){
				j = Math.max(map.get(c[i])+1, j);
				//j = map.get(c[i])+1;
			}
			map.put(c[i], i);
			max = Math.max(max, i-j+1); 
		}
		return max;
	}
	public static void main(String[] args){
		int res = lengthOfLongestSubstring("ddgffddfg#d");
		System.out.println(res);
	}

}
