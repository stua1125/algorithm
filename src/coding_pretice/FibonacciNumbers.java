package coding_pretice;

public class FibonacciNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(fibo(4));
	}
	
	public static int fibo(int n) {
		System.out.println("working : " + n);
		if(n <=1 ) {
			return 1;
		} else {
			return fibo(n-1) + fibo(n-2);
		}
		
	}

}
