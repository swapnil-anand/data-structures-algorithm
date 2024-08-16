package arrays;

public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] arr = {10,20,20,30,30,30};

        int res = 1;
        for (int i = 1; i < arr.length; i++) {
            if (arr[res - 1] != arr[i]){
                arr[res] = arr[i];
                res++;
            }
        }

        System.out.println(res);
    }
}
