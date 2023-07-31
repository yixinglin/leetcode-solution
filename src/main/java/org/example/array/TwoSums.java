package org.example.array;

public class TwoSums {

    public static int[] solution(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[] {i, j};
                }
            }
        }
        return new int[] {};
    }


    public static void main(String[] args) {
        int[] res = new int[] {3,2,4};

        int[] s = TwoSums.solution(res, 6);
        System.out.println();
    }
}
