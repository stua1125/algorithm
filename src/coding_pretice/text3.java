package coding_pretice;

// 프로그래머스 코딩테스트2번문제
public class text3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		String[] bishops = { "D5", "E8" };
		String[] bishops = { "D5" };
		 
		int[][] in = new int[8][8];
		
		int countBishop = 0;
		
		
		for(int i = 0; i < bishops.length; i++) {
			int x = ((int)bishops[i].charAt(0) - 64);
			int y = bishops[i].charAt(1) - '0';
			
			x--;
			y--;

			in[x][y] = 1; 
			
			int tmpX = x;
			int tmpY = y;
			
			// 왼위
			while(tmpX > 0 && tmpY > 0) {
				tmpX--;
				tmpY--;
				in[tmpX][tmpY] = 1;
			}
			
			tmpX = x;
			tmpY = y;
			
			// 오위
			while(tmpX < 7 && tmpY > 0) {
				tmpX++;
				tmpY--;
				in[tmpX][tmpY] = 1;
			}
			
			tmpX = x;
			tmpY = y;
			
			// 왼아
			while(tmpX > 0 && tmpY < 7) {
				tmpX--;
				tmpY++;
				in[tmpX][tmpY] = 1;
			}
			
			tmpX = x;
			tmpY = y;
			
			// 오아
			while(tmpX < 7 && tmpY < 7) {
				tmpX++;
				tmpY++;
				in[tmpX][tmpY] = 1;
			}
			
		}
		
		for (int i = 0; i < in.length; i++) {
		      System.out.println();
		      for (int j = 0; j < in[i].length; j++) {
		    	  if(in[i][j] == 1 || in[i][j] == 5) {
		    		  System.out.print(in[i][j] + " ");
		    		  countBishop++;
		    	  }
		    	  else 
		    		  System.out.print("0" + " ");
		      }
		}
		
	
		
	}

}
