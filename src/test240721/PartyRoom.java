package test240721;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PartyRoom {

    public static int getMinRooms(List<Integer> start, List<Integer> end) {
        // 이벤트 리스트 생성
        List<int[]> events = new ArrayList<>();
        for (int i = 0; i < start.size(); i++) {
            events.add(new int[]{start.get(i), 1});  // 시작 이벤트
            events.add(new int[]{end.get(i), -1});   // 종료 이벤트
        }

        // 이벤트를 시간 순서대로 정렬
        events.sort((a, b) -> {
            if (a[0] != b[0]) {
                return a[0] - b[0];
            }
            // 같은 시간대일 경우 종료 이벤트가 먼저 처리되도록
            return a[1] - b[1];
        });

        int maxRooms = 0;
        int currentRooms = 0;

        // 정렬된 이벤트 리스트를 순회하면서 현재 필요한 파티룸 수를 계산
        for (int[] event : events) {
            currentRooms += event[1];
            maxRooms = Math.max(maxRooms, currentRooms);
        }

        return maxRooms0
    }

    public static void main(String[] args) {
        List<Integer> start = Arrays.asList(2, 1, 5, 5, 8);
        List<Integer> end = Arrays.asList(5, 3, 8, 6, 12);

        int result = getMinRooms(start, end);
        System.out.println(result);  // 출력: 3
    }
}