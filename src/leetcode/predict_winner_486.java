/**
 * 
 */
package leetcode;

/**
 * @author sihangjun
 * 下午8:11:33
 */
public class predict_winner_486 {
	public static int[][] dp;
	public final static int MIN_VALUE = -100000;
	public static int solve(int[] nums,int start,int end){
		if(dp[start][end]==MIN_VALUE){
			if(start==end) return nums[start];
			else
				return Math.max(nums[start]-solve(nums,start+1,end), nums[end]-solve(nums,start,end-1));
			}
		return dp[start][end];
	}
	public static boolean PredictTheWinner(int[] nums){
		int n = nums.length;
		if(nums==null || n==1 ||n ==0) return true;
		dp = new int[n][n];
		for(int i=0;i<n;i++){
			for(int j=0;j<n;j++){
				dp[i][j] = MIN_VALUE;
			}
		}
		return solve(nums,0,n-1)>0?true:false;
	}
	public static void main(String[] args){
		int[] nums ={1,5,233,7};
		System.out.println(PredictTheWinner(nums));
		
	}

}
