package dynamicPrograming;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class subsets_I {
	public static ArrayList<ArrayList<Integer>> subsetsWithDup(int[] num) {
		ArrayList<ArrayList<Integer>> list = new ArrayList<ArrayList<Integer>>();
		Arrays.sort(num);
		Set<List<Integer>> res = new HashSet<List<Integer>>();
		int len = num.length;
		for(int i=0;i<len;i++){
			List<Integer> temp = new ArrayList<Integer>();
			for(int j=0;j<len;j++){
				
			}
		}
		return list;
    }
	public static void main(String[] args){
		
	}

}
