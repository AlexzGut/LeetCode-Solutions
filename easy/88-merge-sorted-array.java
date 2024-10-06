class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int l = m - 1;
        int r = n - 1;
        int i = m + n - 1;
        /*
        Final Approach
        This solution uses a two-pointer approach to compare the largest elements from two sorted arrays.
        Starting from the end of both arrays, the largest element is placed at the end of nums1.
        The process continues until all elements from nums2 have been merged into nums1.

        A key aspect of this approach is handling edge cases, such as when m = 0 (no elements in nums1 initially) and n = 1 (only one element in nums2).
        It's crucial to add a validation to ensure that the pointer tracking the largest element in nums1 doesn't go out of bounds (i.e., when m is already exhausted).
        This prevents errors and ensures proper merging of the arrays
        */
        while (r >= 0) {
            if (l >= 0 && nums1[l] >= nums2[r]) {
                nums1[i] = nums1[l--];
                i--;
            } else {
                nums1[i] = nums2[r--];
                i--;
            }
        }

        /* 
        First Approach
        I first copy the elements from nums2 into nums1 in reverse order, placing them in the positions where nums1 has zeros.
        Next, I use a two-pointer approach: one pointer starts at the beginning of nums1, and the other pointer starts at the end.
        I compare the values at both pointers and repeatedly insert the smaller value into the next available position in an auxiliar array,
        continuing until all elements are merged in sorted order. Finally I copy all the elements into nums1.
        */
        // for (int i = 0; i < n; i++) {
        //     nums1[nums1.length - n + i] = nums2[n - 1 - i];
        // }
        
        // int l = 0;
        // int r = nums1.length - 1;
        // int[] holder = new int[m + n];
        // for (int i = 0; i < nums1.length; i++) {
        //     if (nums1[l] < nums1[r]) {
        //         holder[i] = nums1[l];
        //         l++;
        //     } else {
        //         holder[i] = nums1[r];
        //         r--;
        //     }
        // }
        
        // for (int i = 0; i < m + n; i++) {
        //     nums1[i] = holder[i];
        // }
    }
}