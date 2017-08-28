package dynamicPrograming;

import java.util.ArrayList;

public class subsets_II {
	 public static ArrayList<ArrayList<Integer>> subsetsWithDup(int[] num) {
			 ArrayList<ArrayList<Integer>> list = new ArrayList<ArrayList<Integer>>();
			 if(num.length==0) return list;
			 if(num.length==1){
				 ArrayList<Integer> li = new ArrayList<Integer>();
				 li.add(num[0]);
				 list.add(li);
				 list.add(new ArrayList<Integer>());
				 return list;
			 }
			 int[] numT = new int[num.length-1];
			 for(int i=0;i<num.length-1;i++){
				 numT[i] = num[i];
			 }
			// list.add(subsetsWithDup(numT));
			 return list;
	    }
	 public static void main(String[] args){
		 
	 }

}
