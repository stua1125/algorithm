package Tmon;

import java.util.Arrays;

public class Program2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] bb = {"3", "36"};
		
		Arrays.sort(bb);
		
		System.out.println(bb[0]);
		
//		countBits(7);
	}
	
	public static int[] countBits(int number){
		
		int bin[] = new int[4]; // 배열 size 9의 최대 자리수 4
				
		int s = 0;   // 배열의 위치
        int mok = 0; // 몫
        int nmg = 0; // 나머지
       
        do {
            mok = (int)number/2; 
            nmg = number - mok*2;
            
            bin[s] = nmg;
            s = s + 1; 	  // 배열 인덱스 증가.
           
            number = mok; // mok이 0이 아니면 목인 mok을 10진수 number으로 친환하고 반복 실행
        }while(mok!=0);   // 조건 mok을 0일때까지 반복

        print(bin);
        return bin;
	}
	
	public static void print(int input[]) {
		for(int j = input.length-1; j >= 0; --j)
        {
         System.out.print(input[j]);
        }
	}

}
