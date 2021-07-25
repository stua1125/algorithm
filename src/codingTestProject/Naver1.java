package codingTestProject;

public class Naver1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
		
		int N = -999;
		boolean minus = false;
		if(N < 0) {
			minus = true;
		}
		
		String a = Math.abs(N) + "";
		int result = Math.abs(N);
		
		for(int i = 0; i<a.length(); i++) {
			StringBuffer sb = new StringBuffer(a);
			sb.insert(i, "5");
			String tmp = sb.toString();
			
			int num = Integer.parseInt(tmp);
			
			if(!minus) {
				if(Math.abs(result) < Math.abs(num)) {
					result = num;
				}
				
			} else {
				if(Math.abs(result) > Math.abs(num)) {
					result = num;
				}
				
			}
		}
		System.out.println(result);
		if(Math.abs(N) * 10 + 5 > result) {
			result = Math.abs(N) * 10 + 5; 
		}
		
		if(minus) {
			result = result * (-1);
		}
		System.out.println(result);
		
		
	}

}
