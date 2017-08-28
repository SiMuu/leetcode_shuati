package dynamicPrograming;

import java.util.Arrays;

public class candy {
	public static int minCandy(int ratings[]){
		if(ratings.length==0 || ratings==null){
			return 0;
		}
		int[] count = new int[ratings.length];
		Arrays.fill(count,1); //初始都给一颗 
		int sum = 0;
		for(int i=1;i<ratings.length;i++){
			if(ratings[i]>ratings[i-1]){
				count[i] = count[i-1]+1;
			}
		}
		for(int j =ratings.length-1;j>0;j--){
			sum += count[j];
			if(ratings[j]<ratings[j-1] && count[j]>=count[j-1]){
				count[j-1] = count[j]+1;
			}
		}
		sum += count[0];
		return sum;
	}
	public static void main(String[] args){
		
	}

}
