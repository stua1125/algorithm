package coding_pretice;

import java.util.Arrays;
import java.util.Comparator;

//프로그래머스 H-Index
public class Programers_sort3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] citations = {5, 5, 5, 5, 5};	
		
        Arrays.sort(citations);
        
        int[] reverseArray = new int[citations.length];
        int reverIndex = citations.length-1;
        
        for(int i = 0; i < citations.length; i++) {
        	reverseArray[reverIndex] = citations[i];
        	reverIndex--;
        }
        
        for(int i = 0; i < reverseArray.length; i++) {
        	if(i+1 >= reverseArray[i]) {
        		System.out.println(reverseArray[i]);
        		return ;
        	}
        }
        
//        int mid = (int) Math.floor(citations.length/2);
        
//        System.out.println(mid);
//        System.out.println(citations[mid]);
        
//        return answer;
	}

}
