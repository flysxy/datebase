import java.util.HashMap;

public class Main_217 {
    public static void main(String[] args) {

    }
    public boolean containsDuplicate(int[] nums) {
        if (nums.length == 0) return false;
        HashMap<Integer> numsSet = new HashMap<>();
        for (int num : nums) {
            if (numsSet.contains(num)) return true;
            else numsSet.add(num);
        }
        return false;

    }

}
