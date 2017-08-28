/**
 * 
 */
package leetcode;

/**
 * @author sihangjun
 * 上午10:30:36
 */
import java.util.Arrays;
import java.util.Comparator;

public class test {
public static void main(String args[]){
        Integer[] arr={1,2,3,4,5,6};
        Arrays.sort(arr, new Comparator<Object>(){
            public int compare(Object arg0,Object arg1){
                Integer a=(Integer)arg0;
                Integer b=(Integer)arg1;
                int temp=Integer.compare(a,b);
                return -temp;
            }
        });
        for(int a: arr){
            System.out.println(a+"\t");
        }
    }
}
