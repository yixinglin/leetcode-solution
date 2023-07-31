package org.example.string;
public class LengthOfLastWord {

    public int solution(String s) {
        s = " " + s;
        int i = s.length()-1;
        int p1=0, p2=0;
        while(i>=0) {
            if(s.charAt(i) != ' ') {
                p2 = i;
                break;
            }
            i--;
        }

        while(i >= 0) {
            if(s.charAt(i) == ' ') {
                p1 = i;
                break;
            }
            i--;
        }

        return p2-p1;
    }

    public static void main(String[] args) {
        System.out.println(new LengthOfLastWord().solution("a"));
    }
}
