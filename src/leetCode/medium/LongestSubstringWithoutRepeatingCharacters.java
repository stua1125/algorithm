package leetCode.medium;

import java.util.HashSet;

public class LongestSubstringWithoutRepeatingCharacters {

    public static void main(String[] args) {
        String s1 = "abcabcbb";
        String s2 = "bbbbbb";
        String s3 = "pwwkew";
        int result = lengthOfLongestSubstring(s1);
        int result2 = lengthOfLongestSubstring(s2);
        int result3 = lengthOfLongestSubstring(s3);

        System.out.println(result);
        System.out.println(result2);
        System.out.println(result3);

    }

    public static int lengthOfLongestSubstring(String s) {

        int max = 0;
        int pointer = 0;
        int window_slide = 0;
        HashSet<Character> set = new HashSet<>();

        while(pointer < s.length()) {
            if(!set.contains(s.charAt(pointer))){
                set.add(s.charAt(pointer));
                int len = pointer - window_slide + 1;
                if (max < len) {
                    max = len;
                }
                pointer++;
            } else {
                set.remove(s.charAt(window_slide));
                window_slide++;
            }
        }

        return max;
    }
}
