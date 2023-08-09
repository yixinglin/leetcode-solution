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
## Linked List
- [#0206](https://youtu.be/G0_I-ZF0S38) Reverse Linked List: [Iterative or Recursive](src/main/java/org/example/list/ReverseLinkedList.java) Iterate through maintaining cur and prev; Recursively reverse, return new head of list
- [#0141](https://youtu.be/gBTe7lFR3vc)Linked List Cycle: [Fast & Slow pointers](src/main/java/org/example/list/LinkedListCycle.java). Hash Set to remember visited nodes; Fast and slow pointers. The loop exists if they meet;
- [#0021](https://youtu.be/XIdigk956u0) Merge Two Sorted Lists: [Insert](src/main/java/org/example/list/MergeTwoSortedLists.java) each node from one list into the other.
## String