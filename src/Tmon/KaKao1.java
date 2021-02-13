package Tmon;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class KaKao1 {
	
	static int minValue = 0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<List<String>> resultList = new ArrayList<>();
		
		List<String> tmp1 = Arrays.asList("Apeach", "Frodo", "2");
		List<String> tmp2 = Arrays.asList("Frodo", "Apeach", "2");
		List<String> tmp3 = Arrays.asList("Tube", "Apeach", "5");
		List<String> tmp4 = Arrays.asList("Frodo", "Tube", "7");
		List<String> tmp5 = Arrays.asList("Apeach", "Frodo", "4");
		List<String> tmp6 = Arrays.asList("Apeach", "Tube", "4");
		List<String> aa = Arrays.asList("5");
		List<String> bb = Arrays.asList("3");
		
//		List<String> tmp1 = Arrays.asList("Frodo", "Apeach", "7");
//		List<String> tmp2 = Arrays.asList("Frodo", "Apeach", "3");
//		List<String> tmp3 = Arrays.asList("Apeach", "Frodo", "4");
//		List<String> tmp4 = Arrays.asList("Frodo", "Apeach", "1");
//		List<String> tmp5 = Arrays.asList("Apeach", "Frodo", "7");
//		List<String> aa = Arrays.asList("5");
//		List<String> bb = Arrays.asList("3");
		
//		List<String> tmp1 = Arrays.asList("Frodo", "Apeach", "7");
//		List<String> tmp2 = Arrays.asList("Frodo", "Apeach", "3");
//		List<String> tmp3 = Arrays.asList("Apeach", "Frodo", "4");
//		List<String> tmp4 = Arrays.asList("Frodo", "Apeach", "1");
//		List<String> tmp5 = Arrays.asList("Apeach", "Frodo", "7");
//		List<String> aa = Arrays.asList("5");
//		List<String> bb = Arrays.asList("3");
		
		resultList.add(aa);
		resultList.add(bb);
		resultList.add(tmp1);
		resultList.add(tmp2);
		resultList.add(tmp3);
		resultList.add(tmp4);
		resultList.add(tmp5);
		
		System.out.println("결과 " + solution(resultList).toString());

	}

	public static List<String> solution(List<List<String>> arr) {
	    // Write your code here
		
		arr.remove(0);
		arr.remove(0);
		
		Map<String, Integer> countMap = new HashMap<>();
		
		// listA 배열에 해쉬맵 타입으로 숫자를 key로 두고 value는 count로 사용
		arr.forEach(e -> {
			System.out.println("e: " + e.get(0) + " , " + e.get(1) + " , "+e.get(2));
			String borrowName = e.get(0);
			String lentName = e.get(1);
			int point =  Integer.parseInt(e.get(2));
			
			if(countMap.get(borrowName)  == null) {
				countMap.put(borrowName, point *-1 );
			} else {
				countMap.put(borrowName, countMap.get(borrowName) + (point *-1));
			}
			
			if(countMap.get(lentName)  == null) {
				countMap.put(lentName, point);
			} else {
				countMap.put(lentName, countMap.get(lentName) + point);
			}
		});
		
		
		countMap.forEach( (k, v) -> {
			System.out.println("k: " + k + ", v: " + v);
			if(v < minValue) {
				minValue = v;
			}
		});
		
		if(minValue >= 0) {
			return Arrays.asList("None");
		}
		
		List<String> result = new ArrayList();
		
		countMap.forEach( (k, v) -> {
			if(v == minValue) {
				result.add(k);
			}
		});
		
		Collections.sort(result);

		System.out.print("result : ");
		System.out.println(result);
		return result;
    }
}
