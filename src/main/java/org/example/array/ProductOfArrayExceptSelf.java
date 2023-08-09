package org.example.array;

import java.util.Arrays;

public class ProductOfArrayExceptSelf {

    /*
        [1, 2, 3, 4]
        prefix:  [x, 1, 2, 6]
        postfix: [24, 12, 4, x]

     */

    public int[] solution(int[] nums) {
        int[] ans = new int[nums.length];
        int prefix=1, postfix=1;
        for (int i = 0; i < nums.length; i++) {
            ans[i] = prefix;    // Store the prefixes to ans
            prefix *= nums[i];
        }
        for (int i = nums.length-1; i >= 0; i--) {
            ans[i] *= postfix;
            postfix *= nums[i];
        }
        return ans;
    }

    /*
    [1, 2, 3, 4]
    prefix:  [ 1,  2,  6, 24]
    postfix: [24, 24, 12,  4]

 */
    public int[] myFirstIdea(int[] nums) {
        int[] ans1 = new int[nums.length];
        Arrays.fill(ans1, 1);
        int prefix = 1;
        for (int i = 0; i < nums.length; i++) {
            prefix *= nums[i];
            ans1[i] = prefix;
        }

        int[] ans2 = new int[nums.length];
        Arrays.fill(ans2, 1);
        int postfix = 1;
        for (int i = nums.length-1; i >=0; i--) {
            postfix *= nums[i];
            ans2[i] = postfix;
        }

        int[] ans = new int[nums.length];
        Arrays.fill(ans, 1);
        for (int i = 0; i < nums.length; i++) {
            prefix = i-1 < 0? 1: ans1[i-1];
            postfix = i+1 >= nums.length? 1: ans2[i+1];
            ans[i] = prefix*postfix;
        }

        return ans;
    }

    public static void main(String[] args) {
        int[] in = new int[] {1,2,3,4};
        ProductOfArrayExceptSelf obj = new ProductOfArrayExceptSelf();
        int[] ans = obj.solution(in);
        System.out.println(Arrays.toString(ans));
    }
}
