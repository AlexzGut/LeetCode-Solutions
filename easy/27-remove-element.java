class Solution {
    /* 
     Using a two-pointer approach where only the element that is different to the value
     that must be removed is kept in the array. The first pointer keeps track of the length of the array
     (the position where the next element should go). The second pointer traverse the array.
     O(N) time complexity
     */
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

// First Approach
// O(N^2) time complexity
// class Solution {
//     public int removeElement(int[] nums, int val) {
//         int length = nums.length;
//         int i = 0;
//         while (i < length) {
//             if (nums[i] == val) {
//                 for (int j = i; j < length - 1; j++) {
//                     nums[j] = nums[j + 1];
//                 }
//                 length--;
//             } else {
//                 i++;    
//             }            
//         }
//         return length;
//     }
// }

// Second Approach
// Using two-pointer approach
// O(N) time complexity
// class Solution {
//     public int removeElement(int[] nums, int val) {
//         int length = nums.length;
//         int l = 0;
//         int r = length - 1;
//         for (int i = 0; i < nums.length; i++) {
//             if (nums[l] == val) {
//                 nums[l] = nums[r];
//                 r--;
//                 length--;
//             } else {
//                 l++;
//             }
//         }
//         return length;
//     }
// }