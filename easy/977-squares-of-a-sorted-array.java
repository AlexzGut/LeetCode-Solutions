class Solution {
    /*
    This problem is solved using a two-pointer approach. One pointer starts at the beginning of the array,
    while the other pointer starts at the end of the array. The square value of the elements at each pointer is compared.

    - The larger squared value is placed at the end of a new array, ensuring that the elements are sorted in non-decreasing order.
    - The pointer pointing to the element with the larger squared value is then moved — either incrementing the left pointer or
      decrementing the right pointer — and the process repeats until all elements have been placed in the new array. 
    runtime 1ms 
    Time Complexity O(N)
    */
    public int[] sortedSquares(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];
        int left = 0;
        int right = n - 1;
        for (int i = n - 1; i >= 0; i--) {
            int leftSquare = (nums[left] * nums[left]);
            int rightSquare = (nums[right] * nums[right]);
            if (leftSquare > rightSquare) {
                result[i] = leftSquare;
                left++;
            } else {
                result[i] = rightSquare;
                right--;
            }
        }
        return result;
    }
}