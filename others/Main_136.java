import java.util.HashMap;

// O(n)
public class Main_136 {
    public static void mian(String[] args) {

    }
    public static int singleNumber(int[] nums) {
        HashMap<Integer, Boolean> hasp = new HashMap<>();
        for (int num : nums) {
            if (hsm.containsKey(num)) hasp.put(num, true);
            else hasp.put(num, false);
        }
        for (int k: hasp.keySet()) {
            if (hasp.get(k) == false) return k;
        }
        return -1;
    }

}
// o(1)

public class Main_136 {
    public static void mian(String[] args) {

    }
    public static int singleNumber(int[] nums) {
        int tmp = nums[0];
        if (nums.length > 1) {
            for (int i = 1; i < nums.length; i++) {
                tmp = tmp^ nums[i];
            }
        }
        return tmp;
    }

}
