package greedy;

public class gas_station {
	public static int canCompleteCircurit(int[] gas,int[] cost){
		if(gas==null || cost==null || gas.length!=cost.length)	
			return -1;
		int start = gas.length-1;
		int end = start;
		int res_gas = 0;
		while(start>=0){
			res_gas += gas[start] - cost[start];
			while(res_gas>=0){
				end++;
				if(end==gas.length){
					end = 0;
				}
				res_gas += gas[end] - cost[end];
				if(end==start && res_gas>=0){
					return start;
				}
			}
			start--;
		}
		return -1;
	}
	public static void main(String[] args){
		int[] gas = {2,4};
		int[] cost = {3,4};
		int res = canCompleteCircurit(gas,cost);
		System.out.println(res);
	}

}
