package org.example.string;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class LongestRepeatingCharacterReplacement {

    public int myFirstIdea(String s, int k) {
        Map<Character, Integer> counts = new HashMap<>();
        int left=0, right=0, maxLength = 0, cnt;
        char rc, lc;
        char[] chs = s.toCharArray();
        while(right < chs.length) {
            rc = chs[right]; // Right character
            cnt = counts.containsKey(rc)? counts.get(rc)+1: 1; // Current count of c
            counts.put(rc, cnt);
            int maxCount = Collections.max(counts.entrySet(), Entry.comparingByValue()).getValue();
            if(right-left+1 - maxCount > k) {
                lc = chs[left];  // Left character
                counts.put(lc, counts.get(lc) - 1);
                left++;
            }
            maxLength = Math.max(maxLength, right-left+1);
            right++;
        }
        return maxLength;
    }

    public static void main(String[] args) {
        LongestRepeatingCharacterReplacement obj = new LongestRepeatingCharacterReplacement();
        int len = obj.myFirstIdea("ABABBA", 2);
        // int len = obj.myFirstIdea("AABABBA", 1);
        System.out.println(len);
    }
}
