package org.example.array;

public class MaximumSubarray {

    public static int maxSubArray(int[] nums) {
        int maxSum = nums[0];
        int curSum = 0;
        for (int i = 0; i < nums.length; i++) {
            if (curSum < 0) {
                curSum = 0;
            }
            curSum += nums[i];
            maxSum = Math.max(curSum, maxSum);
        }
        return maxSum;
    }


    public static int myFirstIdea(int[] nums) {
        int right=0;
        int maxSum = nums[0], curSum=0;
        while(right < nums.length) {
            curSum += nums[right];
            maxSum = Math.max(curSum, maxSum);
            if(curSum < 0) {
                curSum = 0;
            }
            right++;
        }
        return maxSum;
    }

    public static void main(String[] args) {
        // int[] nums ={-2,1,-3,4,-1,2,1,-5,4};
        // int[] nums ={-1};
        int[] nums ={-2, -1};
        int maxSum = MaximumSubarray.myFirstIdea(nums);
        System.out.println(maxSum);
    }

}
