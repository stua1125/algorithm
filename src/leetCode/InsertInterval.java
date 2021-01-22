package leetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class InsertInterval {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int[][] intervals = {{1,2},{3,5},{6,7},{8,10},{12,13}};
//		int[] newInterval = {4,8};
//		int[][] intervals = {{1,5},{6,9}};
//		int[] newInterval = {2,5};
//		int[][] intervals = {{0,1},{5,5},{6,7},{9,10}};
//		int[] newInterval = {12,21};
//		int[][] intervals = {{1,5}};
//		int[] newInterval = {0,0};
//		int[][] intervals = {{0,0}, {1, 4}, {6, 8}, {9, 11}};
//		int[] newInterval = {0,9};
		int[][] intervals = {{0,1}, {5, 5}, {6, 7}, {9, 11}};
		int[] newInterval = {12,21};
		insert(intervals, newInterval);
	}
	// Input: intervals = [[1,2],[3,5],[6,7],[8,10],[12,16]], newInterval = [4,8]
	// Output: [[1,2],[3,10],[12,16]]
	// Explanation: Because the new interval [4,8] overlaps with [3,5],[6,7],
	
	
	// Input: intervals = [[1,3],[6,9]], newInterval = [2,5]
	// Output: [[1,5],[6,9]]
	
	
	 public static int[][] insert(int[][] intervals, int[] newInterval) {
		
		 List<List<Integer>> resultList = new ArrayList<>();
		 
		 List<Integer> numList = new ArrayList<>();
		 
		 int ArrySizeCounter = 0;
		 
		 Set<Integer> tmpSet = new HashSet<Integer>();
		 
		 System.out.println("start");
		 
		 // 빈배열일때 예외처리
		 if(intervals.length == 0) {
			 intervals = new int[1][2];
			 intervals[0][0] = newInterval[0];
			 intervals[0][1] = newInterval[1];
			 return intervals;
		 }
		 
		 // newInterval 에서 같은 숫자가 들어올경우 예외 처리
		 if(newInterval[0] == newInterval[1]) {
			 resultList.add(Arrays.asList(newInterval[0], newInterval[1] )); 
		 }
		 
		 for(int i = 0; i < intervals.length; i++) {
			 
			 if(intervals[i][0] == intervals[i][1]) {
//				 resultList.add(Arrays.asList(intervals[i][0], intervals[i][0] ));
				 tmpSet.add(intervals[i][0]);
			 }
			 
			 // 사이사이 공백 다 set에 inert (시작 숫자) (1단위로)
			 for(int j = intervals[i][0]; j < intervals[i][1]; j++) {
				 tmpSet.add(j);
			 }
		 }
		 
		 for(int i = newInterval[0]; i < newInterval[1]; i++) {
			 tmpSet.add(i);
		 }
		 
		 Iterator<Integer> it = tmpSet.iterator(); // Iterator(반복자) 생성
		 
		 System.out.println("size : " + tmpSet.size());

		 while (it.hasNext()) { // hasNext() : 데이터가 있으면 true 없으면 false
			System.out.print(it.next() + ", "); // next() : 다음 데이터 리턴
			
		 }
		 
		 Integer[] array = new Integer[tmpSet.size()];
		 
		 
		 List a = new ArrayList(tmpSet);
		 
		 Collections.sort(a);
		 a.toArray(array);
		 
		 it = a.iterator();
		 
		 System.out.println("");
		 while (it.hasNext()) { // hasNext() : 데이터가 있으면 true 없으면 false
				System.out.print(it.next() + ", "); // next() : 다음 데이터 리턴
				
			 }
		 System.out.println("");
		 
		 System.out.println("하이");
		 System.out.println("~~~절취선~~~       " + "array length : " + array.length);
		 
		 for(int i = 0; i < array.length -1; i++) {
			 
			 System.out.println("STEP1 i : " + i);
			 int oneStep = i;
			 while(array[oneStep] - array[ oneStep + 1 ] == -1) { // 다음숫자와 지금숫자 차이가 1이 아닐경우 반복
				 System.out.println(array[oneStep] + " " + array[oneStep + 1]);
				 if(oneStep + 1 == array.length -1 ) {
					 // 마지막 순서떄 coutinue
					 System.out.println("hohihih " + array[oneStep] + " " + array[oneStep + 1]);
					 oneStep += 1;
					 break; 						
				 }
				 oneStep += 1;
			 }
			 
			 resultList.add(Arrays.asList(array[i], array[oneStep] + 1 )); // 현재 1차원 배열에 있는 값 은 [현재값, 현재값+1] 으로 계산해서 범위를 지정해준다. 
			 i = oneStep;

			 // 마지막일떄 한번 더 추가
			 if(oneStep + 1 == array.length -1) {
				 // 마지막, 마지막 -1 이 연결된 숫자면 +1 처리 
				 if(array[array.length -1] - array[array.length -2] == 1) {
					 
				 } else {
					 resultList.add(Arrays.asList(array[oneStep+1], array[oneStep+1] +1  )); // 현재 1차원 배열에 있는 값 은 [현재값, 현재값+1] 으로 계산해서 범위를 지정해준다. 
				 }
				 
			 }
		 }
		 System.out.println("리설트가 먼딩");
		 
		 System.out.println(resultList.toString());
		 
		 int[][] answer = new int[resultList.size()][2];
		 // interval이 [0 , 0] 들어올떄 0,0부터 시작하도록 예외처리
//		 if(newInterval[0] == 0 && newInterval[1] == 0) {
//			 answer = new int[resultList.size()+1][2];
//			 answer[0][0] = 0;
//			 answer[0][1] = 0;
//			 answer[1][0] = resultList.get(0).get(0).intValue();
//			 answer[1][1] = resultList.get(0).get(1).intValue();
//			 System.out.println("결과당");
//			 return answer;
//		 } else {
//			 answer = new int[resultList.size()][2];
//		 }

		 for(int i=0; i<resultList.size(); i++)
		 {
			 answer[i][0] = resultList.get(i).get(0).intValue();
			 answer[i][1] = resultList.get(i).get(1).intValue();
		 }
		 

		 // 같은 숫자로 이루어진 인터벌떄문에 결과 정렬 다시
		 Arrays.sort(answer, new Comparator<int []>() {
			 @Override
			 public int compare(int[] o1, int[] o2) {
				 return o1[0] - o2[0];
			 }
		 });
		 
		 
		 System.out.println("결과당");
		 System.out.println(Arrays.deepToString(answer));
		 return answer;
    }
	 
	

}
