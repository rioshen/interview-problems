import java.util.HashMap;

/**
 * Problem
 * Finding the second highest number in array.
 */

public class FindSecondMax {
    /**
     * Solution:
     * First we use a HashMap as a counter to record repeat times for each element.
     * After this, iterate through the array, once we find a new highest element, check
     * it in the HashMap, if it is a duplicate, ignore otherwise update the highest.
     *
     * Analysis:
     * Time Complexity: O(N), where N means the number of elements in the array.
     * Space Complexity: O(N), we need a HashMap as a counter.
     */
    public static int findSecond(int[] nums) {
        if (nums == null || nums.length <= 1) {
            throw new IllegalArgumentException("Invalid parameter, array is too short.");
        }

        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int num : nums) {
            if (map.containsKey(num)) {
                map.put(num, map.get(num) + 1);
            } else {
                map.put(num, 1);
            }
        }

        int highest = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;
        for (int num : nums) {
            if (map.get(num) == 1) {
                if (num > highest) {
                    second = highest;
                    highest = num;
                } else if (num > second) {
                    second = num;
                }
            }
        }

        return second;
    }

    public static void main(String[] args) {
        int[] arr = {4, 5, 6, 6, 8, 2, 1, 4};
        System.out.println(findSecond(arr));
    }
}
