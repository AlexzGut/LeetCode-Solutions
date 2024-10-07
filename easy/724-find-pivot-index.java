class Solution {
    public int pivotIndex(int[] nums) {

//         First Approach
//         O(N^2)
//         for (int index = 0; index < nums.length; index++) {
//             int leftSum = 0;
//             int rightSum= 0;
//             for (int i = 0; i < index; i++) {
//                 leftSum += nums[i];
//             }
//             for (int j = nums.length - 1; j > index; j--) {
//                 rightSum += nums[j];
//             }

//             if (leftSum == rightSum) {
//                 return index;
//             }
//         }
//         return -1;

        
//         Second Approach, following the leetCodes's hints
//         Time complexity O(N)
//         Space complexity O(N)
//         int n = nums.length;
//         int[] leftSum = new int[n];
//         int[] rightSum = new int[n];
//         int l = 1;
//         int r = n - 2;
        
//         for(int i = 1; i < n; i++) {
//             leftSum[l++] = leftSum[i - 1] + nums[i - 1];
//             rightSum[r--] = rightSum[n - i] + nums[n - i];
//         }
//         for(int j = 0; j < n; j++) {
//             if (leftSum[j] == rightSum[j]) return j;
//         }     
//         return -1;
        
        
//      Final Approach
//      Time complexity O(N)
//      Space complexity O(1)
//      Calculating the total sum of the array.
//      1. The right sum will be the total sum - nums[i^th]
//      2. The left sum will starts at 0 and add nums[i^th] in each iteration
//      3. For each possible pivot index we campare the left sum and the right sum, when 
//         they are the same we return the pivot index. if they are not the same for any
//         possible pivot index we return - 1.
        int totalSum = 0;
        for (int i = 0; i < nums.length; i++) {
            totalSum += nums[i];
        }
        
        int leftSum = 0;
        int rightSum = totalSum;
        for (int j = 0; j < nums.length; j++) {
            rightSum -= nums[j];
            if (leftSum == rightSum) {
                return j;
            }
            leftSum += nums[j];
        }
        return -1;
    }
}