package dynamicPrograming;

import java.util.HashSet;
import java.util.Set;

public class WordBreak {
	public static boolean wordBreak(String s, Set<String> dict) {
		int len = s.length();
		boolean[] array  = new boolean[len+1];
		array[0] = true;
		for(int i=1;i<=len;i++){
			for(int j=0;j<i;j++){
				if(array[j] && dict.contains(s.substring(j,i))){
					array[i] = true;
					break;
				}
			}
		}
        return array[len];
    }
	public static void main(String[] args){
		String s = "aaaaaaa";
		Set<String> dict = new HashSet<String>();
		dict.add("aaaa");
		dict.add("aaa");
		//dict.add("be");
		boolean ans = wordBreak(s,dict);
		System.out.println(ans);
	}

}
