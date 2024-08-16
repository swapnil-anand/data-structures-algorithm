package arrays;

public class MoveZerosToEnd {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 0, 3, 0, 4};
        printElements(arr);
        arr = naiveApproach(arr);
        printElements(arr);
    }

    public static void printElements(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static int[] naiveApproach(int[] arr) {
        // this approach takes additional space for array allocation
        // however this completes under O(N) time complexity
        // naive approach with extra space
        int[] newArray = new int[arr.length];
        int res = 1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0)
                continue;
            newArray[res - 1] = arr[i];
            res++;
        }
        return newArray;
    }
}
