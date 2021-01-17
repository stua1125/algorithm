package leetCode;

public class ImplementStrStr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int result = strStr("hello", "lo");
		System.out.println(result);
	}

    public static int strStr(String haystack, String needle) {
    	if(needle.equals(" "))
    		return 0;
        return haystack.indexOf(needle);
    }
}
