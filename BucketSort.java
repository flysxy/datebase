import java.util.ArrayList;
import java.util.*;

// bucket sort, 27.03.2010, by Emily
class BucketSort {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(1, 34, 4, 6, 2, 56, 89, 33, 23, 6, 99, 88));
        System.out.println("before sort: " + arr);
        System.out.println("after sort : " + bucketSort(arr, 20));
        }

    // bucketsize, size of single bucket
    public static ArrayList<Integer> bucketSort(ArrayList<Integer> arr, int bucketSize) {
        if (arr == null || arr.size() < 2) return arr;
        int mix = arr.get(0);
        int max = arr.get(1);
        // update mix and max value
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) < mix) {
                mix = arr.get(i);
            } else if (arr.get(i) > max) {
                max = arr.get(i);
            }
        }
        int bucketCount = (max - mix) / bucketSize + 1;
        ArrayList<ArrayList<Integer>> bucket = new ArrayList<>(bucketCount);
        ArrayList<Integer> resultArr = new ArrayList<>();
        for (int i = 0; i < bucketCount; i++) {
            bucket.add(new ArrayList<Integer>());
        }
        // map date to bucket
        for (int i = 0; i < arr.size(); i++) {
            bucket.get((arr.get(i) - mix) / bucketSize).add(arr.get(i));
        }
        // sort bucket date
        for (int i = 0; i < bucketCount; i++) {
            if (bucket.get(i).size() == 0) continue;
            quickSort(bucket.get(i), 0, bucket.get(i).size() - 1);
            for (int j = 0; j < bucket.get(i).size(); j++) {
                resultArr.add(bucket.get(i).get(j));
            }
        }
        return resultArr;
    }

    public static void quickSort(ArrayList<Integer> arr, int r, int p) {
        if (r >= p) return;
        int q = partition(arr, r, p);
        quickSort(arr, r, q-1);
        quickSort(arr, q+1, p);
    }

    public static int partition(ArrayList<Integer> arr, int r, int p) {
        int privot = arr.get(p);
        int i = r;
        for(int j = r; j < p; j++) {
            if (arr.get(j) <= privot) {
                Collections.swap(arr, i, j);
                i++;
            }
        }
        Collections.swap(arr, i, p);
        return i;
    }
}

