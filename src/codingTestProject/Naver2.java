package codingTestProject;

public class Naver2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		int[] A = new int[] {1, 4, -1, 3, 2};
//		int nextIndex = 0;
//		int finalIndx = 0;
//
//		for (int i = 0; i < A.length; i++) {
//			if(i == 0) {
//				nextIndex = A[i];
//			} else if (A[nextIndex] == -1) {
//				finalIndx = i;
//				break;
//			} else {
//				nextIndex= A[nextIndex];
//			}
//		}
//		System.out.println(finalIndx);
		
		int[] A = new int[] {1, 4, -1, 3, 2};
		int nextIndex = 0;
		int finalIndx = 0;

		for (int i = 0; i < A.length; i++) {
			if(i == 0) {
				nextIndex = A[i];
			} else if (A[nextIndex] == -1) {
				finalIndx = i;
				break;
			} else {
				nextIndex= A[nextIndex];
			}
		}
	}

}
