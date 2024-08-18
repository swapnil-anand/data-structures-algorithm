package arrays;

public class MajorityElement {
    public static void main(String[] args) {
        int[] arr = {3,3,3,3,3,2,2};
        System.out.println(naiveApproachFindMajority(arr));
        System.out.println(efficientApproachFindMajority(arr));
    }

    public static int naiveApproachFindMajority(int[] arr) {
        int n = arr.length;
        int majority = arr.length / 2;
        for (int i = 0; i < n; i++) {
            int element = arr[i];
            int counter = 1;
            for (int j = i + 1; j < n; j++) {
                if (element == arr[j])
                    counter++;
            }
            if (counter > majority)
                return i;
        }
        return -1;
    }

    // this efficient approach uses Moore's Majority Voting Element Algorithm
    public static int efficientApproachFindMajority(int[] arr) {
        int res = 0, count = 1;
        for (int i = 1; i < arr.length; i++) {
            if (arr[res] == arr[i])
                count++;
            else
                count--;
            if (count == 0) {
                res = i;
                count = 1;
            }
        }
        count = 0;
        for (int j : arr) {
            if (j == arr[res])
                count++;
        }

        if (count <= arr.length / 2)
            res = -1;
        return res;
    }
}
