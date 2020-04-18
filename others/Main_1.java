import java.util.HashMap;

// 给定 nums = [2, 7, 11, 15], target = 9
// 因为 nums[0] + nums[1] = 2 + 7 = 9
// 所以返回 [0, 1]
public class Main_1 {
    public int[] twoSun(int[] num, int target) {
        HashMap<Integer, Integer> hash = new HashMap<>();
        for (int i = 0; i < num.length; i++) {
            int tmp = target - num[i];
            if (hash.containsKey(tmp)) {
                return new int[] {hash.get(tmp), i}

            }
            hash.put(num[i], i);
        }
    }

}
