package org.example.array;

import java.util.ArrayList;
import java.util.List;

public class ThreeSums {

    public static List solutions(int[] nums) {
        List<List<Integer>> results = new ArrayList<>();
        for (int k=0; k < nums.length; k++) {
            for (int j=k+1; j < nums.length; j++) {
                for (int i=j+1; i < nums.length; i++) {
                    if (nums[i]+nums[j]+nums[k] == 0) {
                        List<Integer> subsolution = new ArrayList<>();
                        subsolution.add(nums[i]);
                        subsolution.add(nums[j]);
                        subsolution.add(nums[k]);
                        results.add(subsolution);
                    }
                }
            }

        }
        return results;
    }


    public static void main(String[] args) {
        int[] in =  {-1,0,1,2,-1,-4};
        List<List<Integer>> out = ThreeSums.solutions(in);
        System.out.println(out);
    }
}
