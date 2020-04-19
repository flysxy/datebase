import java.util.ArrayList;
import java.util.HashMap;

public class Main_350 {
    public int[] interSect(int[] nums1, int[] nums2) {
        HashMap<Integer, Integer> hash = new HashMap<>();
        for (int i = 0; i < nums1.length; i++){
            if (hash.containsKey(nums1[i])) hash.put(nums1[i], hash.get(nums1[i]) + 1);
            else hash.put(nums1[i], 1);
        }
        // checking nums2
        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < nums2.length; i++) {
            if (hasp.containsKey(nums2[i]) && hash.get(nums2[i]) > 0) {
                list.add(nums2[i]);
                hasp.put(nums2[i],  hasp.get(nums2[i]) - 1);
            }
        }
        int count = list.size();
        int[] aux = new int[count];
        for(int i = 0; i < count; i++) {
            aux[i] = list.poll();
        }
        return aux;
    }

}
