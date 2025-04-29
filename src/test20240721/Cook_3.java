package test20240721;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Cook_3 {
    public static long getBestFriendWorkHour(int f, List<Integer> task) {
        long left = Collections.max(task);
        long right = task.stream().mapToLong(Integer::longValue).sum();

        while (left < right) {
            long mid = left + (right - left) / 2;
            if (canDistributeTasks(f, task, mid)) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }

        return left;
    }

    private static boolean canDistributeTasks(int f, List<Integer> task, long maxWorkHour) {
        int friendsNeeded = 1;
        long currentWorkLoad = 0;

        for (long t : task) {
            if (currentWorkLoad + t > maxWorkHour) {
                friendsNeeded++;
                currentWorkLoad = t;
                if (friendsNeeded > f) {
                    return false;
                }
            } else {
                currentWorkLoad += t;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        List<Integer> task1 = Arrays.asList(2, 4, 1, 3, 6, 2, 7, 1, 5);
        int f1 = 4;
        System.out.println(getBestFriendWorkHour(f1, task1)); // 결과 9

        List<Integer> task2 = Arrays.asList(7, 2, 3, 4, 5);
        int f2 = 3;
        System.out.println(getBestFriendWorkHour(f2, task2)); // 결과 9
    }
}