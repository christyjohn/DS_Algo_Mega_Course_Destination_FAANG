package searching;

// O(n)
public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = { 2, 3, 5, 7, 8, 9, 11, 23, 46, 78, 99 };
        int target = 7;
        int index = linearSearch(arr, target);

        System.out.println(target + " found at index : " + index);
    }

    public static int linearSearch(int[] arr, int target) {
        for(int i = 0; i < arr.length - 1; i++) {
            if( arr[i] == target)
                return i;
        }

        return -1;
    }
}
