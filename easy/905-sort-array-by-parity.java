class Solution {
    public int[] sortArrayByParity(int[] nums) {
        // First Approach
        // Time Complexity O(N)
        // Space Complexity O(N) 'Not in place operation'
        
        // int l = 0;
        // int r = nums.length - 1;
        // int[] result = new int[nums.length];
        
        // for (int i = 0; i < nums.length; i++) {
        //     if (nums[i] % 2 == 0) {
        //         result[l++] = nums[i];
        //     } else {
        //         result[r--] = nums[i];
        //     }
        // }
        
        // return result;
        
        // Second Approach
        // Time Complexity O(N)
        // Space Complexity O(1) in place operation
        // Runtime 0 ms
        // Using a Three pointer approach
        // int l = 0;
        // int r = nums.length - 1;
        // int holder = 0;
        
        // for (int i = 0; i < nums.length; i++) {
        //     if (nums[l] % 2 != 0) {
        //         holder = nums[l];
        //         nums[l] = nums[r];
        //         nums[r--] = holder;
        //     } else {
        //         l++;
        //     }
        // }
        // return nums;
        
        // Third Approach
        // Time Complexity O(N)
        // Space Complexity O(1) in place operation
        // Runtime 1 ms
        // Using a two pointer approach
        // Trick - Swap the values when an element is even.
        int l = 0;
        int holder = 0;
        
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0) {
                holder = nums[l];
                nums[l++] = nums[i];
                nums[i] = holder;
            }
        }
        return nums;
    }
}