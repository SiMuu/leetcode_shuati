package BiTree;

import java.util.Scanner;

public class test {
	public static void main(String[] args) { 
		Scanner in = new Scanner(System.in);
		int numTaix = in.nextInt();
		int [][] indexTaix = new int[2][numTaix];
		for(int i=0;i<2;i++){
			 Scanner inline = new Scanner(System.in);  
		     String line = inline.nextLine();
		     String [] li = line.split(" ");
		     for(int j=0;j<numTaix;j++){
		    	 indexTaix[i][j] = Integer.parseInt(li[j].trim());
		     }
		}
		//输入目标点
		 Scanner inline = new Scanner(System.in);  
	     String line = inline.nextLine();
	     int dx = Integer.parseInt(line.split(" ")[0].trim());
	     int dy =  Integer.parseInt(line.split(" ")[1].trim());
	     //输入走路和打车时间
	     inline = new Scanner(System.in);  
	     line = inline.nextLine();
	     int perWalkTime = Integer.parseInt(line.split(" ")[0].trim());
	     int perTaixTime =  Integer.parseInt(line.split(" ")[1].trim());
	     //
		 int timeWalk = (Math.abs(dx)+Math.abs(dy))*perWalkTime;
		 int minTime = timeWalk;
		 for(int i=0;i<numTaix;i++){
			int allTime = 0;
			allTime = (Math.abs(indexTaix[0][i])+Math.abs(indexTaix[1][i]))*perWalkTime;
			allTime = allTime + (Math.abs(dx-indexTaix[0][i])+Math.abs(dy-indexTaix[1][i]))*perTaixTime;
		    if(allTime<minTime){
		    	minTime = allTime;
		    }
		 } 
		 System.out.println(minTime);
	}
}
