# Easy Problems

This document lists the medium problems I've solved along with their descriptions and links to the solutions.

## Two Sum II - Input array is sorted

**Problem Link**: [LeetCode Problem 167](https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/)\
**Description**:

Given a 1-indexed array of integers numbers that is already sorted in non-decreasing order, find two numbers such that they add up to a specific target number. Let these two numbers be numbers[index1] and numbers[index2] where 1 <= index1 < index2 <= numbers.length.

Return the indices of the two numbers, index1 and index2, added by one as an integer array [index1, index2] of length 2.

The tests are generated such that there is exactly one solution. You may not use the same element twice.

Your solution must use only constant extra space.

**Constraints**:

- 2 <= numbers.length <= 3 * 10^4
- -1000 <= numbers[i] <= 1000
- numbers is sorted in non-decreasing order.
- -1000 <= target <= 1000
- The tests are generated such that there is exactly one solution.

## Minimum Size Subarray Sum

**Problem Link**: [LeetCode Problem 209](https://leetcode.com/problems/minimum-size-subarray-sum/)\
**Description**:

Given an array of positive integers nums and a positive integer target, return the minimal length of a 
subarray
 whose sum is greater than or equal to target. If there is no such subarray, return 0 instead.

**Constraints**:

- 1 <= target <= 10^9
- 1 <= nums.length <= 10^5
- 1 <= nums[i] <= 10^4