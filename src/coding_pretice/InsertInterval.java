package coding_pretice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class InsertInterval {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] intervals = {{1,3}, {6,8}};
		int[] newInterval = {2, 5};
		insert(intervals, newInterval);
	}
	
	// Input: intervals = [[1,2],[3,5],[6,7],[8,10],[12,16]], newInterval = [4,8]
	// Output: [[1,2],[3,10],[12,16]]
	// Explanation: Because the new interval [4,8] overlaps with [3,5],[6,7],
	
	
	// Input: intervals = [[1,3],[6,9]], newInterval = [2,5]
	// Output: [[1,5],[6,9]]
	
	
	 public static int[][] insert(int[][] intervals, int[] newInterval) {
		 int[][] answer;
		 List<List<Integer>> resultList = new ArrayList<>();
		 
		 List<Integer> numList = new ArrayList<>();
		 
		 int ArrySizeCounter = 0;
		 
		 Set<Integer> tmpSet = new HashSet<Integer>();
		 
		 System.out.println("start");
		 
		 for(int i = 0; i < intervals.length; i++) {
			 
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
			System.out.println(it.next()); // next() : 다음 데이터 리턴
			
		 }
		 
		 Integer[] array = new Integer[tmpSet.size()];
		 
		 tmpSet.toArray(array);
		 
		 System.out.println("~~~절취선~~~");
		 
		 for(int i = 0; i < array.length-1; i++) {
			 
			 int oneStep = i;
			 while(array[oneStep] - array[ oneStep + 1 ] == -1) { // 다음숫자와 지금숫자 차이가 1이 아닐경우 반복
				 oneStep += 1;
			 }
			 
			 resultList.add(Arrays.asList(array[i], array[oneStep] + 1 )); // 현재 1차원 배열에 있는 값 은 [현재값, 현재값+1] 으로 계산해서 범위를 지정해준다. 
			 
			 i = oneStep + 1;
			 System.out.println("i : " + i);
			 
//			 System.out.println(array[i]);
		 }
		 System.out.println("리설트가 먼딩");
		 
		 System.out.println(resultList.toString());
		 
		 
		 int count = 0;

		 
		 
		 return intervals;
    }

}
