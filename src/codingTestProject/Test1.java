package codingTestProject;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * 
		 */
		
		String a = "acbcbba";
		
		int[] array = new int[26];
		int result = 0;
		
		for(int i = 0; i<a.length(); i++) {
			char tmp = (char) a.charAt(i);
			System.out.println(tmp - '0');
			System.out.println(tmp - '0' -49);
			array[tmp - '0' -49]++;
		}
		
		for(int i = 0; i<array.length; i++) {
			if(array[i] % 2 != 0) {
				result++;
			}
		}
		
		System.out.println(result);
		
	}

}
