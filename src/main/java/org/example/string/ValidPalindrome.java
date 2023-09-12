package org.example.string;

import org.example.Verify;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ValidPalindrome {

//    public boolean myFirstIdea(String s) {
//        List<Character> arr = new ArrayList();
//        s = s.toLowerCase();
//        for (int i=0; i<s.length(); i++) {
//            if ((s.charAt(i) >= 'a' && s.charAt(i) <= 'z') || (s.charAt(i) <= '9' && s.charAt(i) >= '0')) {
//                arr.add( s.charAt(i));
//            }
//        }
//        Character[] cs = arr.stream().toArray(Character[]::new);
//        int left=0, right= cs.length-1;
//        while(left < right) {
//            while (left < cs.length && !((cs[left] >= 'a' && cs[left] <= 'z') || (cs[left] >= '0' && cs[left] <= '9'))) {
//                left++;
//            }
//
//            while (right > 0 && !((cs[right] >= 'a' && cs[right] <= 'z') || (cs[right] >= '0' && cs[right] <= '9'))) {
//                right--;
//            }
//
//            if (cs[right] == cs[left]) {
//                left++; right--;
//            } else {
//                return false;
//            }
//        }
//        return true;
//    }


    public static boolean myFirstIdea(String s) {
        s = s.toLowerCase();
        StringBuffer sb = new StringBuffer();
        char c;
        for (int i = 0; i < s.length(); i++) {
            c = s.charAt(i);
            if (Character.isLetterOrDigit(c)) {
                sb.append(c);
            }
        }
        StringBuffer sbrev =new StringBuffer(sb).reverse();
        return sbrev.toString().equals(sb.toString());
    }

    public static void main(String[] args) {
        ValidPalindrome obj = new ValidPalindrome();
        Verify.print(obj.myFirstIdea("A man, a plan, a canal: Panama"), true);
        Verify.print(obj.myFirstIdea("race a car"), false);
        Verify.print(obj.myFirstIdea(".,"), true);
        Verify.print(obj.myFirstIdea(" "), true);
        Verify.print(obj.myFirstIdea("0P"), false);
    }
}
