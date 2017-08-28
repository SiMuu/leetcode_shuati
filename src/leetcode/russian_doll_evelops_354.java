/**
 * 
 */
package leetcode;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @author sihangjun
 * 上午9:49:48
 */
public class russian_doll_evelops_354 {
	//自定义一个类
	public static class Dot{
		public int w;
		public int h;
		public Dot(int weight,int height){
			w = weight;
			h = height;
		}
	}
	//比较器
	public static  class DotComparator implements Comparator<Dot>{
		@Override
		public int compare(Dot o1, Dot o2) {
			if(o1.w == o2.w){
				if(o1.h == o2.h){
					return 0;
				}else if(o1.h < o2.h){
					return 1;
				}else{
					return -1;
				}
			}else if(o1.w<o2.w){
				return -1;
			}else{
				return 1;
			}
		}
		
	}
	public static int maxEnvelopes(int[][] envelopes) {
		if(envelopes ==null || envelopes.length==0){
			return 0;
		}
		Dot[] dots = new Dot[envelopes.length];
		for(int i=0;i<envelopes.length;i++){
			dots[i] = new Dot(envelopes[i][0],envelopes[i][1]);
		}
		Arrays.sort(dots, new DotComparator());
		int[] ends = new int[envelopes.length];
		ends[0] = dots[0].h;
		int right = 0;
		int l = 0;
		int r = 0;
		int m = 0;
		for(int i=1;i<dots.length;i++){
			l = 0;
			r = right;
			while(r>=l){
				m = (l+r)/2;
				if(dots[i].h>ends[m]){
					l = m+1;
				}else{
					r = m-1;
				}
			}
			right = Math.max(right, l);
			ends[l] = dots[i].h;
		}
		return right+1;
    }
	public static void main(String[] args){
		//int[][] envs = {{5,4},{6,4},{6,7},{2,3}};
		int[][] envs = {{1,1}};
		System.out.println(maxEnvelopes(envs));
	}

}
