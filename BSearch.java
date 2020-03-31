// b search: logn.
// NOTE:
// 1: scenario: depend on array, list can not using.
// 2: date must sorted, if array is arraylist, then not suggest using b search, it can only using insert and delete infrequent scenario(int[]: nice)
//    for arraylist, b search tree is the best way.
// 3: mass date
// 4: others: date must consequent in memory
// 5: compaired with b search tree, b search not need extra memory, so this way it;s the most suggest way durning memory limited.

// assuming no duplicate date in arr; 31.03.2020 by Emily
class BSearch {
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 6, 11};
        System.out.println("index : " + bSearch(arr, 5, 3));
    }

    public static int bSearch(int[] arr, int n, int value) {
        if (n < 1) return -1;
        int low = 0;
        int high = n-1;
        while (low <= high) {
            int mid = low + ((high - low) >> 1);
            if (value == arr[mid]) {
                return mid;
            } else if(arr[mid] < value) {
                low = mid +1;
            } else {
                high = mid -1;
            }
        }
        return -1;
    }

}

// search the first element which is equal to the given value.
class BSearch {
    public static void main(String[] args) {
        int[] arr = {1, 5, 5, 5, 11};
        System.out.println("index : " + bSearch(arr, 5, 5));
    }

    public static int bSearch(int[] arr, int n, int value) {
        if (n < 1) return -1;
        int low = 0;
        int high = n-1;
        while (low <= high) {
            int mid = low + ((high - low) >> 1);
            if (arr[mid] > value) {
                high = mid - 1;
            } else if (arr[mid] < value){
                low = mid + 1;
            } else {
                if (arr[mid -1] != value || mid == 0) return mid;
                else high = mid -1;
            }
        }
        return -1;
    }

}

// search the last element which is equal to the given value.
class BSearch {
    public static void main(String[] args) {
        int[] arr = {1, 5, 5, 5, 11};
        System.out.println("index : " + bSearch(arr, 5, 5));
    }

    public static int bSearch(int[] arr, int n, int value) {
        if (n < 1) return -1;
        int low = 0;
        int high = n-1;
        while (low <= high) {
            int mid = low + ((high - low) >> 1);
            if (arr[mid] > value) {
                high = mid - 1;
            } else if (arr[mid] < value){
                low = mid + 1;
            } else {
                if (arr[mid + 1] != value || mid == high) return mid;
                else low = mid + 1;
            }
        }
        return -1;
    }

}

// search the fist element which is greater or equal to(>=) the given value.
class BSearch {
    public static void main(String[] args) {
        int[] arr = {3, 4, 6, 7, 10};
        System.out.println("index : " + bSearch(arr, 5, 5));
    }

    public static int bSearch(int[] arr, int n, int value) {
        if (n < 1) return -1;
        int low = 0;
        int high = n-1;
        while (low <= high) {
            int mid = low + ((high - low) >> 1);
            if (arr[mid] >= value) {
                if (arr[mid -1] < value || mid == 0) return mid;
                else high = mid -1;
            } else{
                low = mid + 1;
            }
        }
        return -1;
    }

}

// search the last element which is (<=) the given value.
class BSearch {
    public static void main(String[] args) {
        int[] arr = {3, 4, 6, 7, 10};
        System.out.println("index : " + bSearch(arr, 5, 5));
    }

    public static int bSearch(int[] arr, int n, int value) {
        if (n < 1) return -1;
        int low = 0;
        int high = n-1;
        while (low <= high) {
            int mid = low + ((high - low) >> 1);
            if (arr[mid] > value) {
                high = mid -1;
            } else{
                if (arr[mid+1] > value || mid = high) return mid;
                else low = mid + 1;
            }
        }
        return -1;
    }
    }
}