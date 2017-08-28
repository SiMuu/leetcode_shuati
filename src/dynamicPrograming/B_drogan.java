package dynamicPrograming;

public class B_drogan {
	public static int minHP1(int map[][]){
		int row = map.length;
		int col = map[0].length;
		int dp[][] = new int[row--][col--];
		//初始化dp[0][0]
		dp[0][0] = -map[0][0] + 1;
		for(int i=1;i<=row;i++){
			dp[i][0] = dp[i-1][0]-map[i][0];
		}
		for(int j=1;j<=col;j++){
			dp[0][j] = dp[0][j-1] - map[0][j-1];
		}
		for(int i=1;i<=row;i++){
			for(int j=1;j<=col;j++){
				dp[i][j] = Math.min(dp[i-1][j], dp[i][j-1]);
			}
		}
		return dp[row][col];
	}
	public static void main(String[] aggs){
		int[][] map = {{-2,-3,3},{-5,-10,1},{0,30,-5}};
		int res = minHP1(map);
		System.out.println(res);
	}

}
