package coding_pretice;

import java.util.stream.Stream;

public class Coopang1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//아름다운연도
		
		int a = 1987;
		
//		int array[] = new int[4];
//		for(int i = 0; i < 4; i++) {
//			array[i] = a.get
//		}
		
//		int array[] = Stream.of(String.valueOf(a).split("")).mapToInt(Integer::parseInt).toArray();
		
//		for(int i = 0; i< array.length; i++) {
//			System.out.println(i);
//		}
		
//		for(int i = a + 1; i < 10000; i++) {
//			int array[] = Stream.of(String.valueOf(i).split("")).mapToInt(Integer::parseInt).toArray();
//			String tmp = a + "";
//			int[] array = new int[tmp.length()];
//	        for(int j=0; j<tmp.length(); j++) array[j] = tmp.charAt(i) - '0';
//	        
//			if(array[0] != array[1] && array[0] != array[2] && array[0] != array[3] 
//					&& array[1] != array[2] && array[1] != array[3]
//					&& array[2] != array[3]) {
//				System.out.println("a =" + i);
//				break;
//			}
//		}
		int p = 1987;
		int answer = 0;
		for(int i = p + 1; i < 10000; i++) {
			String tmp = i + "";
			String[] array_word = tmp.split("");
			int array[] = new int[tmp.length()];
			for(int j = 0; j<tmp.length(); j++) {
				array[j] = Integer.parseInt(array_word[j]);
			}
			
			if(array[0] != array[1] && array[0] != array[2] && array[0] != array[3] 
					&& array[1] != array[2] && array[1] != array[3]
					&& array[2] != array[3]) {
				answer = i;
				break;
			}
		}
		System.out.println(answer);
	}

}
