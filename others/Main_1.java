import java.util.HashMap;

// 给定 nums = [2, 7, 11, 15], target = 9
// 因为 nums[0] + nums[1] = 2 + 7 = 9
// 所以返回 [0, 1]

class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> hash = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int tmp = target - nums[i];
            if (hash.containsKey(tmp)) {
                return new int[] {hash.get(tmp), i};
            }
            hash.put(nums[i], i);
        }
        throw new IllegalArgumentException("new two sums solution");
    }
}