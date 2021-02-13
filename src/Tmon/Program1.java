package Tmon;

public class Program1 {
	
	// 정렬된 배열에서 원하는 값의 인덱스를 가장 빠른 시간으로 찾는 함수 작성 (이진 탐색)

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] priceArray = {1000, 2000, 3000, 4000, 5000, 6000};
		int searchPrice = 4000;
		
		System.out.println(getSearchPriceArrayIntex(priceArray, searchPrice));
		
	}

	public static int getSearchPriceArrayIntex(int[] priceArray, int searchPrice) {
		int begin = 0;
        int end = priceArray.length-1;
        int middle;        

        while(begin<=end) {
            middle = (begin+end)/2;
            if(searchPrice == priceArray[middle])
                return middle;
            else if(searchPrice > priceArray[middle]) {
                begin = middle + 1;
            }else {
                end = middle-1;
            }
        }
        return -1; // searchPrice가 배열에 없을 경우 -1을 return
	}
}
