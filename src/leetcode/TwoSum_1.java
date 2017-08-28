package leetcode;

import java.util.Arrays;

/*
 * Given nums = [2, 7, 11, 15], target = 9,
 * Because nums[0] + nums[1] = 2 + 7 = 9,
 * return [0, 1].
 * 
 */
public class TwoSum_1 {
	public static int[] twoSum(int[] nums, int target) {
        int[] res = new int[2];
        for(int i=0;i<nums.length-1;i++){
        	for(int j=i+1;j<nums.length;j++){
        		int sum = nums[i]+nums[j];
        		if(sum == target){
        			res[0] = i;
        			res[1] = j;
        		}
        	}
        }
		return res;
    }
	public static void main(String[] args){
		int[] nums = {3,2,4};
		int[] res = twoSum(nums,6);
		System.out.println(res[0]+" "+res[1]);
	}

}
