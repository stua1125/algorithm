package coding_pretice;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

// 3x3 매직스퀘어를 완성해야되는데 최소로 변환해서 매직스퀘어로 수정할때의 차이값
// abs 로 절대값 계산을 한다
// 정해져있는 8개의 배열을 하드코딩형식으로 입력을 미리 해놓는다.(3x3일때 경우의수 8개)
public class HackerRank_1006_2 {

    // Complete the formingMagicSquare function below.
    static int formingMagicSquare(int[][] s) {
    	
    	int min = 99999;
    	
    	int[][][] ans = {
    		    {{8, 1, 6},
    		    {3, 5, 7},
    		    {4, 9, 2}},
    		    
    		    {{6, 1, 8},
    		    {7, 5, 3},
    		    {2, 9, 4}},
    		    
    		    {{4, 9, 2},
    		    {3, 5, 7},
    		    {8, 1, 6}},
    		    
    		    {{2, 9, 4},
    		    {7, 5, 3},
    		    {6, 1, 8}}, 
    		    
    		    {{8, 3, 4}, 
    		    {1, 5, 9}, 
    		    {6, 7, 2}},
    		    
    		    {{4, 3, 8}, 
    		    {9, 5, 1}, 
    		    {2, 7, 6}}, 
    		    
    		    {{6, 7, 2}, 
    		    {1, 5, 9}, 
    		    {8, 3, 4}}, 
    		    
    		    {{2, 7, 6}, 
    		    {9, 5, 1}, 
    		    {4, 3, 8}}};
    	
    	// 3차원 배열 반복
    	for(int i = 0; i < ans.length; i++) {
    		int count = 0;
    		
    		// 입력받은 배열 s반복
    		for(int j = 0; j < s.length; j++) {
    			for(int k = 0; k < s[j].length; k++) {
    				count += Math.abs(ans[i][j][k] - s[j][k]);
    			}
    		}
    		
    		if(count < min) {
    			min = count;
    		}
    	}

    	return 0;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int[][] s = new int[3][3];

        for (int i = 0; i < 3; i++) {
            String[] sRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int j = 0; j < 3; j++) {
                int sItem = Integer.parseInt(sRowItems[j]);
                s[i][j] = sItem;
            }
        }

        int result = formingMagicSquare(s);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}