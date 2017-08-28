package String;

public class lengthOfLastWord {
	public static int lengthOfLastWord(String s) {
        if(s==null || s ==" "||s.length()==0){
            return 0;
        }
        int len=0;
        s = s.trim();
        for(int i=s.length()-1;i>=0;i--){
            if(s.charAt(i)!= ' '){
                len++;
            }
            else{
            	break;
            }
        }
        return len;
    }
	public static void main(String[] args){
		String s = "a ";
		int len = lengthOfLastWord(s);
		System.out.println(len);
	}

}
