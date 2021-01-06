package leetCode;

public class PalindromeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		boolean result = isPalindrome(121);
		System.out.println(result);
	}
	
    public static boolean isPalindrome(int x) {
        
    	String beforeString = Integer.toString(x);
    	StringBuffer afterString = new StringBuffer();
    	
    	for(int i = beforeString.length()-1; i >= 0 ; i--) {
    		afterString.append(beforeString.charAt(i));
    	}
    	
    	System.out.println(afterString);

    	if(beforeString.equals(afterString.toString())) {
    		return true;
    	} else {
    		return false;
    	}
    }

}
