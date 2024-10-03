import java.util.Set;
import java.util.HashSet;
class Solution {
    public int thirdMax(int[] nums) {
        int n = nums.length;
        long[] maxs = new long[3];
        for (int i = 0; i < 3; i++) {
            maxs[i] = Long.MIN_VALUE;
        }
        Set<Integer> distincts = new HashSet<>();
        
        for (int i = 0; i < n; i++) {
            if (distincts.contains(nums[i])) continue;
            if (nums[i] >= maxs[0]) {
                maxs[2] = maxs[1];
                maxs[1] = maxs[0];
                maxs[0] = nums[i];
            } else if (nums[i] >= maxs[1]) {
                maxs[2] = maxs[1];
                maxs[1] = nums[i];
            } else if (nums[i] >= maxs[2]) {
                maxs[2] = nums[i];
            }
            distincts.add(nums[i]);
        }

        if (maxs[2] == Long.MIN_VALUE) {
            return (int) maxs[0];
        }
        return (int) maxs[2];
    }
}