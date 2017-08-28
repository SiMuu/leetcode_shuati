/**
 * 
 */
package leetcode;
import java.util.HashMap;

/**
 * @author sihangjun
 * 下午12:28:06
 */
public class roman2Integer {
	/*public String intToRoman(int num) {
    String M[] = {"", "M", "MM", "MMM"};
    String C[] = {"", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"};
    String X[] = {"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"};
    String I[] = {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};
    return M[num/1000] + C[(num%1000)/100] + X[(num%100)/10] + I[num%10];
    */
    public static int romanToInt(String s) {
    	if (s == null || s.length() == 0)
    		return -1;
    	HashMap<Character, Integer> map = new HashMap<Character, Integer>();
    	map.put('I', 1);
    	map.put('V', 5);
    	map.put('X', 10);
    	map.put('L', 50);
    	map.put('C', 100);
    	map.put('D', 500);
    	map.put('M', 1000);
        int i=0;
        int res =0;
        while(i<s.length()-1){
        	if(map.get(s.charAt(i))< map.get(s.charAt(i+1))){
        		res -= map.get(s.charAt(i++));
        	}else{
        	res += map.get(s.charAt(i++));
        	}
        }
        res += map.get(s.charAt(s.length()-1));
		return res;
    }
	public static void main(String[] args) {
		int res = romanToInt("MCMXCVI");
		System.out.println(res);
	}
}
