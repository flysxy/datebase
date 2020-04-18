public class Main_26 {
    // public static void main(String[] args){
    //     int[] nums = {1, 2};
    //     System.out.println(nums.length);
    // }

    public int removeDupicate(int[] nums) {
        if (nums.length == 0) return 0;
        int p = 0;
        int q = 1;
        while (q < nums.length) {
            if (nums[p] != nums[q]) {
                nums[p+1] = nums[q];
                p++;
            }
            q++;
        }
        return p + 1;
    }
}
