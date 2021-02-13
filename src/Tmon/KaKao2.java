package Tmon;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class KaKao2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<List<String>> resultList = new ArrayList<>();
		
//		List<String> tmp1 = Arrays.asList("item1", "10", "15");
//		List<String> tmp2 = Arrays.asList("item2", "3", "4");
//		List<String> tmp3 = Arrays.asList("item3", "17", "8");
//
//		resultList.add(tmp1);
//		resultList.add(tmp2);
//		resultList.add(tmp3);
//		solution(resultList, 1, 0, 2, 1);
		
		List<String> tmp1 = Arrays.asList("p1", "1", "2");
		List<String> tmp2 = Arrays.asList("p2", "2", "1");
		List<String> tmp3 = Arrays.asList("p3", "2", "1");

		resultList.add(tmp1);
		resultList.add(tmp2);
		resultList.add(tmp3);
		
		solution(resultList, 0, 0, 1, 1);
	}
	
	
	public static List<String> solution(List<List<String>> items, int orderBy, int orderDirection, int pageSize, int pageNumber) {
	    // Write your code here
		
		System.out.println("input");
		System.out.println(items.toString());
		System.err.println(orderBy + " " + orderDirection + " " + pageSize + " " + pageSize);
		
		if(orderBy == 0) {
			if(orderDirection == 1) {
				items.sort( (a,b) -> {
					//	내림차순			
					if(a.get(orderBy).compareTo(b.get(orderBy)) > 0) {
						return -1; // 오름 차순일경우 -1, 내림차순일 경우 1
					} else if(a.get(orderBy).compareTo(b.get(orderBy)) == 0){
						return 0;
					} else {
						return 1;
					}
				});
			}
			
			if(orderDirection == 0) {
				items.sort( (a,b) -> {
					// 오름차순
					if(a.get(orderBy).compareTo(b.get(orderBy)) < 0) {
						return -1; // 오름 차순일경우 -1, 내림차순일 경우 1
					} else if(a.get(orderBy).compareTo(b.get(orderBy)) == 0){
						return 0;
					} else {
						return 1;
					}
				});
			}
		} else {
			if(orderDirection == 1) {
				items.sort( (a,b) -> {
					//	내림차순			
					if(Integer.parseInt(a.get(orderBy)) > Integer.parseInt(b.get(orderBy))) {
						return -1; // 오름 차순일경우 -1, 내림차순일 경우 1
					} else if(Integer.parseInt(a.get(1)) == Integer.parseInt(b.get(1))){
						return 0;
					} else {
						return 1;
					}
				});
			}
			
			if(orderDirection == 0) {
				items.sort( (a,b) -> {
					// 오름차순
					if(Integer.parseInt(a.get(orderBy)) < Integer.parseInt(b.get(orderBy))) {
						return -1; // 오름 차순일경우 -1, 내림차순일 경우 1
					} else if(Integer.parseInt(a.get(1)) == Integer.parseInt(b.get(1))){
						return 0;
					} else {
						return 1;
					}
				});
			}
		}
	    
		int start_idx = 0;
		int end_idx = -1;
		if(pageSize * pageNumber > 0) {
			start_idx = pageSize * pageNumber;
		}
	    if(pageSize * pageNumber + pageSize < items.size()) {
	    	end_idx = pageSize * pageNumber + pageSize;
	    } else {
	    	end_idx = items.size();
	    }
	    
	    System.out.println("start_idx " + start_idx);
	    System.out.println("end_idx " + end_idx);
	    
	    List<String> result = new ArrayList();
	    
	    for(int i = start_idx; i < end_idx; i ++) {
	    	System.out.println(items.get(i) + " z");
	    	result.add(items.get(i).get(0));
	    }
		return result;
    }

}
