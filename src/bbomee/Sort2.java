package bbomee;

import java.util.Arrays;

public class Sort2 {
   public static void main(String[] args) {
      int[] numbers = {6610,6106};
      //90,908,89,898,10,101,1,8,9
      String a = "6610";
      String b = "6106";
      
      for(int i : numbers) {
    	  System.out.println(i);
      }
      
      System.out.println(solution(numbers));
      
      sort(numbers, 0, numbers.length-1);
      
      System.out.println(numbers[0]);
   }
   //연속한 수가 자리 수가 다를떄 더 큰 숫자의 마지막
    public static String solution(int[] numbers) {
       String answer = "";
       for(int i = 0; i < numbers.length; i++) {
          for(int j = 0; j < numbers.length-i-1; j++ ) {
             if(Integer.parseInt(numbers[j]+""+numbers[j+1]) > Integer.parseInt(numbers[j+1]+""+numbers[j])) {
                
                int temp = numbers[j+1];
                numbers[j+1] = numbers[j];
                numbers[j] = temp;
             }
          }
       }
       for(int i = 0; i < numbers.length; i++) {
          answer += numbers[numbers.length-i-1]+"";
       }
       if(Integer.parseInt(answer) == 0) return "0";
        return answer;
    }
    
    
    public static void sort(int[] data, int l, int r){
        int left = l;
        int right = r;
        int pivot = data[(l+r)/2];
        
        do{
            while(data[left] < pivot) left++;
            while(data[right] > pivot) right--;
            if(left <= right){    
                int temp = data[left];
                data[left] = data[right];
                data[right] = temp;
                left++;
                right--;
            }
        }while (left <= right);
        
        if(l < right) sort(data, l, right);
        if(r > left) sort(data, left, r);
    }

}