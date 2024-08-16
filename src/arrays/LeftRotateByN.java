package arrays;

import static java.util.Collections.swap;

public class LeftRotateByN {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        int d = 2;
        int n = arr.length;
        printElements(arr);

        // reverse the array for first d index
        reverseArray(arr, 0, d - 1);

        // reverse the same array from d to n - 1 index
        reverseArray(arr, d, n - 1);

        // reverse the whole array to get the shifted array
        reverseArray(arr, 0, n - 1);

        printElements(arr);
    }

    public static void printElements(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void reverseArray(int[] arr, int low, int high) {
        while (low < high) {
            int temp = arr[low];
            arr[low] = arr[high];
            arr[high] = temp;

            low++;
            high--;
        }
    }
}
