package NaPa;

import java.text.DecimalFormat;

public class NaPa1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String T = "41.0";
        
		System.out.println(solution(T));
		
		
	}
	
	public static String solution(String T) {
        // write your code in Java SE 8
		
		double convertDoubleValue = Double.parseDouble(T);
		
        System.out.println(convertDoubleValue);

        if(convertDoubleValue < 35) {
        	return "hypothermia";
        } else if(35 <= convertDoubleValue && convertDoubleValue <= 37.5) {
        	return "normal";
        } else if(37.5 < convertDoubleValue && convertDoubleValue <= 40) {
        	return "fever";
        } else {
        	return "hyperpyrexia";
        }
        
    }
}
