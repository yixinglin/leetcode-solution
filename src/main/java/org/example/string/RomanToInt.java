package org.example.string;

public class RomanToInt {
    public int solve(String s) {
        int sum = 0;
        int pren = 0;
        for(int i=0; i<s.length(); i++) {
            char c = s.charAt(i);
            int n = this.char2Int(c);
            if (pren < n) {
                sum -= pren;
            } else {
                sum += pren;
            }
            pren = n;
        }
        System.out.println(sum+pren);
        return sum+pren;
    }

    public int char2Int(char c) {
        switch (c) {
            case 'I':
                return 1;
            case 'V':
                return 5;
            case 'X':
                return 10;
            case 'L':
                return 50;
            case 'C':
                return 100;
            case 'D':
                return 500;
            case 'M':
                return 1000;
            default:
                return 0;
        }
    }

    public static void main(String[] args) {
        String s = "III";
        new RomanToInt().solve(s);
    }
}
