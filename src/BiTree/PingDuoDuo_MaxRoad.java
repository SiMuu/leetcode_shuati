package BiTree;

import java.util.Scanner;

public class PingDuoDuo_MaxRoad {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);  
        int maxLen = in.nextInt(); 
        in = new Scanner(System.in);  
        int cityNum = in.nextInt();
        int nodeIndex[] = new int[cityNum-1];
        int roadLen[] = new int[cityNum-1];
        int nextIndex[] = new int[cityNum-1];
        //输入数据
        for(int i=0;i<cityNum-1;i++){
        	in = new Scanner(System.in);  
            String line = in.nextLine(); 
            //循环输入
            nodeIndex[i] = Integer.parseInt(line.split(" ")[0]);
            nextIndex[i] = Integer.parseInt(line.split(" ")[1]);
            roadLen[i] = Integer.parseInt(line.split(" ")[2]);
            //System.out.println("nodeIndex:"+nodeIndex[i] +" nextIndex:"+nextIndex[i]+" roadLen: "+roadLen[i]);
        }
        //计算长度
        int len = 0;
        for(int i=0;i<cityNum-1;i++){
        	int temLen[] = new int[(cityNum-1)/2];
        	int temIndex = 0;
        	int max = 0;
        	for(int j=0;j<(cityNum-1)/2;j++){
        		temLen[i] = roadLen[i] + roadLen[cityNum-i-2];        		
        		if(temLen[i]<=maxLen && temLen[i]>max){
        			temIndex = i;
        			max = temLen[i];
        		}
        	}
        	
        }
	}

}
