package Programmers;

import java.util.ArrayList;
import java.util.List;

public class Q2 {

	public static void main(String[] args) {
		
		int[][] queries =  {{2,2,5,4},{3,3,6,6},{5,1,6,3}};
		solution(6, 6, queries);
		
	}

	public static int[] solution(int rows, int columns, int[][] queries) {
        int[] answer = new int[] {};
        
        int numCount = 1;
        int[][] table = new int[rows][columns];
        
        for(int i=0; i < rows; i++) {
        	for(int j=0; j < columns; j++){
        		table[i][j] = numCount;
        		numCount++;
        	}
        }
        
        numCount = 1;
        int[][] resultTable = new int[rows][columns];
        
        for(int i=0; i < rows; i++) {
        	for(int j=0; j < columns; j++){
        		resultTable[i][j] = numCount;
        		numCount++;
        	}
        }
        
        int first = queries[0][0] -1;
        int first2 = queries[0][1] -1;
        int first3 = queries[0][2] -1;
        int first4 = queries[0][3] -1;
        
        ArrayList<Integer> numList = new ArrayList<>();
        
        
        for (int i = first2; i <= first4; i++) {
            System.out.print(table[first][i] + " "); // 열 출력
            numList.add(table[first][i]);
        }
        System.out.println(); // 행 출력
        for (int i = first+1; i <= first3; i++) {
            System.out.print(table[i][first4] + " "); // 열 출력
            numList.add(table[i][first4]);
        }
        System.out.println(); // 행 출력
        for (int i = first4-1; i >= first2; i--) {
            System.out.print(table[first3][i] + " "); // 열 출력
            numList.add(table[first3][i]);
        }
        System.out.println(); // 행 출력
        for (int i = first3-1; i >= first+1; i--) {
            System.out.print(table[i][first2] + " "); // 열 출력
            if(i == first+1) {
            	numList.add(0, table[i][first2]);
            } else {
            	numList.add(table[i][first2]);
            }
        }
        
        int resultCount = numList.get(0);
        int countTmp = 0;
        for (int i = first2; i <= first4; i++) {
            resultTable[first][i] = numList.get(countTmp);
            if(resultCount > numList.get(countTmp)){
            	resultCount= numList.get(countTmp);
            }
            countTmp++;
        }
        System.out.println(); // 행 출력
        for (int i = first+1; i <= first3; i++) {
            resultTable[i][first4] = numList.get(countTmp);
            if(resultCount > numList.get(countTmp)){
            	resultCount= numList.get(countTmp);
            }
            countTmp++;
        }
        System.out.println(); // 행 출력
        for (int i = first4-1; i >= first2; i--) {
            resultTable[first3][i] = numList.get(countTmp);
            if(resultCount > numList.get(countTmp)){
            	resultCount= numList.get(countTmp);
            }
            countTmp++;
        }
        System.out.println(); // 행 출력
        for (int i = first3-1; i >= first+1; i--) {
            resultTable[i][first2] = numList.get(countTmp);
            if(resultCount > numList.get(countTmp)){
            	resultCount= numList.get(countTmp);
            }
            countTmp++;
        }
        
        System.out.println();
        System.out.println(resultCount);
        System.out.println("배열출력");
        
        for (int i = 0; i < resultTable.length; i++) {
            for (int j = 0; j < resultTable[i].length; j++) {
                System.out.print(resultTable[i][j] + "\t"); // 열 출력
            }
            System.out.println(); // 행 출력
        }
        
//        return answer;
    }

}
