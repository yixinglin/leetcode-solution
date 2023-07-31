package org.example.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSums {

    public static List solutions(int[] nums) {
        List<List<Integer>> results = new ArrayList<>();
        Arrays.sort(nums);

        for (int i = 0; i < nums.length; i++) {
            if (i > 0 && nums[i] == nums[i-1])      // skip duplicate solutions
                continue;

            // Two sums solution.
            int l=i+1, r=nums.length-1;   // left-right pointers
            while(l < r) {
                int threeSums = nums[i] + nums[l] + nums[r];
                if (threeSums > 0) {
                    r -= 1;
                } else if (threeSums < 0) {
                    l += 1;
                } else {
                    List<Integer> curSolution = Arrays.asList(nums[i], nums[l], nums[r]);
                    results.add(curSolution);
                    l += 1;
                    while(nums[l] == nums[l-1] && l < r) { // skip duplicate solutions
                        l += 1;
                    }
                }
            }
        }
        return results;
    }


    public static void main(String[] args) {
        int[] in =  {-1,0,1,2,-1,-4};
        System.out.println(Arrays.toString(in));
        List<List<Integer>> out = ThreeSums.solutions(in);
        System.out.println(out);
    }
}
