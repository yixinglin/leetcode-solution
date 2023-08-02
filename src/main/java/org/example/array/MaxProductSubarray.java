package org.example.array;

import java.util.Arrays;

public class MaxProductSubarray {

    private int max(int a, int b, int c) {
        int d = Math.max(a, b);
        return Math.max(d, c);
    }

    private int min(int a, int b, int c) {
        int d = Math.min(a, b);
        return Math.min(d, c);
    }

    public int solution1(int[] nums) {
        int curMax=1, curMin = 1;
        int result = nums[0];
        for (int i = 0; i < nums.length; i++) {
            int n = nums[i];
            int tempMax = curMax*n;
            curMax = max(tempMax, curMin*n, n);
            curMin = min(tempMax, curMin*n, n);
            result = Math.max(result, curMax);
        }
        return result;
    }

    public int solution2(int[] nums) {
        int curMax=1, curMin=1;
        int result = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            int n = nums[i];
            if (n < 0) {
                int temp = curMax;
                curMax = curMin;
                curMin = temp;
            }

            curMax = Math.max(curMax*n, n);
            curMin = Math.min(curMin*n, n);
            result = Math.max(result, curMax);
        }
        return result;
    }


    public int myFirstIdea(int[] nums) {
        int curProd = 1;
        int maxProd = nums[0];
        for (int i = 0; i < nums.length; i++) {
            if (curProd == 0) {
                curProd = 1;
            }
            curProd *= nums[i];
            maxProd = Math.max(curProd, maxProd);
        }
        return maxProd;
    }

    public static void main(String[] args) {
        MaxProductSubarray obj = new MaxProductSubarray();
        int[] in = new int[] {-2,0,-1};
        int out =0;
        in = new int[] {-3,-1,-1}; //3
        System.out.println(obj.solution1(in));
        in = new int[] {3,-1,4}; //4
        System.out.println(obj.solution1(in));
        in = new int[] {-2,0,-1}; //0
        System.out.println(obj.solution1(in));
        in = new int[] {-4,-3,-2}; //12
        System.out.println(obj.solution1(in));
        in = new int[] {2,-5,-2,-4,3};   //24
        System.out.println(obj.solution1(in));
        System.out.println("Passed");
    }
}
