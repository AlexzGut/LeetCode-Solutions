class Solution {
    public void moveZeroes(int[] nums) {
        // Time complexity O(N)
        int l = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) nums[l++] = nums[i];
        }
        
        for (int j = l; j < nums.length; j++) {
            nums[j] = 0;
        }
    }
}
