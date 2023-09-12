package org.example.array;

import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {

    public static boolean solution1(int[] nums) {
        Set<Integer> hashSet = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if (!hashSet.contains(nums[i])) {
                hashSet.add(nums[i]);
            } else {
                return true;
            }
        }
        return false;
    }

    // Brute force solution.
    public static boolean myFirstIdea(int[] nums) {
        Set<Integer> numSet = new HashSet();
        for(int i=0; i < nums.length; i++) {
            if (numSet.contains(nums[i])) {
                return true;
            } else {
                numSet.add(nums[i]);
            }
        }
        return false;
    }



    public static void main(String[] args) {
        int[] nums = {1,1,1,3,3,4,3,2,4,2};
        boolean contain = ContainsDuplicate.myFirstIdea(nums);
        System.out.println(contain);
        contain = ContainsDuplicate.solution1(nums);
        System.out.println(contain);

    }
}
