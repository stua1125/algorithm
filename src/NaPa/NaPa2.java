package NaPa;

public class NaPa2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("hihihi");
		
		int[] A = {1, 2, 3, 5, 6};
		int X = 5;
		System.out.println("answer : " + solution(A, 1));
//		solution(A, X);
	}
	
	static int solution(int[] A, int X) {
        int N = A.length;
        if (N == 0) {
            return -1;
        }
        int l = 0;
        int r = N - 1;
//        while (l < r) {
//        	System.out.println("l: " + l);
//        	System.out.println("r: " + r);
//            int m = (l + r) / 2;
//            System.out.println("m: " + m);
//            if(m == l) { break;}
//            if (A[m] > X) {
//                r = m - 1;
//            } else {
//                l = m;
//            }
//            System.out.println("====================");
//        }
//        if (A[l] == X) {
//            return l;
//        }
        while (l < r) {
        	System.out.println("l: " + l);
        	System.out.println("r: " + r);
            int m = (l + r) / 2;
            System.out.println("m: " + m);
            if (A[m] > X) {
                r = m - 1;
            } else if(A[m] < X){
                l = m + 1;
            } else l = m; break;
        }
        if (A[l] == X) {
            return l;
        }
        return -1;
    }

}

//public static int getSearchPriceArrayIntex(int[] priceArray, int searchPrice) {
//	int begin = 0;
//    int end = priceArray.length-1;
//    int middle;        
//
//    while(begin<=end) {
//        middle = (begin+end)/2;
//        if(searchPrice == priceArray[middle])
//            return middle;
//        else if(searchPrice > priceArray[middle]) {
//            begin = middle + 1;
//        }else {
//            end = middle-1;
//        }
//    }
//    return -1; // searchPrice가 배열에 없을 경우 -1을 return
//}
