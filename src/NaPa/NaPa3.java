package NaPa;

public class NaPa3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("hihihi");
		
		int[] a = {0,1,2,-2,3};
		int[] b = {0,1,4,1,0};
		
		solution(1 , 3, a, b);
	} 
	
    public static int solution(int inner, int outer, int[] points_x, int[] points_y) {
        // write your code in Java SE 8
    	 int cnt = 0;
         
         for(int i = 0; i < points_x.length; i++) {
            int x = points_x[i];
            int y = points_y[i];
            
            double len = Math.sqrt(x*x + y*y);
            if(len > inner && len < outer) {
               cnt++;
            }
         }
           
           return cnt;
    }

}
