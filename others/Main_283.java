// copy not zero in front, then set last as zero
class Solution {
    public void moveZeroes(int[] nums) {
        int i = 0;
        for (int num : nums) {
            if (num != 0)
            nums[i++] = num;
        }
        while (i < nums.length) {
            nums[i++] = 0;
        }
    }
}