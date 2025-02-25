class Solution {
    public int[] twoSum(int[] nums, int target) {
        // brute force solution
        // Time complexity O(N^2)
        // for (int i = 0; i < nums.length - 1; i++) {
        //     for (int j = i + 1; j < nums.length; j++) {
        //         if (nums[i] + nums[j] == target) return new int[]{i, j};
        //     }
        // }  
        // return null;     

        // optimal solution, extra space (hashmap).
        //    value, index
        Map<Integer, Integer> traversed = new HashMap<>();
        int i = 0, diff = 0;
        for (; i < nums.length; i++) {
            diff = target - nums[i]; // calculates the number that added to nums[i] is equal to the target number.
            if (traversed.containsKey(diff)) { // checks if the necessary number to add to nums[i] has been traversed already.
            //if true, exits the loop.
                break;
            // otherwise, adds nums[i] and its index to the Map
            } else {
                traversed.put(nums[i], i);
            }
        }
        return new int[] {traversed.get(diff), i};
    }
}