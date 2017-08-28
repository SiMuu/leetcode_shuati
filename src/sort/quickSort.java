package sort;

public class quickSort {
	public static void main(String[] args){
		int[] a = {12,30,5,6,24,4,112,-5};
		int start = 0;
		int end = a.length-1;
		sort(a,start,end);
		for(int i:a){
			System.out.println(i);
		}
	}
	public static void sort(int[] a,int low,int high){
		int start = low;
		int end = high;
		int key = a[low];
		
		while(end>start){
			//从后往前比较
			while(end>start&&a[end]>=key){
				end--;
			}
			if(a[end]<=key){  //交换位置
				int temp = a[end];
				a[end] = a[start];
				a[start] = temp;
			}
			//从前往后比较
			while(end>start &&a[start]<key)
				start++;
			if(a[start]>=key){
				int temp = a[start];
				a[start] = a[end];
				a[end] = temp;
			}
			//递归
			if(start>low) sort(a,low,start-1);
			if(end<high) sort(a,end+1,high);
		}
	}

}
