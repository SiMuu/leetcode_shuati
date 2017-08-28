/**
 * 
 */
package leetcode;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @author sihangjun
 * 上午10:45:59
 */
public class max_subarray_53 {
	public static int[][] res;
    public static int sum(int idx1,int idx2,int[] nums){
        int sum = 0;
        if(idx1>=idx2) return sum;
        for(int i = idx1;i<=idx2;i++){
            sum += nums[i];
        }
        return sum;
    }
    public static int maxSubArray(int[] nums) {
        if(nums.length == 1) return nums[0];
   
        res = new int[nums.length-1][nums.length];
        for(int i=0;i<nums.length;i++){
            res[0][i] = sum(0,i,nums);
        }
        for(int i=1;i<nums.length-1;i++){
            for(int j=i+1;j<nums.length;j++){
                res[i][j] = sum(i,j,nums);
                res[i][j] = Math.max(res[i-1][j-1],res[i][j]);
                res[i][j] = Math.max(res[i-1][j],res[i][j]);
            }
        }
        return res[nums.length-2][nums.length-1];
    }
    
    public static void main(String[] args){
    	int[] nums = {-2,1};
    	int res = maxSubArray(nums);
    	System.out.println(res);
    }

}
