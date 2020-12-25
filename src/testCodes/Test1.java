package testCodes;


class Test1 {

static String result = "";

    public String solution(int A, int B, int C) {
        // write your code in Java SE 8
int sum = A+B+C;


		
		
		for (int i = 0; i < sum ; i++) {
			
			if(A >= B && A >= C) {
				if(sol('A')) {
					result = result + "A";
					A--;
				} else {
					//
					if(B > C) {
						if(B != 0) {
							result = result + "B";
							B--;
						}
			 		} else {
			 			if(C != 0) {
				 			result = result + "C";
				 			C--;
			 			}
			 		}
					//
				}
			} else if(B >= A && B >= C) {
				if(sol('B')) {
					result = result + "B";
					B--;
				} else {
					//
					if(C > A) {
						if(C != 0) {
							result = result + "C";
							C--;
						}
			 		} else {
			 			if(A != 0) {
			 				result = result + "A";
			 				A--;
			 			}
			 		}
					//					
				}
				
	 		} else if(C >= B && C >= A) {
	 			if(sol('C')) {
	 				result = result + "C";
		 			C--;
	 			} else {
	 				//
					if(B > A) {
						if(B != 0) {
							result = result + "B";
							B--;
						}
			 		} else {
			 			if(A != 0) {
			 				result = result + "A";
			 				A--;
			 			}
			 		} 
					//	
	 			}
	 			
	 		} else {
	 			break;
	 		}
		}
		return null;
    }

static boolean sol (Character tmp) {
		if(result.length() >= 2) {
			if(result.charAt(result.length()-1) == result.charAt(result.length()-2) && result.charAt(result.length()-1) == tmp) {
				return false;
			} else {
				return true;
			}
		} else {
			return true;
		}
		
	}

}
