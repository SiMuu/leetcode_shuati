/**
 * 
 */
/**
 * @author sihangjun
 *
 */
package dynamicPrograming;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class wordBreakII{
	public static ArrayList<String> wordBreak(String s, Set<String> dict) {
        ArrayList<String> list = new ArrayList<String>();
        
		return list; 
    }
	public static void main(String args[]){
		String s = "catsanddog";
		Set<String> dict = new HashSet<String>();
		ArrayList<String> list = new ArrayList<String>();
		dict.add("cat");
		dict.add("cats");
		dict.add("and");
		dict.add("sand");
		dict.add("dog");
		list = wordBreak(s,dict);
		
	}
}