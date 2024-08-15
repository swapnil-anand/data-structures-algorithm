package arrays;

import java.util.Arrays;

public class ReverseArray {
    public static void print(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int low = 0, high = arr.length - 1;
        print(arr);

        while (low < high) {
            int curr = arr[low];
            arr[low] = arr[high];
            arr[high] = curr;
            low++;
            high--;
        }

        print(arr);
    }
}
