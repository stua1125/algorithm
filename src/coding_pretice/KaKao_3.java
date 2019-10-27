package coding_pretice;

import java.util.HashSet;
import java.util.Iterator;

public class KaKao_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String word = "baaabbc";
		
		int K = 3;
		
		for(int i = 0; i < word.length(); i++) {
			char a = word.charAt(i);
			int tem_j = i + 1;
			int count = 0;
			while(tem_j < word.length()) {
				if(a == word.charAt(tem_j)) {
					count++;
				} else {
					if(count >= K) {
						String alphabetList = "";
						for(int j = 0; j < K; j++) {
							alphabetList += a + "";
						}
						word.replaceAll(alphabetList, "");
						break;
					} else {
						break;
					}
				}
			}
		}
		
		System.out.println(word);

	}

	

}
