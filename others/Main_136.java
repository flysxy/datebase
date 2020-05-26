//  two option: hashmap; ^
// O(n)
class Solution {
    public int singleNumber(int[] nums) {
        HashMap<Integer, Boolean> hashm = new HashMap<>();
        for (int num : nums) {
            if (hash.containsKey(num)) hash.put(num, true);
            else hash.put(num, false);
        }
        for (int k : hash.keySet()) {
            if (!hash.get(k)) return k;
        }
        return -1;
}
// o(1)
class Solution {
    public int singleNumber(int[] nums) {
        int tmp = nums[0];
        for (int i = 1; i < nums.length; i++) {
            tmp ^= nums[i];
        }
        return tmp;
    }
}