package Arrays;

public class best_buy_sell_III {
	static public  int maxProfit(int[] prices) {
		if(prices.length<=1) return 0;
		int maxleft =0;
		int summax = 0;
		for(int i=0;i<prices.length-1;i++){
			maxleft = 0;
			for(int j=i+1;j<prices.length;j++){
				if(prices[j]-prices[i]>0){
					maxleft = Math.max(maxleft, (prices[j]-prices[i]));
				}
				if(j<prices.length-2){
					int max = 0;
					int lmin = prices[j+1];
					for(int k=j+1;k<prices.length;k++){
						if(prices[k]<lmin){
							lmin = prices[k];
						}
						max = Math.max(max, prices[k]-lmin);
					}
					summax = Math.max(summax, max+maxleft);
				}else{
					summax = Math.max(summax, maxleft);;
				}
			}
		}
       return summax; 
    }
	public static void main(String[] args){
		int[] prices = {1};
		int res = maxProfit(prices);
		System.out.println(res);
	}
}
