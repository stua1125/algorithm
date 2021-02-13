package leetCode;

public class divideTwoIntegers {
	
	/*
	 * integer range 
	 * –2,147,483,648 ~ 2,147,483,647
	 * 2147483647
	 */
	
	public static void main(String[] args) {
		int a = -4;
		int b = -1;
		
		System.out.println(divide(a,b) );
	}
	
    public static int divide(int dividend, int divisor) {
    	
    	int resultDivide = 0;
    	boolean isNegative = false;
    	
    	if(dividend == -2147483648 && divisor == -1) {
    		return 2147483647;
    	}
    	
    	if(dividend < 0 && divisor > 0
		|| dividend > 0 && divisor < 0) {
    		isNegative = true;
    	}
    	
    	dividend = Math.abs(dividend);
    	divisor = Math.abs(divisor);
    	
    	while(dividend - divisor >= 0) {
    		dividend -= divisor;
    		resultDivide++;
    	}
    	
    	if(isNegative)
    		resultDivide = resultDivide * -1;

    	return resultDivide;
    }

}
