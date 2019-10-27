package coding_pretice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class KaKao_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n = 7;
		Integer[] input = {7, 10, 1, 2, 7, 7, 1};
		
		List<Integer> listA = Arrays.asList(input);
		
//		listA.size()
		
		Map<Integer, Integer> countMap = new HashMap<>();
		
		// listA 배열에 해쉬맵 타입으로 숫자를 key로 두고 value는 count로 사용
		listA.forEach(e -> {
			Integer count = countMap.get(e);
			countMap.put(e, count == null ? 1 : count + 1);
		});
		
		// 맵에서 정렬을 하기위해 list<list<int>>형으로 변환
		List<List<Integer>> resultList = new ArrayList<>();
		countMap.forEach( (k, v) ->{
			System.out.println("k" + k);
			System.out.println("v" + v);
			List<Integer> list = new ArrayList<>();
			for(int i = 0; i < v; i++) {
				list.add(k);
			}
			resultList.add(list);
		});
		
		System.out.println(resultList);
		// list 많은 숫자 순서대로 정렬 (람다로 해쉬 키를 가지고 정렬함)
		resultList.sort( (a,b) -> {
			if(a.size() > b.size()) {
				return -1;
			} else if(a.size() == b.size()){
				return 0;
			} else {
				return 1;
			}
		}); 
		
		resultList.forEach( (a) -> {
			System.out.println("a : " + a);
//			System.out.println("count : " + count);
		});
		
		
		int is_half = 0;
		int count = 0;
		
		// 배열 사이즈가 반 이하가 되었는지 체크
		for(int i = 0; i < resultList.size(); i++) {
			is_half += resultList.get(i).size();
			count++;
			if(is_half > n/2) {
				break;
			}
		}
		
		System.out.println("is_half : " + is_half);
		System.out.println("count : " + count);
		
		
		System.out.println(resultList);

	}

}
