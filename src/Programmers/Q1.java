package Programmers;

import java.util.Arrays;

public class Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] lottos = {3, 3, 3, 3, 3, 3};
		int[] win_nums = {31, 10, 45, 1, 6, 19};
		solution(lottos, win_nums);
	}
	
	public static int[] solution(int[] lottos, int[] win_nums) {
                        
        Arrays.sort(lottos);
        Arrays.sort(win_nums);
        
        int matCount = 0;
        int zeroCount = 0;
        
        for(int i = 0; i < lottos.length; i++) {
        	if(lottos[i] == 0) {
        		zeroCount++;
        	} else {
        		for(int j = 0; j < win_nums.length; j++) {
        			if(lottos[i] == win_nums[j]) {
        				matCount++;
        				break;
        			}
        		}
        	}
        }
               
        int highScore = 7 - (matCount + zeroCount);
        int rowScore = 7 - matCount;
        
        if(rowScore == 7) {
        	rowScore = 6;
        }
        
        System.out.println(matCount);
        System.out.println(zeroCount);
        System.out.println(highScore);
        System.out.println(rowScore);
        int[] answer = {highScore, rowScore};
        return answer;
    }

}
