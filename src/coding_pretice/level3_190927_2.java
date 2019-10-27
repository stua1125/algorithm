package coding_pretice;

import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Queue;

// 프로그래머스 코딩테스트 1번 문제
public class level3_190927_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
//	    public int solution(int[] goods, int[] boxes){
//	        int answer = 0;
//	        return answer;
//	    }
		
		int answer = 0;
			
		int[] boxes = {3, 8, 6};
		int[] goods = {5, 6, 4};
		
		PriorityQueue<Integer> boxesQue = new PriorityQueue<>();
		PriorityQueue<Integer> goodsQue = new PriorityQueue<>();
		
		for(int i=0; i < boxes.length; i++) {
			boxesQue.add(boxes[i]);
		}
		for(int i=0; i < goods.length; i++) {
			goodsQue.add(goods[i]);
		}

		
//		while(!boxesQue.isEmpty()) {
//			int tmpBox = boxesQue.poll();
//			while(!goodsQue.isEmpty()) {
//				int tmpGoods = goodsQue.poll(); 
//				if(tmpBox >= tmpGoods) {
//					answer++;
//					break;
//				}
//			}
//		}
		
		while(!goodsQue.isEmpty()) {
			int tmpGoods = goodsQue.poll(); 
			while(!boxesQue.isEmpty()) {
				int tmpBox = boxesQue.poll();
				if(tmpBox >= tmpGoods) {
					answer++;
					break;
				}
			}
		}
		
		System.out.println("정답 :" + answer);

	}

}
