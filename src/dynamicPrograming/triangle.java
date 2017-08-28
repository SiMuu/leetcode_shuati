package dynamicPrograming;

import java.util.ArrayList;

//动态规划，求最小路径和
public class triangle {
	public static int minimumTotal(ArrayList<ArrayList<Integer>> triangle) {
		int len = triangle.size();
		int[] minArray = new int[len];
		ArrayList<Integer> temp = triangle.get(len-1);
		for(int i=0;i<len;i++){
			minArray[i] = temp.get(i);
		}
		for(int i=1;i<len;i++){
			temp = triangle.get(len-i-1);
			for(int j=0;j<=len-i-1;j++){
				minArray[j] = Math.min(minArray[j], minArray[j+1])+temp.get(j);	
			}
		}
        return  minArray[0];
    }
	public static void main(String args[]){
		ArrayList<ArrayList<Integer>> triangle = new ArrayList<ArrayList<Integer>>();
		ArrayList<Integer> numb = new ArrayList<Integer>();
		numb.add(2);
		triangle.add(numb);
		//numb.clear();
		ArrayList<Integer> numb1 = new ArrayList<Integer>();
		numb1.add(3);
		numb1.add(4);
		triangle.add(numb1);
		//numb.clear();
		ArrayList<Integer> numb2 = new ArrayList<Integer>();
		numb2.add(6);
		numb2.add(5);
		numb2.add(7);
		triangle.add(numb2);
		ArrayList<Integer> numb3 = new ArrayList<Integer>();
		numb3.add(4);
		numb3.add(1);
		numb3.add(8);
		numb3.add(3);
		triangle.add(numb3);
		int ans = minimumTotal(triangle);
		System.out.println(ans);
	}
}
