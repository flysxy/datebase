// copy not zero in front, then set last as zero
public class Main_283 {
    public void moveZero(int[] nums){
        int index = 0;
        for(int num : nums) {
            if (num != 0) {
                nums[index++] = num;
            }
        }
        while (index < nums.length) {
            nums[index++] = 0;
        }
    }

}
