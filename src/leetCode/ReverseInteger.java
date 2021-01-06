package leetCode;

import java.math.BigDecimal;
import java.util.ArrayList;

public class ReverseInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int result = reverse(-120);
		
		long a = 0; 
		
		System.out.println("====================================");
		System.out.println(result);
	}

	public static int reverse(int x) {
		String strNum = x + "";
		ArrayList reverseNum = new ArrayList();
		
		String resultNum = "";
		
		boolean isNegative = false;
		
		System.out.println(strNum.charAt(0));
		
		if(strNum.charAt(0) == '-') {
			isNegative = true;
			strNum = strNum.replaceAll("-", "");
		}
		
		for(int i = strNum.length() -1; i >= 0; i--) {
			reverseNum.add(strNum.charAt(i));
		}
		
		for(Object item : reverseNum) {
			resultNum = resultNum + item;
		}
		
		int answer = 0;
		BigDecimal tmpBigD = new BigDecimal(resultNum);
		
		System.out.println(tmpBigD.compareTo(new BigDecimal(Integer.MAX_VALUE)));
		System.out.println(tmpBigD.compareTo(new BigDecimal(Integer.MIN_VALUE)));
		if(tmpBigD.compareTo(new BigDecimal(Integer.MAX_VALUE)) < 0 || tmpBigD.compareTo(new BigDecimal(Integer.MIN_VALUE)) < 0) {
			answer = Integer.parseInt(resultNum);
			if(isNegative)
				answer = answer * -1;
		} else {
			return 0;
		}
	
		return answer;
		
	        
    }
}
