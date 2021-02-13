package Tmon;

public class Program2 {
	
	
	// 10진수 2진수 로 변환하여 바이너리 코드의 1의 갯수를 리턴하는 함수 작성

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(countBits(7));
//		countBits(9);
	}
	
	public static int countBits(int number){
		
		int result = 0;
		int bin[] = new int[4]; // 배열 size 9의 최대 자리수 4
				
		int s = 0;   // 배열의 위치
        int mok = 0; // 몫
        int nmg = 0; // 나머지
       
        do {
            mok = (int)number/2; 
            nmg = number - mok*2;
            
            if(nmg == 1) {
            	result++;
            }
            bin[s] = nmg;
            s = s + 1; 	  // 배열 인덱스 증가.
           
            number = mok; // mok이 0이 아니면 목인 mok을 10진수 number으로 친환하고 반복 실행
        }while(mok!=0);   // 조건 mok을 0일때까지 반복

        return result;
		
	}

}
