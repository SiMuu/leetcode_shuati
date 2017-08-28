package String;

import java.util.HashMap;

public class romanToInt {
	public static int getInt(String s){
		HashMap<Character,Integer> map = new HashMap<Character,Integer>();
		map.put('I', 1);
		map.put('V', 5);
		map.put('X',10);
		map.put('L', 50);
		map.put('C', 100);
		map.put('D', 500);
		map.put('M', 1000);
		int ans = 0;
		int preValue = 0;
		for(int i=s.length()-1;i>=0;i--){
			int cValue = map.get(s.charAt(i));
			if(cValue<preValue)
				ans -= cValue;
			else
				ans += cValue;
			preValue = cValue;
		}
		return ans;
	}
	public static void main(String[] args){
		String s = "IVCD";
		int num = getInt(s);
		System.out.println(num);
	}
	
}
