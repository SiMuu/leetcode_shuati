/**
 * 
 */
package leetcode;

/**
 * @author sihangjun
 * 下午1:15:39
 */
public class water_container {
	public static int waterContainer(int[] water){
		if(water.length<=1 || water == null) return 0;
		int value = 0;
		int l = 1;
		int r = water.length-2;
		int lmax = water[0];
		int rmax = water[water.length-1];
		int idx = 1;
		while(r>=l){
			if(lmax<=rmax){
				value += Math.max(0, lmax-water[l]);
				lmax = Math.max(lmax, water[l++]);
			}else{
				value += Math.max(0, rmax-water[r]);
				rmax = Math.max(rmax, water[r--]);
			}
		}
		return value;
	}
	public static void main(String[] args){
		int[] water = {4,2,3,5};
		System.out.println(waterContainer(water));
	}

}
