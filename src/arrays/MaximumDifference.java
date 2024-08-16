package arrays;

public class MaximumDifference {
    public static void main(String[] args) {
        int[] arr = {2,3,10,6,4,8,1};
        System.out.println(naiveApproachMaxDifference(arr));
        System.out.println(efficientApproachMaxDifference(arr));
    }

    public static int naiveApproachMaxDifference(int[] arr) {
        int res = arr[1] - arr[0];
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++ ) {
                res = Math.max(res, arr[j] - arr[i]);
            }
        }
        return res;
    }

    public static int efficientApproachMaxDifference(int[] arr) {
        int minValue = arr[0], res = arr[1] - arr[0];
        for (int i = 1; i < arr.length; i++) {
            res = Math.max(res, arr[i] - minValue);
            minValue = Math.min(minValue, arr[i]);
        }
        return res;
    }
}
