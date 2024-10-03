class Solution {
    public int[] replaceElements(int[] arr) {
        // First Approach
        // Time Complexity O(N^2)
        // for (int i = 0; i < arr.length - 1; i++) {
        //     int greatest = arr[i + 1];
        //     for (int j = i + 2; j < arr.length; j++){
        //         if (arr[j] > greatest) greatest = arr[j];
        //     }
        //     arr[i] = greatest;            
        // }
        // arr[arr.length - 1] = -1;
        // return arr;
        
        // Final Approach
        // Time Complexity O(N)
        // 1. Starting from the end of the array.
        // 2. Assuming the greatest element is -1 for now.
        // 3. having a variable placeholder that will take the value of the current element we are evaluating.
        // 4. We assign the greatest element until now to the current element and then check if the current               
        //    element is greater than the greatest element and reassign accordingly.
        int greatest = -1;
        int element = 0;
        for (int i = arr.length - 1; i >= 0 ; i--) {
            element = arr[i];
            arr[i] = greatest;
            if (element > greatest) greatest = element;
        }
        return arr;
    }
}