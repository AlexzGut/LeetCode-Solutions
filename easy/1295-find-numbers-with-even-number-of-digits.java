class Solution {
    public int findNumbers(int[] nums) {
        int n = nums.length;
        int evenCount = 0;
        for (int i = 0; i < n; i++) {
            int digitsCount = 0;
            int num = nums[i];
            while (num != 0) {
                num = num / 10;
                digitsCount++;
            }
            if (digitsCount % 2 == 0) evenCount++;
        }
        return evenCount;
    }
}