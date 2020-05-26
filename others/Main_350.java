import java.util.ArrayList;
import java.util.HashMap;
class Solution {
    public int[] interSect(int[] nums1, int[] nums2) {
        HashMap<Integer, Integer> hash = new HashMap<>();
        for (int num: nums1) {
            if (hash.containsKey(num)) hash.put(num, hash.get(num) + 1);
            else hash.put(num, 1);
        }
        LinkedList<Integer> list = new LinkedList<Integer>();
        for (int i = 0; i < nums2.length; i++) {
            if (hash.containsKey(nums2[i]) && (hash.get(nums2[i]) > 0)) {
                list.add(nums2[i]);
                hash.put(nums2[i], hash.get(nums2[i]) - 1);
            }
        }
        int count = list.size();
        int aux[] = new int[count];
        for (int j = 0; j < count ; j++) {
            aux[j] = list.poll();
        }
        return aux;
    }
}
