package leetCode;

public class LengthOfLastWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "Hello Wo rld";
		String s2 = " ";
		String s3 = "b   a    ";
		
		int result = lengthOfLastWord(s3);
		System.out.println(result);
	}
	
	public static int lengthOfLastWord(String s) {
		
		while(s.length() > 0 && s.charAt(s.length()-1) == ' ') {
			s = s.substring(0, s.length()-1);
		}
		
		int lastBlank = 0;
		for(int i = 0; i < s.length(); i++) {
			if(s.charAt(i) == ' ') {
				lastBlank = i + 1;
			}
		}
		return s.length() - lastBlank;
	}

}
