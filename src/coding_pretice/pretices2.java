package coding_pretice;

import java.util.*;
import java.util.stream.Collectors;

public class pretices2 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        int n = 7;
        Integer[] input = {7, 10, 1, 2, 7, 7, 1};

        List<Integer> listA = Arrays.asList(input);
        Map<Integer, Integer> countMap = new HashMap<>();

        // listA 배열에 해쉬맵 타입으로 숫자를 key로 두고 value는 count로 사용
        listA.forEach(e -> {
            Integer count = countMap.get(e);
            countMap.put(e, count == null ? 1 : count + 1);
        });

        Comparator<Map.Entry<Integer, Integer>> comparator = Comparator.comparing(Map.Entry::getValue);

        Map<Integer, Integer> sortedMap = countMap.entrySet().stream().sorted(comparator.reversed()).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));

        int is_half = 0;
        int count = 0;

        for(Integer num : sortedMap.keySet()){
            is_half += sortedMap.get(num);
            count++;
            if(is_half > n/2)
                break;
        }

        System.out.println("is_half : " + is_half);
        System.out.println("count : " + count);


        //System.out.println(resultList);

    }

}