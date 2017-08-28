package Arrays;

import java.util.HashSet;

public class longestConsecutive {
	public static int getLongestConsecutive(int[] num){
		if(num==null || num.length==0){
			return 0;
		}
		HashSet <Integer> map = new HashSet<Integer>();
		int max =1;
		for(int n:num){
			map.add(n);
		}
		while(map.iterator().hasNext()){
			int n = map.iterator().next();
			int count = 1;
			int temp = n;
			while(map.contains(temp-1)){
				count++;
				map.remove(temp-1);
				temp--;
			}
			temp = n;
			while(map.contains(temp+1)){
				count++;
				map.remove(temp+1);
				temp++;
			}
			map.remove(n);
			max = Math.max(max, count);
			
		}
		return max;
	}
	public static void main(String[] args){
		int[] num = {100,4,200,1,3,2}; 
		int len = getLongestConsecutive(num);
		System.out.println(len);
	}

		
}
