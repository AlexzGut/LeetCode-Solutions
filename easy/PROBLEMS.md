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

## Height Checker

**Problem Link**: [LeetCode Problem 1051](https://leetcode.com/problems/height-checker/)\
**Description**:

A school is trying to take an annual photo of all the students. The students are asked to stand in a single file line in **non-decreasing order** by height. Let this ordering be represented by the integer array expected where expected[i] is the expected height of the ith student in line.

You are given an integer array heights representing the **current order** that the students are standing in. Each heights[i] is the height of the ith student in line (**0-indexed**).

Return the ***number of indices*** where heights[i] != expected[i].

**Constraints**:

- 1 <= heights.length <= 100
- 1 <= heights[i] <= 100

## Third Maximum Number

**Problem Link**: [LeetCode Problem 414](https://leetcode.com/problems/third-maximum-number/)\
**Description**:

Given an integer array nums, return the third distinct maximum number in this array. If the third maximum does not exist, return the maximum number.

**Constraints**:

- 1 <= nums.length <= 10^4
- -2^31 <= nums[i] <= 2^31 - 1

## Find All Numbers Disappeared in an Array

**Problem Link**: [LeetCode Problem 448](https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/)\
**Description**:

Given an array nums of n integers where nums[i] is in the range [1, n], return an array of all the integers in the range [1, n] that do not appear in nums.

**Constraints**:

- n == nums.length
- 1 <= n <= 10^5
- 1 <= nums[i] <= n

## Merge Sorted Array

**Problem Link**: [LeetCode Problem 88](https://leetcode.com/problems/merge-sorted-array/)\
**Description**:

You are given two integer arrays nums1 and nums2, sorted in **non-decreasing order**, and two integers m and n, representing the number of elements in nums1 and nums2 respectively.

**Merge** nums1 and nums2 into a single array sorted in **non-decreasing order**.

The final sorted array should not be returned by the function, but instead be ***stored inside the array*** nums1. To accommodate this, nums1 has a length of m + n, where the first m elements denote the elements that should be merged, and the last n elements are set to 0 and should be ignored. nums2 has a length of n.

**Constraints**:

- nums1.length == m + n
- nums2.length == n
- 0 <= m, n <= 200
- 1 <= m + n <= 200
- -10^9 <= nums1[i], nums2[j] <= 10^9

## Find Pivot Index

**Problem Link**: [LeetCode Problem 724](https://leetcode.com/problems/find-pivot-index/)\
**Description**:

Given an array of integers nums, calculate the **pivot index** of this array.

The **pivot index** is the index where the sum of all the numbers **strictly** to the left of the index is equal to the sum of all the numbers **strictly** to the index's right.

If the index is on the left edge of the array, then the left sum is 0 because there are no elements to the left. This also applies to the right edge of the array.

Return the ***leftmost pivot index.*** If no such index exists, return -1.

**Constraints**:

- 1 <= nums.length <= 10^4
- -1000 <= nums[i] <= 1000

## Largest Number At Least Twice of Others

**Problem Link**: [LeetCode Problem 747](https://leetcode.com/problems/largest-number-at-least-twice-of-others/)\
**Description**:

You are given an integer array nums where the largest integer is **unique**.

Determine whether the largest element in the array is **at least twice** as much as every other number in the array. If it is, return the **index** of the largest element, or return -1 otherwise.

**Constraints**:

- 2 <= nums.length <= 50
- 0 <= nums[i] <= 100
- The largest element in nums is unique.

## Plus One

**Problem Link**: [LeetCode Problem 66](https://leetcode.com/problems/plus-one/)\
**Description**:

You are given a large integer represented as an integer array digits, where each digits[i] is the ith digit of the integer. The digits are ordered from most significant to least significant in left-to-right order. The large integer does not contain any leading 0's.

Increment the large integer by one and return the resulting array of digits.

**Constraints**:

- 1 <= digits.length <= 100
- 0 <= digits[i] <= 9
- digits does not contain any leading 0's.

## Reverse String

**Problem Link**: [LeetCode Problem 344](https://leetcode.com/problems/reverse-string/)\
**Description**:

Write a function that reverses a string. The input string is given as an array of characters s.

You must do this by modifying the input array in-place with O(1) extra memory.

**Constraints**:

- 1 <= s.length <= 10^5
- s[i] is a printable ascii character.

## Two Sum

**Problem Link**: [LeetCode Problem 1](https://leetcode.com/problems/two-sum/)\
**Description**:

Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

You can return the answer in any order.

**Constraints**:

- 2 <= nums.length <= 10^4
- -10^9 <= nums[i] <= 10^9
- -10^9 <= target <= 10^9
- **Only one valid answer exists.**