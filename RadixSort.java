import java.util.ArrayList;
import java.util.*;

// radix sort, 30.3.2020 by Emily.
class RadixSort {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(1, 6, 2, 6, 2));
        System.out.println("before sort: " + arr);
        radixSort(arr);
        System.out.println("after sort : " + arr);
    }

    public static void radixSort(ArrayList<Integer> arr) {
        if (arr.size() < 2) return;
        int max = arr.get(0);
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) > max) max = arr.get(i);
        }

        for (int index = 1; max/index > 0; index *= 10) {
            countSort(arr, index);
        }

    }
    public static void countSort(ArrayList<Integer> arr, int index) {
        int[] c = new int[10];
        for (int i = 0; i <arr.size(); i++) {
            c[(arr.get(i) / index) % 10]++;
        }
        // update count number
        for (int i = 1; i <10; i++) {
            c[i] += c[i-1];
        }
        int[] tmpArr = new int[arr.size()];
        for(int i = arr.size() -1; i >= 0; --i) {
            tmpArr[c[(arr.get(i) / index) % 10] - 1] = arr.get(i);
            c[(arr.get(i) / index) % 10]--;
        }
        for (int i = 0; i < arr.size(); i++) {
            arr.set(i, tmpArr[i]);
        }
    }



}