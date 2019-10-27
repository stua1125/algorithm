package coding_pretice;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class HackerRank_1006_3 {

    // Complete the extraLongFactorials function below.
    static void extraLongFactorials(int n) {
    	BigDecimal count = new BigDecimal(n);
    	while(n > 1) {
    		n--;
    		count = count.multiply(new BigDecimal(n));
    	}
    	System.out.println(count);            

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
//        int n = scanner.nextInt();
//        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        extraLongFactorials(5);

//        scanner.close();
    }
}
