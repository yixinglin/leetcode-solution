package org.example.array;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSums {

    // Enumeration solution
    public static int[] solution1(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[] {i, j};
                }
            }
        }
        return new int[] {};
    }

    // HashMap solution
    public static int[] solution2(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();  // Mapping of value: index;
        for (int i = 0; i < nums.length; i++) {
            int diff = target - nums[i];
            if (map.containsKey(diff)) {
                return new int[] {i, map.get(diff)};
            } else {
                map.put(nums[i], i);
            }
        }
        return null;
    }


    public static void main(String[] args) {
        int[] res = new int[] {3,2,4};
        int[] s1 = TwoSums.solution1(res, 6);
        int[] s2 = TwoSums.solution2(res, 6);
        System.out.println(Arrays.toString(s1));
        System.out.println(Arrays.toString(s2));
    }


}
