package coding_pretice;

import java.util.Arrays;
import java.util.Comparator;

public class Programers_sort2 {

	//가장 큰 수
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numbers = {0, 0, 0};
		String[] num = new String[numbers.length];
		
		for(int i = 0; i < numbers.length; i++) {
			num[i] = numbers[i] + "";
		}
		
		String answer = "";
		
        Arrays.sort(num, new Comparator<String>() {
        	@Override
        	public int compare(String s1, String s2) {
        		return (s2+s1).compareTo(s1+s2);
        	}
        });
        
        if(num[0].equals("0"))
//            return "0"; 0000 일경우 예외처리
        
        for(int i = 0; i < num.length; i++){
            answer += num[i] + "";
        }
        
        System.out.println(answer);
        
//        return answer;
	}

}
