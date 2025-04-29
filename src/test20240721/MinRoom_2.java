package test20240721;

import java.util.*;

public class MinRoom_2 {
    public static class Event {
        int time;
        String type;

        Event(int time, String type) {
            this.time = time;
            this.type = type;
        }
    }

    public static int getMinRooms(List<Integer> start, List<Integer> end) {
        List<Event> events = new ArrayList<>();

        for (int s : start) {
            events.add(new Event(s, "s"));
        }
        for (int e : end) {
            events.add(new Event(e, "e"));
        }

        Collections.sort(events, new Comparator<Event>() {
            @Override
            public int compare(Event e1, Event e2) {
                if (e1.time != e2.time) {
                    return Long.compare(e1.time, e2.time);
                }

                if (e1.type.equals("s") && e2.type.equals("e")) {
                    return -1;
                } else if (e1.type.equals("e") && e2.type.equals("s")) {
                    return 1;
                }
                return 0;
            }
        });

        int maxRooms = 0;
        int currentRooms = 0;

        for (Event event : events) {
            if (event.type.equals("s")) {
                currentRooms++;
                maxRooms = Math.max(maxRooms, currentRooms);
            } else {
                currentRooms--;
            }
        }

        return maxRooms;
    }

    public static void main(String[] args) {
        List<Integer> start = Arrays.asList(2, 1, 5, 5, 8);
        List<Integer> end = Arrays.asList(5, 3, 8, 6, 12);

        int result = getMinRooms(start, end);
        System.out.println(result);  // 출력: 3
    }
}