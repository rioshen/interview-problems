/**
 * Problem
 * Binary Search Functional Programming.
 */

public class BinarySearch {
    /**
     * Solution:
     * Find the target element recursively.
     *
     * Analysis:
     * Time Complexity: O(logN), where N means the number of elements in the array.
     * Space Complexity: O(logN), recursion requires additional space.
     */
    public static boolean binarySearchRec(int[] nums, int target) {
        return binarySearchRecHelper(nums, 0, nums.length - 1, target);
    }

    private static boolean binarySearchRecHelper(int[] nums, int low, int high, int target) {
        if (low >= high) return false;

        int mid = low + (high - low) / 2;
        int midValue = nums[mid];
        if (target == midValue) {
            return true;
        } else if (target < midValue) {
            return binarySearchRecHelper(nums, low, mid - 1, target);
        } else {
            return binarySearchRecHelper(nums, mid + 1, high, target);
        }
    }

    public static boolean binarySearch(int[] nums, int target) {
        if (nums == null || nums.length == 0) return false;

        int low = 0;
        int high = nums.length - 1;
        while (low < high) {
            int mid = low + (high - low) / 2;
            int midValue = nums[mid];

            if (target == midValue) {
                return true;
            } else if (target < midValue) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7};
        System.out.println(binarySearchRec(array, 10));
        System.out.println(binarySearch(array, 6));
    }
}
