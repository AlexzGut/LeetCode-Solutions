# Easy Problems

This document lists the easy problems I've solved along with their descriptions and links to the solutions.

## Valid Palindrome

**Problem Link**: [LeetCode Problem 125](https://leetcode.com/problems/valid-palindrome/)\
**Description**:

A phrase is a palindrome if, after converting all uppercase letters into lowercase letters and removing all non-alphanumeric characters, it reads the same forward and backward. Alphanumeric characters include letters and numbers.

Given a string s, return true if it is a palindrome, or false otherwise.

**Constraints**:

- 1 <= s.length <= 2 * 10^5
- s consists only of printable ASCII characters

## Best Time to Buy and Sell Stock

**Problem Link**: [LeetCode Problem 121](https://leetcode.com/problems/best-time-to-buy-and-sell-stock/)\
**Description**:

You are given an array prices where prices[i] is the price of a given stock on the ith day.

You want to maximize your profit by choosing a single day to buy one stock and choosing a different day in the future to sell that stock.

Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0.

**Constraints**:

- 1 <= prices.length <= 10^5
- 0 <= prices[i] <= 10^4

## Remove Duplicates from Sorted Array

**Problem Link**: [LeetCode Problem 26](https://leetcode.com/problems/remove-duplicates-from-sorted-array/)\
**Description**:

Given an integer array nums sorted in non-decreasing order, remove the duplicates in-place such that each unique element appears only once. The relative order of the elements should be kept the same. Then return the number of unique elements in nums.

Consider the number of unique elements of nums to be k, to get accepted, you need to do the following things:

Change the array nums such that the first k elements of nums contain the unique elements in the order they were present in nums initially. The remaining elements of nums are not important as well as the size of nums.
Return k.

**Constraints**:

- 1 <= nums.length <= 3 * 10^4
- -100 <= nums[i] <= 100
- nums is sorted in non-decreasing order

## Find Numbers with Even Number of Digits

**Problem Link**: [LeetCode Problem 1295](https://leetcode.com/problems/find-numbers-with-even-number-of-digits/)\
**Description**:

Given an array nums of integers, return how many of them contain an even number of digits.

**Constraints**:

- 1 <= nums.length <= 500
- 1 <= nums[i] <= 10^5

## Max Consecutive Ones

**Problem Link**: [LeetCode Problem 485](https://leetcode.com/problems/max-consecutive-ones/)\
**Description**:

Given a binary array nums, return the maximum number of consecutive 1's in the array.

**Constraints**:

- 1 <= nums.length <= 10^5
- nums[i] is either 0 or 1.

## Squares of a Sorted Array

**Problem Link**: [LeetCode Problem 977](https://leetcode.com/problems/squares-of-a-sorted-array/)\
**Description**:

Given an integer array nums sorted in non-decreasing order, return an array of the squares of each number sorted in non-decreasing order.

**Constraints**:

- 1 <= nums.length <= 10^4
- -10^4 <= nums[i] <= 10^4
- nums is sorted in non-decreasing order.

## Duplicate Zeros

**Problem Link**: [LeetCode Problem 1089](https://leetcode.com/problems/duplicate-zeros/)\
**Description**:

Given a fixed-length integer array arr, duplicate each occurrence of zero, shifting the remaining elements to the right.

Note that elements beyond the length of the original array are not written. Do the above modifications to the input array in place and do not return anything.

**Constraints**:

- 1 <= arr.length <= 10^4
- 0 <= arr[i] <= 9

## Remove Element

**Problem Link**: [LeetCode Problem 27](https://leetcode.com/problems/remove-element/)\
**Description**:

Given an integer array nums and an integer val, remove all occurrences of val in nums in-place. The order of the elements may be changed. Then return the number of elements in nums which are not equal to val.

Consider the number of elements in nums which are not equal to val be k, to get accepted, you need to do the following things:

- Change the array nums such that the first k elements of nums contain the elements which are not equal to val. The remaining elements of nums are not important as well as the size of nums.
- Return k.

**Constraints**:

- 0 <= nums.length <= 100
- 0 <= nums[i] <= 50
- 0 <= val <= 100

## Check if N and its Double Exist

**Problem Link**: [LeetCode Problem 1345](https://leetcode.com/problems/check-if-n-and-its-double-exist/)\
**Description**:

Given an array arr of integers, check if there exist two indices i and j such that :

- i != j
- 0 <= i, j < arr.length
- arr[i] == 2 * arr[j]

**Constraints**:

- 2 <= arr.length <= 500
- -10^3 <= arr[i] <= 10^3

## Replace Elements with Greatest Element on Right Side

**Problem Link**: [LeetCode Problem 1299](https://leetcode.com/problems/replace-elements-with-greatest-element-on-right-side/)\
**Description**:

Given an array arr, replace every element in that array with the greatest element among the elements to its right, and replace the last element with -1.

After doing so, return the array.

**Constraints**:

- 1 <= arr.length <= 10^4
- 1 <= arr[i] <= 10^5

## Move Zeroes

**Problem Link**: [LeetCode Problem 283](https://leetcode.com/problems/move-zeroes/)\
**Description**:

Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the non-zero elements.

**Note** that you must do this in-place without making a copy of the array.

**Constraints**:

- 1 <= nums.length <= 10^4
- -2^31 <= nums[i] <= 2^31 - 1

## Sort Array By Parity

**Problem Link**: [LeetCode Problem 905](https://leetcode.com/problems/sort-array-by-parity/)\
**Description**:

Given an integer array nums, move all the even integers at the beginning of the array followed by all the odd integers.

Return **any array** that satisfies this condition.

**Constraints**:

- 1 <= nums.length <= 5000
- 0 <= nums[i] <= 5000