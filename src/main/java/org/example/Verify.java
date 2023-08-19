package org.example;

import java.util.List;

public class Verify {

    public static boolean arrayEqual(Integer[] a, Integer[] b) {
        for (int i = 0; i < a.length; i++) {
            if (a[i] != b[i]) {
                return false;
            }
        }
        return true;
    }

    public static boolean arrayEqual(List<Integer> a, List<Integer> b) {
        return arrayEqual((Integer[]) a.toArray(), (Integer[]) b.toArray());
    }

    public static void print(Object ans, Object expect) {
        System.out.print(ans);
        System.out.print(" ");
        System.out.println(expect);
    }
}
