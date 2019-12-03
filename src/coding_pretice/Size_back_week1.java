package coding_pretice;

import java.util.ArrayList;
import java.util.List;

public class Size_back_week1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int peopleNum = 5;
		
		
		List<List<Integer>> a = new ArrayList<>();
		
		List<Integer> tmp = new ArrayList<>();
		tmp.add(55);
		tmp.add(185);
		a.add(tmp);
		tmp = tmp = new ArrayList<>();
		tmp.add(58);
		tmp.add(183);
		a.add(tmp);		
		tmp = tmp = new ArrayList<>();
		tmp.add(88);
		tmp.add(186);
		a.add(tmp);	
		tmp = tmp = new ArrayList<>();
		tmp.add(60);
		tmp.add(175);
		a.add(tmp);	
		tmp = tmp = new ArrayList<>();
		tmp.add(46);
		tmp.add(155);
		a.add(tmp);
		
		List<Integer> result = new ArrayList<>();
		
		for(int i = 0; i < a.size(); i++) {
			int moreBig = 1; // 더 큰 덩치 갯수 확인 
			for(int j = 0; j < a.size(); j++) {
				if(i == j) continue; // 자기자신은 비교에서 제외
				if(a.get(i).get(0) < a.get(j).get(0) && a.get(i).get(1) < a.get(j).get(1)) { // 몸무게와 키 둘다 클경우 
					moreBig++;
				}
			} 
			result.add(i, moreBig);
		}
		
		System.out.println(result.toString());
		
		
	}

}
