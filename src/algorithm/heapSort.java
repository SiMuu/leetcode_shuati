/**
 * 
 */
package algorithm;

/**
 * @author sihangjun
 * 下午5:05:22
 * 
 * 1.构建最大堆
 * 2.选择顶，并与第0位置元素交换
 * 3.重新调整堆，重复2
 * 
 */
public class heapSort {
	
	public static void main(String[] args){
		int[] array = {0, 6, 8, 7, 9, 5, 4, 3, 2, 1, 0, -1, -3, -2 };  
        //System.out.println("Before heap:");  
		 heapsort(array);
		 System.out.println(array[3]);
	}
	public static void Shift(int[] array,int low,int high){
		int i= low;
		int j=2*i;
		int temp = array[i];
		while(j<=high){
			if(j<high && array[j]<array[j+1])  //若右孩子较大，则把j指向右孩子
				++j;
			if(temp<array[j]){
				array[i] = array[j];     //将Array[j]调整到双亲节点的位置上
				i= j;
				j = 2*i;
			}else{
				break;
			}
		}
		array[i] = temp;
	}
	public static void heapsort(int[] array){
		if(array==null || array.length<=1){
			return;
		}
		int i;
		int temp;
		int n = array.length/2;
		for(i=n/2;i>=1;i--){
			Shift(array,i,n);
		}
		for(i=n;i>=2;--i){
			temp = array[1];
			array[1] = array[i];
			array[i] = temp;
			Shift(array,1,i-1);
		}
	}
	
	
}
