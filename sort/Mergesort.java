// merge sort, by Emily- 20.3.2020
class Mergesort {
    public static void main(String[] args)
    {
        System.out.println("----merge sort---");
        int[] arr = {6, 4, 2, 1, 8, 3, 7, 9, 5};
        merge(arr);
        printArr(arr);
    }

    public static void merge(int[] arr) {
        if (arr == null) return;
        merge_sort(arr, 0, arr.length - 1);
    }

    public static void merge_sort(int[] arr, int start, int end) {
        if (start >= end) return;
        // int mid = start + (end - start)<<2;
        int mid = start + (end - start >> 1);
        merge_sort(arr, start, mid);
        merge_sort(arr, mid+1, end);
        merge_all(arr, start, mid, end);
    }

    public static void merge_all(int[] arr, int start, int mid, int end) {
        int[] tmpArr = new int[arr.length];
        int start1 = start;
        int start2 = mid + 1;
        int end1 = mid;
        int end2 = end;
        int pos = start1;
        int tmp = start1;
        while(start1 <= end1 && start2 <= end2) {
            if (arr[start1] <= arr[start2]){
                tmpArr[pos++] = arr[start1++];
            } else {
                tmpArr[pos++] = arr[start2++];
            }
        }

        while (start1 <= end1) {
            tmpArr[pos++] = arr[start1++];
        }

        while (start2 <= end2) {
            tmpArr[pos++] = arr[start2++];
        }
        // copy work
        while (tmp <= end) {
            arr[tmp] = tmpArr[tmp++];
        }

    }
    private static void printArr(int[] arr) {
        for (int anArr : arr) {
            System.out.print(anArr + " ");
        }
    }

}
//  for pratise
class MergeSort {
    public void mergerSort(int[] arr) {
        if (arr == null) return;
        merge(arr, 0, arr.length - 1);
    }

    public static void merge(int[] arr, int start, int end) {
        if (start >= end) return;
        int mid = start + (end - start >> 1);
        merge(arr, start, mid);
        merge(arr, mid+1, end);
        merge_all(arr, start, mid, end);
    }
    public static void merge_all(int[] arr, int start,int mid , int end) {
        int[] tmpArr = new int[arr.length];
        int start1 = start;
        int start2 = mid +1;
        int end1 = mid;
        int end2 = end;
        int pos = start1;
        int tmp = start1
        while (start1 <= end1 && start2 <= end2) {
            if (arr[start1] <= arr[start2]) {
                tmpArr[pos++] = arr[start1++];
            } else {
                tmpArr[pos++] = arr[start2++];
            }
        }
        while (start1 <= end1) {
            tmpArr[pos++] = arr[start1++];
        }
        while (start2 <= end2) {
            tmpArr[pos++] = arr[start2++]
        }
        while (tmp <= end) {
            arr[tmp] = tmpArr[tmp++];
        }

    }

}