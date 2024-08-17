package arrays;

public class MaximumConsecutiveOne {

    public static void main(String[] args) {
        int[] arr = {1,1,1,0,0,1,1,1,1,0,0,1};
        System.out.println(naiveApproachGetMaximumConsecutiveOne(arr));
        System.out.println(efficientApproachGetMaximumConsecutiveOne(arr));
    }

    public static int naiveApproachGetMaximumConsecutiveOne(int[] arr) {
        int res = 0;
        for (int i = 0; i < arr.length; i++) {
            int currentCounter = 0;
            for (int j = i; j < arr.length; j++) {
                if (arr[j] != 1)
                    break;
                currentCounter++;
            }
            res = Math.max(currentCounter, res);
        }
        return res;
    }

    public static int efficientApproachGetMaximumConsecutiveOne(int[] arr) {
        int res = 0;
        int current = 0;
        for (int element : arr) {
            if (element == 0)
                current = 0;
            else {
                current++;
                res = Math.max(current, res);
            }
        }
        return res;
    }
}
