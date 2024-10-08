class Solution {
    public int dominantIndex(int[] nums) {
        int maxIndex = 0;
        
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > nums[maxIndex]) {
                maxIndex = i;
            }
        }
        
        for (int j = 0; j < nums.length; j++) {
            if (j != maxIndex && 2 * nums[j] > nums[maxIndex]) return -1;
        }
        
        return maxIndex;
    }
}
