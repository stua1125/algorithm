package coding_pretice;

import java.awt.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Vector;


public class IncompleteMaratoner {

	/*
	 * Programmers level 1
	 *
	 */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] participant = {"leo", "kiki", "eden"};
		
		String[] completion = {"kiki", "eden"};
		
		String anwer = solution(participant, completion);
		System.out.println("***");
		System.out.println(anwer);
	}
	
	/*
	 * String[] to ArrayList<String>
	 */
	public static String solution_pre(String[] participant, String[] completion) {
		ArrayList<String> pNewList = new ArrayList<String>(Arrays.asList(participant));
		ArrayList<String> cNewList = new ArrayList<String>(Arrays.asList(completion));
	    
	    for(int i = 0; i < cNewList.size(); i++) {
	    	for(int j = 0; j < pNewList.size(); j++) {
		    	if(cNewList.get(i).equals(pNewList.get(j))) {
		    		pNewList.remove(j);
		    	}
	    	}
	    }
	    
	    if(pNewList.size() > 0) {
	    	return pNewList.get(0);
	    } else {
	    	return "";
	    }
	}
	
	/*
	*	시간초과
	*/
//	public static String solution(String[] participant, String[] completion) {
//		
//	    boolean flag = true;
//	    for(int i = 0; i < participant.length; i++) {
//	    	flag = true;
//	    	for(int j = 0; j < completion.length; j++) {
//		    	if(participant[i].equals(completion[j])) {
//		    		participant[i] = "";
//		    		completion[j] = "";
//		    		flag = false;
//		    		break;
//		    	}
//	    	}
//	    	if(flag == true) {
//	    		return participant[i];
//	    	}
//	    }
//	   return "";
//	}
	
	public static String solution(String[] participant, String[] completion) {
		
		String answer = "";
		
		Arrays.sort(participant);
		Arrays.sort(completion);
		
		for(int i = 0; i < participant.length; i++) {
			if(!participant[i].equals(completion[i])) {
				answer = participant[i];
				break;
			}
		}
		
		return answer;
	}

}
