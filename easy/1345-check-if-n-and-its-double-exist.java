class Solution {
    public boolean checkIfExist(int[] arr) {
        // First Approach
        // O(2^N) time complexity
        // for (int i = 0; i < arr.length; i++) {
        //     for (int j = 1; j < arr.length; j++) {
        //         if (arr[i] == 2 * arr[j]) return true;
        //     }
        // }
        // return false;
        
	// Final Approach
        // The underline Data Structure is a hashTable. Checking if an element is in the HashSet has an
        // average time complexit O(1).
        // This algorithm has a Time Complexity of O(N).
        Set<Integer> nums = new HashSet(); 

        for (int i = 0; i < arr.length; i++) {
            if (nums.contains(arr[i]*2) || (arr[i] % 2 == 0 &&  nums.contains(arr[i]/2))) 
                return true;
            nums.add(arr[i]);
        }
        return false;
    }
}