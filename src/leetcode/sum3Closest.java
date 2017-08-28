/**
 * 
 */
package leetcode;

import java.util.Arrays;

/**
 * @author sihangjun
 * 下午12:54:29
 */
public class sum3Closest {
	public static int threeSumClosest(int[] nums, int target) {
		Arrays.sort(nums);
		int sum=nums[0]+nums[1]+nums[2];
		int min = Integer.MAX_VALUE; 	
		for(int i=0;i<nums.length-2;i++){
			int j = i+1;
			int k = nums.length-1;
			while(j<k){ 
				if(nums[i]+nums[j]+nums[k]>target){
					if(Math.abs(nums[i]+nums[j]+nums[k]-target)<min){
						sum = nums[i]+nums[j]+nums[k];
						min = Math.abs(nums[i]+nums[j]+nums[k]-target);
					}
					k--;
				}else if(nums[i]+nums[j]+nums[k]<target){
					if(Math.abs(nums[i]+nums[j]+nums[k]-target)<min){
						sum = nums[i]+nums[j]+nums[k];
						min = Math.abs(nums[i]+nums[j]+nums[k]-target);
					}
					j++;
				}else{
					return nums[i]+nums[j]+nums[k];
				}

			}
		}
		return sum;
        
    }
	public static void main(String[] args){
		int[] nums = {1,2,4,8,16,32,64,128};
		int target = 82;
		int res = threeSumClosest(nums,target);
		System.out.println(res);
	}
}
