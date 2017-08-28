/**
 * 
 */
package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author sihangjun
 * 上午10:26:08
 */
public class Sum3_15 {
public static List<List<Integer>> threeSum(int[] nums) {
	List<List<Integer>> list = new ArrayList<List<Integer>>();
	Arrays.sort(nums);
	for(int i=0;i<nums.length-2;i++){
		if(nums[i]>0) break;
		if( i>0 && (nums[i]==nums[i-1])) continue;
		int j = i+1; 
		int k = nums.length-1;
		while(j<k){
			if(nums[j]+nums[k]+nums[i]==0){
				list.add(Arrays.asList(nums[i],nums[j],nums[k]));
				j++;
				k--;	
				while((j<k && nums[j]==nums[j-1])) j++;
				while((j<k && nums[k]==nums[k+1])) k--;
			}else if(nums[i]+nums[j]+nums[k]>0) k--;
			else j++;
		
		}
	}
	return list;
        
    }
	public static void main(String[] args) {
		List<List<Integer>> list = new ArrayList<List<Integer>>();
		int[] S = {-2,0,0,2,2};
		list = threeSum(S);
		System.out.println(list);
	}

}
