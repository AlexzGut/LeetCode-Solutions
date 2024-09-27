class Solution {
    /*
    This problem is solved using a two-pointer approach. One pointer tracks the index where the next unique element should go, 
    preserving the order of the elements. The other pointer traverses the array, evaluating the value of each element with the previous one.
    - If the elements being compared are different, the element at the index tracked by the first pointer is replaced with the current element where the second pointer is positioned.
    - Duplicate elements are skipped, and only unique elements are retained at the beginning of the array. 
    runtime 0ms 
    Time Complexity O(N)
    */
    public int removeDuplicates(int[] nums) {
        int j = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
                nums[j] = nums[i];
                j++;
            }
        }
        return j;
    }
}