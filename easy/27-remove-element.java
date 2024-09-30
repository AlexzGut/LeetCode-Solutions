class Solution {
    public int removeElement(int[] nums, int val) {
        int l = 0;
        for (int i = 0; i < nums.length; i++) {
            // keep only the elements that are not equal to val
            if (nums[i] != val) {
                nums[l] = nums[i];
                // track the length of the array every time an element is kept.
                l++;
            }
        }
        return l;
    }
}