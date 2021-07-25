package bbomee;

import java.util.Arrays;

public class StringSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] wordArray = {"aaad", "abd", "bbb", "aca", "ddd", "abc", "acc"};
		
		Arrays.sort(wordArray);
		
//		for(int i = 0 ; i < wordArray.length; i++) {
//			for(int j = 0; j < wordArray.length-i-1; j++) {
//				if(wordArray[j].compareTo(wordArray[j+1]) > 0) {
//					String temp = wordArray[j];
//					wordArray[j] = wordArray[j+1];
//					wordArray[j+1] = temp;
//				}
//			}
//		}
		
		for(int i = 0 ; i < wordArray.length; i++) {
			System.out.println(wordArray[i]);
		}
		
		
		
	}

}
