package coding_pretice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class KaKao_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> s = new ArrayList<String>();
		s.add("aabaac");
		s.add("aab");
		
		List<String> t = new ArrayList<String>();
		t.add("bbcbbc");
		t.add("ccb");
		
		List<String> result = new ArrayList<String>();
		
		String tmpStr1 = "";
		String tmpStr2 = "";

		for(int i = 0; i < s.size(); i++) {
			boolean is_true = true;

			for(int j = 97; j < 123; j++) {
				String tmpAlp = ((char) j) + "";
				tmpStr1 = s.get(i).replaceAll(tmpAlp, "");
				tmpStr2 = t.get(i).replaceAll(tmpAlp, "");
				if(Math.abs(tmpStr1.length() - tmpStr2.length()) > 3 ) {
					is_true = false;
					break;
				}
			}
			result.add(is_true == true ? "true" : "false");
			
		}
		System.out.println(result); // 97 ~ 122 까지 리플레이스해서 랭스 비교
	}

}
