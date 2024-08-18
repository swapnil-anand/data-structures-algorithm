package arrays;

public class LongestEvenOddSubArray {
    public static void main(String[] args) {
        int[] arr = {5,10,21,6,3,8};
        System.out.println(efficientApproachFindLongestEvenOddSubArray(arr));
    }

    // this efficient approach uses kadane's algorithm
    // with some if else condition modified
    public static int efficientApproachFindLongestEvenOddSubArray(int[] arr) {
        int res = 1;
        int current = 1;

        for (int i = 1; i < arr.length; i++) {
            if ((arr[i] % 2 == 0 && arr[i - 1] % 2 == 1) || (arr[i] % 2 == 1 && arr[i - 1] % 2 == 0)) {
                current++;
                res = Math.max(res, current);
            } else {
                current = 1;
            }
        }
        return res;
    }
}
