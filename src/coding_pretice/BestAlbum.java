package coding_pretice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BestAlbum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   
		int[] answer = {};
		   
		String[] genres = {"classic", "pop", "classic", "classic", "pop"}; 
		int[] plays = {500, 600, 150, 800, 2500};
		
		
		Map<String, Integer> countMap = new HashMap<>();
		for(int i = 0; i < genres.length; i++) {
			countMap.put(genres[i], plays[i]);
		}
		
		
		
		
		
		int n = 7;
		Integer[] input = {7, 10, 1, 2, 7, 7, 1};
		
		List<Integer> listA = Arrays.asList(input);
		
//		listA.size()
		
//		Map<Integer, Integer> countMap = new HashMap<>();
		
		// listA �迭�� �ؽ��� Ÿ������ ���ڸ� key�� �ΰ� value�� count�� ���
		listA.forEach(e -> {
			Integer count = countMap.get(e);
			countMap.put(e, count == null ? 1 : count + 1);
		});
		
		// �ʿ��� ������ �ϱ����� list<list<int>>������ ��ȯ
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
		// list ���� ���� ������� ���� (���ٷ� �ؽ� Ű�� ������ ������)
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
		
		// �迭 ����� �� ���ϰ� �Ǿ����� üũ
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
