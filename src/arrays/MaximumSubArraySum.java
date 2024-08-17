package arrays;

public class MaximumSubArraySum {

    public static void main(String[] args) {
        int[] arr = {1,-2,3,-1,2};
        System.out.println(naiveApproachMaximumSubArraySum(arr));
        System.out.println(efficientApproachMaximumSubArraySum(arr));
    }

    public static int naiveApproachMaximumSubArraySum(int[] arr) {
        int res = arr[0];
        for (int i = 0; i < arr.length; i++) {
            int current = 0;
            for (int j = i; j < arr.length; j++) {
                current += arr[j];
                res = Math.max(res, current);
            }
        }
        return res;
    }

    // efficient approach uses kadane's algorithm
    public static int efficientApproachMaximumSubArraySum(int[] arr) {
        int maxSoFar = Integer.MIN_VALUE;
        int maxEndingHere = 0;
        for (int element : arr) {
            maxEndingHere += element;
            if (maxSoFar < maxEndingHere)
                maxSoFar = maxEndingHere;
            if (maxEndingHere < 0)
                maxEndingHere = 0;
        }
        return maxSoFar;
    }
}
