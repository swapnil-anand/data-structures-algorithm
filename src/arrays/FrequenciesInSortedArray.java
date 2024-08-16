package arrays;

import java.util.HashMap;
import java.util.Map;

public class FrequenciesInSortedArray {

    public static void main(String[] args) {
        int[] arr = {10,10,10, 30,30, 30, 50, 50};
        naiveApproachFrequency(arr);
        hashApproachFrequency(arr);
    }

    public static void naiveApproachFrequency(int[] arr) {
        int currentElement = arr[0];
        int currentFrequency = 1;
        for (int i = 1; i < arr.length; i++) {
            if (currentElement != arr[i]){
                System.out.println(currentElement + " " + currentFrequency);
                currentFrequency = 1;
                currentElement = arr[i];
                continue;
            }
            currentFrequency++;

            if (i == arr.length - 1) {
                System.out.println(currentElement + " " + currentFrequency);
            }
        }
    }

    public static void hashApproachFrequency(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int element : arr) {
            if (map.containsKey(element)) {
                map.put(element, map.get(element) + 1);
            } else {
                map.put(element, 1);
            }
        }
        map.forEach((key, value) -> System.out.println(key + " " + value));
    }
}
