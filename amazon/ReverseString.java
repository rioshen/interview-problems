/**
 * Problem: Reverse a string list.
 */

public class ReverseString {
    /**
     * Solution:
     * Swap two elements in the list based on (1, n - 1) pair. Use a temporaty variable
     * to store the element.
     *
     * Analysis:
     * Time Complexity: O(N), where N means the length of string.
     * Space Complexity: O(1), no addtional space is required.
     */
    public static String reverse(String str) {
        if (str == null || str.length() <= 1) {
            return str;
        }

        int pos = 0;
        char[] reversed = new char[str.length()];
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed[pos++]  = str.charAt(i);
        }

        return new String(reversed);
    }

    public static void main(String[] args) {
        String str = "abcde";
        System.out.println(reverse(str));
        str = "abcdef";
        System.out.println(reverse(str));
    }
}
