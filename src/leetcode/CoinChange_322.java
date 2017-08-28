/**
 * 
 */
package leetcode;

/**
 * @author sihangjun
 * 下午9:13:02
 */
public class CoinChange_322 {
	public static int max_value = 10000000;
    public static int[][] f;
   /* public int solve(int index,int[] conis,int amount){
        if(amount==0) return 0;
        if(amount<0) return max_value;
        if(index>=conis.length) return max_value;
        if(f[index][amount]>0){
            return f[index][amount];
        }
        f[index][amount] = Math.min(solve(index,conis,amount - conis[index])+1,solve(index+1,conis,amount));
        return f[index][amount];
    }
    public int coinChange(int[] coins, int amount) {
        //这边定义了一个10000，指的是最多含有10000个，只是随机定义了一个
        f = new int[coins.length][10000];
        for(int i=0;i<coins.length;i++){
            for(int j =0;j<10000;j++){
                f[i][j] = -1;
            }
        }
        int res = solve(0,coins,amount);
        if(res<max_value){
            return res;
        }else{
            return -1;
        }
    }
    */
    public static int coinChange(int[] coins, int amount) {
        f = new int[coins.length][amount+1];
        if(amount == 0) return 0; 
        f[0][0] = -1;
        for(int i=1;i<=amount;i++){
            if(i%coins[0]==0)
                f[0][i] = i/coins[0];
            else f[0][i] = -1;
        }
        for(int i=1;i<coins.length;i++){
            for(int j=0;j<=amount;j++){
                f[i][j] = f[i-1][j];
                if(j>=coins[i])
                    f[i][j] = Math.min(f[i][j-coins[i]]+1,f[i-1][j]);
            }
        }
        return f[coins.length-1][amount];
    }
    public static void main(String[] args){
    	int[] nums={2,5,10,1};
    	int res = coinChange(nums,27);
    	System.out.println(res);
    }
}
