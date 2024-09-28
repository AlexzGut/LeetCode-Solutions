class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int n = nums.length;
        int maxConsecutiveOnes = 0;
        int consecutiveOnes = 0;
        for (int i = 0; i < n; i++) {
            if (nums[i] == 1) {
                consecutiveOnes++;
            } else {
                if (consecutiveOnes > maxConsecutiveOnes) {
                    maxConsecutiveOnes = consecutiveOnes;
                }
                consecutiveOnes = 0;
            }
        }
        return Math.max(consecutiveOnes, maxConsecutiveOnes);
    }
}