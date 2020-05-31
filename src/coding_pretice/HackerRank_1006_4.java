package coding_pretice;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

public class HackerRank_1006_4 {

    // Complete the countSort function below.
    static void countSort(List<List<String>> arr) {
    	
    	List<String> temp_arr = new ArrayList<>(); 
    	

    	for(List<String> a : arr) {
    		temp_arr.add(Integer.parseInt(a.get(0)), a.get(1));
    	}
    	
//    	temp_arr.ad
    	
    	for(String b : temp_arr) {
    		System.out.print(b + " ");
    	}
    	
    }

    public static void main(String[] args) throws IOException {
//        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//
//        int n = Integer.parseInt(bufferedReader.readLine().trim());
//
//        List<List<String>> arr = new ArrayList<>();
//
//        IntStream.range(0, n).forEach(i -> {
//            try {
//                arr.add(
//                    Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
//                        .collect(toList())
//                );
//            } catch (IOException ex) {
//                throw new RuntimeException(ex);
//            }
//        });
//
//        countSort(arr);
//
//        bufferedReader.close();
    	
    	List<List<String>> tmp = new ArrayList<List<String>>();
    	
    	
    	List<String> ttt = new ArrayList<String>();
    	ttt.add("0");
    	ttt.add("ab");    	
    	tmp.add(ttt);
    	ttt = new ArrayList<String>();
    	ttt.add("6");
    	ttt.add("cd");    	
    	tmp.add(ttt);
    	ttt = new ArrayList<String>();
    	ttt.add("0");
    	ttt.add("ef");    	
    	tmp.add(ttt);
    	ttt = new ArrayList<String>();
    	ttt.add("6");
    	ttt.add("gh");    	
    	tmp.add(ttt);
    	ttt = new ArrayList<String>();
    	ttt.add("4");
    	ttt.add("ij");    	
    	tmp.add(ttt);
    	ttt = new ArrayList<String>();
    	ttt.add("0");
    	ttt.add("ab");    	
    	tmp.add(ttt);
    	ttt = new ArrayList<String>();
    	ttt.add("6");
    	ttt.add("cd");    	
    	tmp.add(ttt);
    	ttt = new ArrayList<String>();
    	ttt.add("0");
    	ttt.add("ef");    	
    	tmp.add(ttt);
    	ttt = new ArrayList<String>();
    	ttt.add("6");
    	ttt.add("gh");    	
    	tmp.add(ttt);
    	ttt = new ArrayList<String>();
    	ttt.add("0");
    	ttt.add("ij");    	
    	tmp.add(ttt);
    	ttt = new ArrayList<String>();
    	ttt.add("4");
    	ttt.add("that");    	
    	tmp.add(ttt);
    	ttt = new ArrayList<String>();
    	ttt.add("3");
    	ttt.add("be");    	
    	tmp.add(ttt);
    	ttt = new ArrayList<String>();
    	ttt.add("0");
    	ttt.add("to");    	
    	tmp.add(ttt);
    	ttt = new ArrayList<String>();
    	ttt.add("1");
    	ttt.add("be");    	
    	tmp.add(ttt);
    	ttt = new ArrayList<String>();
    	ttt.add("5");
    	ttt.add("question");    	
    	tmp.add(ttt);
    	ttt = new ArrayList<String>();
    	ttt.add("1");
    	ttt.add("or");    	
    	tmp.add(ttt);
    	ttt = new ArrayList<String>();
    	ttt.add("2");
    	ttt.add("not");    	
    	tmp.add(ttt);
    	ttt = new ArrayList<String>();
    	ttt.add("4");
    	ttt.add("is");    	
    	tmp.add(ttt);
    	ttt = new ArrayList<String>();
    	ttt.add("2");
    	ttt.add("to");    	
    	tmp.add(ttt);
    	ttt = new ArrayList<String>();
    	ttt.add("4");
    	ttt.add("the");    	
    	tmp.add(ttt);
    	
		for (int i = 0; i < tmp.size()/2; i++) {
			List<String> elem = tmp.get(i);
			elem.set(1, "-");
		}
		
		
		
		tmp.stream().sorted( (a,b) -> {
			if (Integer.parseInt(a.get(0)) > Integer.parseInt(b.get(0))) {
				return 1;
			} else if(Integer.parseInt(a.get(0)) == Integer.parseInt(b.get(0))) {
				return 0;
			} else {
				return -1;
			}
		}).forEach(a -> System.out.print(a.get(1) + " "));
		//tt
		/*
		 * 
		 * 
		 */
		List<String> qwe = new ArrayList<>();
		
		tmp.stream().sorted( (a,b) -> {
			if (Integer.parseInt(a.get(0)) > Integer.parseInt(b.get(0))) {
				return 1;
			} else if(Integer.parseInt(a.get(0)) == Integer.parseInt(b.get(0))) {
				return 0;
			} else {
				return -1;
			}
		}).collect(Collectors.toList());
    	
    }
}
