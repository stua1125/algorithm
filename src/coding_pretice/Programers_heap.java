package coding_pretice;

import java.util.PriorityQueue;

public class Programers_heap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		int[] scoville = {1, 2, 3, 9, 10, 12};
		int[] scoville = {2, 5};
		int K = 7;
		int answer = 0;
		
		PriorityQueue<Integer> que = new PriorityQueue<>();
		for(int i = 0; i < scoville.length; i++) {
			que.add(scoville[i]);
		}
		
//        if(que.size() == 1){
//            if(que.peek() < K)
//                return -1;
//        }
		
		while(true) {
			int first =  que.poll();
			if( first < K) {
				if(que.size() > 0) {
					int tmp = first + (que.poll() * 2);
					que.add(tmp);
					answer++;
				} else {
					answer = -1;
					break;
				}
			} 
			else {
				break;
			}
		}
		
		System.out.println("gkdl");
//		return answer;
	}

}
