package org.example.string;

public class LongestPrefix {

    public String solution(String[] strs) {
        String prefix = strs[0];
        for (int i = 1; i < strs.length; i++) {
            prefix = this.lcp(strs[i], prefix);
        }

        System.out.println(prefix);
        return prefix;
    }

    private String lcp(String a, String b) {
        int len = Math.min(a.length(), b.length());
        int i = 0;
        for (i = 0; i < len; i++) {
            if (a.charAt(i) != b.charAt(i)) {
                break;
            }
        }
        return a.substring(0, i);
    }

    public static void main(String[] args) {
        String[] strs = new String[] {"flower","flow","flight"};
        new LongestPrefix().solution(strs);
    }
}
