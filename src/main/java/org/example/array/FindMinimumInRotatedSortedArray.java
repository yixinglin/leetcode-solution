package org.example.array;

import org.example.Verify;

import javax.crypto.Mac;
import java.util.Arrays;
import java.util.Collections;

public class FindMinimumInRotatedSortedArray {

    public int solution(int[] nums) {
        int min = nums[0];
        int l=0, r=nums.length-1;
        while(l <= r) {
            if (nums[l] < nums[r]) {
                min = Math.min(nums[l], min);
                break;
            }
            int m = (l + r) / 2;
            min = Math.min(nums[m], min);
            if(nums[l] <= nums[m] ) { // Search right
                l = m + 1;
            } else {  // Search left
                r = m -1;
            }
        }
        return min;
    }

    public int solution2(int[] nums) {
        int min = nums[0];
        int l=0, r=nums.length-1;
        while(l <= r) {
            int m = (l + r) / 2;
            if(nums[l] <= nums[m] ) { // Search right
                min = Math.min(nums[l], min);
                l = m + 1;
            } else {  // Search left
                min = Math.min(nums[r], min);
                r = m;
            }
        }
        return min;
    }

    // Best solution. compare nums[mid] with nums[right]
    public int solution3(int[] nums) {
        int l=0, r=nums.length-1, m;
        while(l < r) {
            m = (l + r) / 2;
            if(nums[m] > nums[r]) { // Search right
                l = m+1;
            } else {  // Search left
                r = m;
            }
        }
        return nums[l];
    }

    public int myFirstIdea(int[] nums) {
        int min = Integer.MAX_VALUE;
        int i = 0;
        while (i < nums.length) {
            min = Math.min(min, nums[i]);
            i++;
        }
        return min;
    }

    public static void main(String[] args) {
        FindMinimumInRotatedSortedArray obj = new FindMinimumInRotatedSortedArray();
        Verify.print(obj.solution3(new int[] {4,5,1,2,3}), 1);
        Verify.print(obj.solution3(new int[] {4,5,6,7,0,1,2}), 0);
        Verify.print(obj.solution3(new int[] {0,1,2, 4,5,6,7}), 0);
         Verify.print(obj.solution3(new int[] {2, 1}), 1);
        Verify.print(obj.solution3(new int[] {3,1,2}), 1);
    }
}
