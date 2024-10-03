import java.util.List;
import java.util.ArrayList;

class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> result = new ArrayList<>();
        int n = nums.length; 
        int[] positions = new int[n + 1];
        
        // An array contains 1s and 0s. Each 1 indicates that the corresponding the number exists in nums.
        for (int index : nums) {
            positions[index] = 1;
        }
        
        // Find the disappeared numbers and add it to the List.
        for (int i = 1; i < n + 1; i++) {
            if (positions[i] == 0) result.add(i);
        }
        
        return result;
    }
}