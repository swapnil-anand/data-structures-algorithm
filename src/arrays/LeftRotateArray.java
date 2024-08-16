package arrays;

public class LeftRotateArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        printElements(arr);
        leftRotate(arr, arr.length);
        printElements(arr);
    }

    public static void printElements(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void leftRotate(int[] arr, int n) {
        int temp = arr[0];
        for (int i = 1; i < n; i++) {
            arr[i - 1] = arr[i];
        }
        arr[n - 1] = temp;
    }
}
