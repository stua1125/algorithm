package coding_pretice;

import java.util.Arrays;

public class programers_sort {

	public static void main(String[] args) {
		int[] array = {1, 5, 2, 6, 3, 7, 4};
		int[][] commands = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};
		
		int[] answer = new int[commands.length];
		
		for(int i = 0; i < commands.length; i++) {
			int[] slice_array = Arrays.copyOfRange(array, commands[i][0]-1, commands[i][1]);
			Arrays.sort(slice_array);
			answer[i] = slice_array[commands[i][2]];
		}
	}
}
