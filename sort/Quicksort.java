// quick sort by Emily, 20.03.2020

class Quciksort {
    public static void main(String[] args) {
        System.out.println("----quick sort---");
        int[] arr = {6, 4, 2, 1, 8, 3, 7, 9, 5};
        quicksort(arr);
        printArr(arr);

    }

    public static void quicksort(int[] arr) {
        if (arr == null) return;
        quicksort_internal(arr, 0, arr.length - 1);

    }

    public static void quicksort_internal(int[] arr, int p, int r) {
        if (p >= r) return;
        int q = partition(arr, p, r);
        quicksort_internal(arr, p, q-1);
        quicksort_internal(arr, q+1, r);
    }

    public static int partition(int[] arr, int p, int r) {
        int pivot = arr[r];
        int i = p;
        for (int j = p; j < r ; j++) {
            if (arr[j] < pivot) {
                if (i == j) {
                    i++;
                } else {
                    int tmp = arr[i];
                    arr[i++] = arr[j];
                    arr[j] = tmp;
                }
            }
        }
        int tmp = arr[i];
        arr[i] = arr[r];
        arr[r] = tmp;
        System.out.println("i=" + i);
        return i;
    }

    private static void printArr(int[] arr) {
        for (int anArr : arr) {
            System.out.print(anArr + " ");
        }
    }

}

