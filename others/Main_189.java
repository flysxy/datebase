
// to be improve
class Solution {
    public void rotate(int[] nums, int k) {
        k %= nums.length;
        reverse(nums, 0, nums.length - 1);
        reverse(nums, 0, k-1);
        reverse(nums, k, nums.length - 1);

    }
    public static void reverse(int[] nums, int p, int q) {
        while (p < q) {
            int tmp = nums[p];
            nums[p] = nums[q];
            nums[q] = tmp;
            p++;
            q--;
        }
    }

}

