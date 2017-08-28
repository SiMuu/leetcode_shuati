package Arrays;

public class removeDuplicates {
	 public static int removeDuplicates(int[] A) {
		 	if(A.length<=2){
		 		return A.length;
		 	}
		 	int index = 2;
		 	for(int i=2;i<A.length;i++){
		 		if(A[i] != A[index-2]){
		 			A[index++] = A[i];
		 		}
		 	}
	        return index;
	    }
	 public static void main(String[] args){
		 int[] A = {1,1,1,2,2,2};
		 int len = removeDuplicates(A);
		 System.out.println(len);
	 }
}
