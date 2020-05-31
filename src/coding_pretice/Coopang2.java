package coding_pretice;

public class Coopang2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 재귀로 숫자 다 더하기
		
		int a = 10; //= 1
//		int a = 456789; = 3
		
		int result = solution(a);
		
		System.out.println("result = "+ result);
		
			
	}
	
	public static int solution(int n) {
        int recursiveNumber = n;
        while ( recursiveNumber >= 10) {
            recursiveNumber = recursiveFunction(recursiveNumber);
        }
    
        return recursiveNumber;
	}

    
	public static int recursiveFunction (int inputNumber) {
		int sum = 0;
		
		while (inputNumber != 0) {
			sum += (inputNumber%10);
			inputNumber = inputNumber/10;
		}
        
        return sum;
    }


}
