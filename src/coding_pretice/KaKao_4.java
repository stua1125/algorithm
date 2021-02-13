package coding_pretice;

import java.util.HashSet;
import java.util.Iterator;

public class KaKao_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String word = "baaabbc";
		
		int K = 3;
		
		HashSet<String> alphabetList = new HashSet<String>();
	     for(int j = 97; j < 123; j++) {
	            String s = ((char) j) + "";
	            String tmpAlp = new String(new char[K]).replace("\0", s);
	            alphabetList.add(tmpAlp);
	            System.out.println("tmpAlp : " + tmpAlp);
         }

         for(int i = 0; i < word.length(); i++) {
            Iterator<String> iter = alphabetList.iterator();
            while(iter.hasNext()){
               word = word.replaceAll(iter.next(), "");
            }
         }

       System.out.println(word);

	}


}
