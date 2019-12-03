package coding_pretice;

import java.util.ArrayList;

public class InerstingNum_back_week1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 4자리수 중에서 찾는다. 
	    // 10진수 12진수 16진수 구해서 각각 자리수마다 더한 값이 진수별로 합이 같은 숫자 찾아라.
		
		ArrayList<Integer> result = new ArrayList<Integer>();
		
		// 4자리수 반복 
		for(int i = 1000; i < 10000; i++) {
			int sumTen = 0;
			int sumHex = 0;
			int sumEigth = 0;
			
			// 10진수일때 자리수의 합
			String tmpSum = Integer.toString(i);
			for(int j = 0; j < tmpSum.length(); j++) {
				sumTen += (tmpSum.charAt(j) - '0');
			}
			
			// 16진수일때 자리수의 합
			String tmpNum = Integer.toHexString(i);
			for(int j = 0; j < tmpNum.length(); j++) {
				sumHex += Integer.parseInt(Character.toString(tmpNum.charAt(j)), 16);
			}
			
			// 12진수일떄 자리수의 합 구하기~~
			
			if(sumTen == sumHex) {
				result.add(i);
			}
			
		}
		System.out.println(result);
	}

}
