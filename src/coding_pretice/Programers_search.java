package coding_pretice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Programers_search {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int[] answers = {1,2,3,4,5};
		int[] answers = {1,3,2,4,2};
		
		
		
		int[] A = {1,2,3,4,5};
		int[] B = {2,1,2,3,2,4,2,5};
		int[] C = {3,3,1,1,2,2,4,4,5,5};
		
		List<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < 3; i++) list.add(0);
		
		List<Integer> answerList = new ArrayList<Integer>();
		
		for(int i = 0; i < answers.length; i++) {
			if(answers[i] == A[i%5])
				list.set(0, list.get(0)+1);
			if(answers[i] == B[i%8])
				list.set(1, list.get(1)+1);
			if(answers[i] == C[i%10])
				list.set(2, list.get(2)+1);
		}
		
		int max = Collections.max(list);
		
		for(int i = 0; i < list.size(); i++) {
			if(max == list.get(i)) {
				answerList.add(i+1);
			}
		}
		int[] answer = new int[answerList.size()];
		answer[0]++;
		answer[0]++;
		answer[1]++;
		answer[1]++;
		
		for(int i = 0; i < answer.length; i++) {
			answer[i] = answerList.get(i);
		}
		
		
	}

}
