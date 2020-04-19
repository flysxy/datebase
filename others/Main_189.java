
// to be improve
public class Main_189 {
    public void main(String[] args) {


    }
    public static void rotate(int[] nums, int k) {
        k %= nums.length;
        reverse(nums, 0, nums.length);
        reverse(nums, 0, k -1);
        reverse(nums, k, nums.length);

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
