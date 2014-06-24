/**
 * Problem:
 * 2 sum in java.
 */

import java.util.HashMap;

public class TwoSum {
    /**
     *
     */
    public static int[] findTwoSum(int[] array, int target) {
        int[] result = new int[2];

        if (array == null || array.length <= 1) {
            return result;
        }

        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < array.length; i++) {
            if (map.containsKey(array[i])) {
                int index = map.get(array[i]);
                result[0] = index + 1;
                result[1] = i + 1;
            } else {
                map.put(target - array[i], i);
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int[] arr = {2, 7, 11, 15};
        int target = 9;

        int[] result = findTwoSum(arr, target);
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }
    }
}
