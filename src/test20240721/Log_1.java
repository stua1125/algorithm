package test20240721;

import java.util.*;

public class Log_1 {
    public static List<Integer> getStaleServerCount(int n, List<List<Integer>> log_data, List<Integer> query, int X) {
        // Write your code here
        List<Integer> results = new ArrayList<>();
        Map<Integer, List<Integer>> serverLogs = new HashMap<>();

        for (int i = 1; i <= n; i++) {
            serverLogs.put(i, new ArrayList<>());
        }

        for (List<Integer> log : log_data) {
            int serverId = log.get(0);
            int time = log.get(1);
            serverLogs.get(serverId).add(time);
        }

        for (int qTime : query) {
            int startTime = qTime - X;
            int endTime = qTime;

            Set<Integer> activeServers = new HashSet<>();

            for (Map.Entry<Integer, List<Integer>> entry : serverLogs.entrySet()) {
                int serverId = entry.getKey();
                List<Integer> times = entry.getValue();

                for (int time : times) {
                    if (time >= startTime && time <= endTime) {
                        activeServers.add(serverId);
                        break;
                    }
                }
            }
            int inactiveServerCount = n - activeServers.size();
            results.add(inactiveServerCount);
        }

        return results;
    }

    public static void main(String[] args) {
        int n = 3;  // 서버의 수
        List<List<Integer>> log_data = Arrays.asList(
                Arrays.asList(1, 3),
                Arrays.asList(2, 6),
                Arrays.asList(1, 5)
        );
        List<Integer> query = Arrays.asList(10, 11);
        int X = 5;

        List<Integer> results = getStaleServerCount(n, log_data, query, X);
        for (int count : results) {
            System.out.println(count);  // 예시 출력: [1, 1]
        }

    }
}