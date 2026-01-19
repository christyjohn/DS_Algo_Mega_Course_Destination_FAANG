package searching;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = { 2, 3, 5, 7, 8, 9, 11, 23, 46, 78, 99 };
        int target = 7;
        int index = binarySearch(arr, target);

        System.out.println(target + " found at index : " + index);
    }

    public static int binarySearch(int[] arr, int target) {
        int left = 0, right = arr.length - 1;

        while(left <= right) {
            int mid = (left + right) / 2;
            if(arr[mid] == target)
                return mid;
            else if(arr[mid] > target)
                right = mid - 1;
            else
                left = mid + 1;
        }

        return -1;
    }
}
