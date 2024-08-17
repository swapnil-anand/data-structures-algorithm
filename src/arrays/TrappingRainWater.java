package arrays;
// url https://leetcode.com/problems/trapping-rain-water/submissions/1358723209/
public class TrappingRainWater {
    public static void main(String[] args) {
        int[] arr = {4,2,0,3,2,5};
        int[] lMax = new int[arr.length];
        int[] rMax = new int[arr.length];
        int res = 0;

        lMax[0] = arr[0];
        for (int i = 1; i < arr.length; i++)
            lMax[i] = Math.max(arr[i], lMax[i - 1]);

        rMax[arr.length - 1] = arr[arr.length - 1];
        for (int i = arr.length - 2; i >= 0; i--)
            rMax[i] = Math.max(arr[i], rMax[i + 1]);

        for (int i = 1; i < arr.length - 1; i++)
            res += (Math.min(lMax[i], rMax[i]) - arr[i]);

        System.out.println(res);
    }
}
