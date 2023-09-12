# My LeetCode Exercises in Java

## Array
- [#0001](https://youtu.be/KLlXCFG5TnA) TwoSum: [HashMap solution](src/main/java/org/example/array/TwoSums.java)
- [#0121](https://youtu.be/1pkOgXD63yU) Best Time to Buy and Sell Stock: [Sliding Window](src/main/java/org/example/array/BestTimetoBuyandSellStock.java). Find
    local min and search for local max. 
- [#0217](https://youtu.be/3OamzN90kPg) Contains Duplicate: [HashSet](src/main/java/org/example/array/ContainsDuplicate.java).
- [#0053](https://youtu.be/5WZl3MMT0Eg) Maximum Subarray: [Previous subarray](src/main/java/org/example/array/MaximumSubarray.java) can't be negative. 
- [#0015](https://youtu.be/jzZsG8n2R9A) 3Sum: [Sort input](src/main/java/org/example/array/ThreeSums.java), then simplify the problem to the 2Sum problem.
- [#0152](https://youtu.be/lXVy6YWFcRM) Maximum Product Subarray: [DP](src/main/java/org/example/array/MaxProductSubarray.java). Compute max and min for each prefix subarray.
- [#0238](https://youtu.be/bNvIQI2wAjk) Product of Array Except Self: [Prefix & Postfix](src/main/java/org/example/array/ProductOfArrayExceptSelf.java). Make two passes, first in-order, second in-reverse, to compute products.
- [#0153](https://youtu.be/nIVW4P8b1VA) [Find Minimum in Rotated Sorted Array](src/main/java/org/example/array/FindMinimumInRotatedSortedArray.java) - Binary Search
## Linked List
- [#0206](https://youtu.be/G0_I-ZF0S38) Reverse Linked List: [Iterative or Recursive](src/main/java/org/example/list/ReverseLinkedList.java) Iterate through maintaining cur and prev; Recursively reverse, return new head of list
- [#0141](https://youtu.be/gBTe7lFR3vc)Linked List Cycle: [Fast & Slow pointers](src/main/java/org/example/list/LinkedListCycle.java). Hash Set to remember visited nodes; Fast and slow pointers. The loop exists if they meet;
- [#0021](https://youtu.be/XIdigk956u0) Merge Two Sorted Lists: [Insert](src/main/java/org/example/list/MergeTwoSortedLists.java) each node from one list into the other.
- [#0019](https://youtu.be/XVuQxVej6y8) Remove Nth Node From End Of List: [Two Pointers](src/main/java/org/example/list/RemoveNthNodeFromEndOfList.java). Two pointers, second has offset of n from the first.
## String
- [#0242](https://youtu.be/9UtInBqnCgA) [Valid Anagram](src/main/java/org/example/string/ValidAnagram.java), hashmap to count each char in str1, decrement for str2
- [#0003](https://youtu.be/wiGpQwVHdE0) Longest Substring Without Repeating Characters. [Sliding Window](src/main/java/org/example/string/LongestSubstringWithoutRepeatingCharacters.java), Sliding window with hash set.
- [#0020](https://youtu.be/WTzjTskDFMg) [Valid Parentheses](src/main/java/org/example/string/ValidParentheses.java) Use stack.
- [#424](https://youtu.be/gqXU1UyA8pk) [LongestRepeatingCharacterReplacement](src/main/java/org/example/string/LongestRepeatingCharacterReplacement.java) use sliding window to optimize. 
- [#0125](https://youtu.be/jJXJ16kPFWg) [ValidPalindrome](src/main/java/org/example/string/ValidPalindrome.java)
## Sorting Algorithms
Time complexity of O(N^2). [Source code](src/main/java/org/example/array/SortAlgorithmsN2.java). 
- Insertion sort
- Selection sort
- Bubble sort
Time complexity of O(N log N). [Source code](src/main/java/org/example/array/SortAlgorithmsNlogN.java)
- Quick sort
- Merge sort

