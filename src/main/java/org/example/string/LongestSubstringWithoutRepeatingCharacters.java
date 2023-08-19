package org.example.string;

import java.util.HashSet;
import java.util.Set;

public class LongestSubstringWithoutRepeatingCharacters {

    public int solution(String s) {
        int maxLength = 0;
        int left=0, right=0;
        Set<Character> set = new HashSet<>();
        while(right < s.length()) {
            char c = s.charAt(right);
            while(set.contains(c)) {
                set.remove(s.charAt(left));
                left++;
            }
            set.add(c);
            maxLength = Math.max(right - left + 1, maxLength);
            right++;
        }
        return maxLength;
    }
    public int myFirstIdea(String s) {
        int maxLength = 0;
        int curLength = 0;
        int left=0, right=0;
        Set<Character> set = new HashSet<>();
        while(right < s.length()) {
            char c = s.charAt(right);
            if(set.contains(c)) {
                left = right;
                set = new HashSet<>();
            }
            set.add(c);
            curLength = right - left + 1;
            maxLength = Math.max(curLength, maxLength);
            right++;
        }
        return maxLength;
    }

    public static void main(String[] args) {
        LongestSubstringWithoutRepeatingCharacters obj = new LongestSubstringWithoutRepeatingCharacters();
        int maxLen;
        //maxLen = obj.myFirstIdea("abcabcbb");  //3
       maxLen = obj.myFirstIdea("bbbbb");  //1
       // maxLen = obj.myFirstIdea("pwwkew");  //3
        //maxLen = obj.solution("dvdf");  //3
        System.out.println(maxLen);
    }
}
