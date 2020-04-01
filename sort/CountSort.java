// count sort, 30.03.2010, by Emily

import java.util.*;
class CountSort {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(1, 6, 2, 6, 2));
        System.out.println("before sort: " + arr);
        countSort(arr);
        System.out.println("after sort : " + arr);
    }

    public static void countSort(ArrayList<Integer> arr) {
        // get max
        int max = arr.get(0);
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) > max) max = arr.get(i);
        }
        // mix???? TBC
        int[] c = new int[max+1];
        for (int i = 0; i < arr.size(); i++) {
            c[arr.get(i)]++;
        }

        // update count number
        for(int i = 1; i < max+1; i++) {
            c[i] = c[i] + c[i-1];
        }
        int[] tmpArray = new int[arr.size()];
        for (int i = (arr.size() - 1); i >= 0; --i) {
            int count = c[arr.get(i)] - 1;
            tmpArray[count] = arr.get(i);
            c[arr.get(i)]--;
        }
        for (int i = 0; i < arr.size(); i++) {
            arr.set(i, tmpArray[i]);
        }

    }
}