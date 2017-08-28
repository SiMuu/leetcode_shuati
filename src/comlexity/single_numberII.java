package comlexity;

import java.util.Arrays;

public class single_numberII {
	public static int singleNumber(int[] A) {
		/*Arrays.sort(A);
		for(int i= 0;i<A.length-3;i+=3)
		{ 
			if(A[i] != A[i+1] && A[i+1]==A[i+2]) 
				return A[i]; 
		}
      return A[A.length-1];*/
		int ones = 0;//记录只出现过1次的bits        
		int twos = 0;//记录只出现过2次的bits        
		int threes;
		for(int i = 0; i < A.length; i++){
			int t = A[i];
			twos |= ones&t;//要在更新ones前面更新twos  
			//System.out.println(twos|(ones&t));
			ones ^= t;
			threes = ones&twos;//ones和twos中都为1即出现了3次            
			ones &= ~threes;//抹去出现了3次的bits            
			twos &= ~threes;
			}
		return ones;
		}

	public static void main(String[] args){
		int []A = {12,32,35,12,12,35,35};
		int num = singleNumber(A);
		System.out.println(num);
	}
}
