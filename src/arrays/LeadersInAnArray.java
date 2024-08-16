package arrays;

public class LeadersInAnArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,4,3};
        // naiveApproachFindLeader(arr);
        efficientApproachFindLeader(arr);
    }

    public static void naiveApproachFindLeader(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int element = arr[i];
            boolean flag = true;
            for (int j = i + 1; j < arr.length; j++) {
                if (element <= arr[j]){
                    flag = false;
                    break;
                }
            }
            if (flag) {
                System.out.print(element + " ");
            }
        }
    }

    public static void efficientApproachFindLeader(int[] arr) {
        int currLeader = arr[arr.length - 1];
        System.out.print(currLeader + " ");
        for (int i = arr.length - 2; i >= 0; i--) {
            if (currLeader < arr[i]) {
                System.out.print(arr[i] + " ");
                currLeader = arr[i];
            }
        }
    }
}
