package coding_pretice;

import java.io.ObjectOutputStream.PutField;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BestAlbum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   
		int[] answer = {};
		   
		String[] genres = {"classic", "pop", "classic", "classic", "pop"}; 
		int[] plays = {500, 600, 150, 800, 2500};
		
		
		Map<String, Integer> totalCount = new HashMap<>();
		Map<Integer, String> gMap = new HashMap<>();
		Map<Integer, Integer> pMap = new HashMap<>();
		for(int i = 0; i < genres.length; i++) {
			int a = totalCount.get(genres[i]) == null ? 0 : totalCount.get(genres[i]); // 삼항연산자
			totalCount.put(genres[i], plays[i] + a);
			
			gMap.put(i, genres[i]); // i is index 
			pMap.put(i, plays[i]);
		}
		
		for(String item : totalCount.keySet()) {		
			System.out.print("genres Name : " + item + ",  total Sum : ");
			System.out.println(totalCount.get(item));

			// 해당 장르의 인덱스 배열 임시 저장
			List sameGenresIndexArray = new ArrayList<>();
			
			
			// 높은 순서대로 포문 돌림
			for(Integer tt : gMap.keySet()) {
//				System.out.print(tt + " : ");
//				System.out.println(gMap.get(tt));
//				System.out.println("================================");
				if(item.equals(gMap.get(tt))) {
					sameGenresIndexArray.add(tt);
				}
			}
			
			Map<Integer, Integer> rankMap = new HashMap<>();
			List sameGenresPlayRank = new ArrayList<>();
			
			sameGenresIndexArray.forEach(e -> {
//				System.out.print("sameGenresIndexArray : ");
//				System.out.println(e);
				sameGenresPlayRank.add(e);
				rankMap.put((Integer) e, plays[(int) e]);
			});
			
			
			// 높은 순서대로 포문 돌림
			for(Integer xx : rankMap.keySet()) {
				System.out.print("index : " + xx + ",     value : ");
				System.out.println(rankMap.get(xx));
				System.out.println("================================");
			}
			
			
			
//			for(Integer ss : pMap.keySet()) {
//				System.out.print(ss + " : ");
//				System.out.println(pMap.get(ss));
//				System.out.println("================================");
//			}
			System.out.println("##########################");
			System.out.println("#                        #");
			System.out.println("##########################");
		}

		//		listA.forEach(e -> {
//			Integer count = countMap.get(e);
//			countMap.put(e, count == null ? 1 : count + 1);
//		});
//		
//		List<List<Integer>> resultList = new ArrayList<>();
//		countMap.forEach( (k, v) ->{
//			System.out.println("k" + k);
//			System.out.println("v" + v);
//			List<Integer> list = new ArrayList<>();
//			for(int i = 0; i < v; i++) {
//				list.add(k);
//			}
//			resultList.add(list);
//		});
//		
//		System.out.println(resultList);
//		resultList.sort( (a,b) -> {
//			if(a.size() > b.size()) {
//				return -1;
//			} else if(a.size() == b.size()){
//				return 0;
//			} else {
//				return 1;
//			}
//		}); 
//		
//		resultList.forEach( (a) -> {
//			System.out.println("a : " + a);
////			System.out.println("count : " + count);
//		});
//		
//		
//		int is_half = 0;
//		int count = 0;
//		
//		for(int i = 0; i < resultList.size(); i++) {
//			is_half += resultList.get(i).size();
//			count++;
//			if(is_half > n/2) {
//				break;
//			}
//		}
//		
//		System.out.println("is_half : " + is_half);
//		System.out.println("count : " + count);
//		
//		
//		System.out.println(resultList);
	}

}
