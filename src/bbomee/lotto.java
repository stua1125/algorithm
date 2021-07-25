package bbomee;

import java.util.Arrays;

public class lotto {
	public static void main(String[] args) {
		int[] target = {2, 45, 3, 7, 4, 8};
		int[] input =  {4, 6, 8, 0, 1, 0};
		
		Arrays.sort(target); //2, 3, 4, 7, 8, 45
		Arrays.sort(input); // 1, 3, 4, 6, 8, 9
		
		int lotto = 0;
		int t = 0;
		int i = 0;
		int unknown = 0;
	
		while(t < 6 && i < 6) {
			if(input[i] == 0) {
				unknown++;
			}
			if(target[t] == input[i]) {
				lotto++;
				i++;
				t++;
			} else if(target[t] > input[i]) {
				i++;
			} else {
				t++;
			}
		}
		
		
		System.out.println(unknown);
		int[] ans = {7-lotto, 7-(lotto+unknown)};
		System.out.print(ans[0] + " " + ans[1]);
	
	}
	
	//버블정렬
	public static int[] sortArr(int[] nums) {
		for(int i = 0 ; i < nums.length; i++) {
			for(int j = 0; j < nums.length-i-1; j++) {
				if(nums[j] > nums[j+1]) {
					int temp = nums[j];
					nums[j] = nums[j+1];
					nums[j+1] = temp;
				}
			}
		}
		return nums; 
	}
}
