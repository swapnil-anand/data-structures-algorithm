package arrays;

public class MaximumCircularSubArray {
    public static void main(String[] args) {
        int[] arr = {5,2,-3,4};
        System.out.println(overallMaxSum(arr));

    }

    public static int kadaneAlgorithmNormal(int[] arr) {
        int maxSoFar = Integer.MIN_VALUE;
        int maxEnding = 0;
        for (int element : arr) {
            maxEnding += element;
            if (maxSoFar < maxEnding)
                maxSoFar = maxEnding;
            if (maxEnding < 0)
                maxEnding = 0;
        }
        return maxSoFar;
    }

    public static int overallMaxSum(int[] arr) {
        int maxNormal = kadaneAlgorithmNormal(arr);
        if (maxNormal < 0)
            return maxNormal;
        int arrSum = 0;
        for (int i = 0; i < arr.length; i++) {
            arrSum += arr[i];
            arr[i] = -arr[i];
        }
        int maxCircular = arrSum + kadaneAlgorithmNormal(arr);
        return Math.max(maxNormal, maxCircular);
    }
}
