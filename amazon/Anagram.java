public class Anagram {

    public static boolean isAnagram(String str) {
        if (str == null || str.length() <= 1) {
            return false;
        }

        int pos = 0;
        char[] content = str.toCharArray();
        for (int i = str.length() - 1; i >= str.length() / 2; i--) {
            if (content[pos++] != content[i]) return false;
        }

        return true;
    }

    public static void main(String[] args) {
        System.out.println(isAnagram("sexatnoontaxes"));
    }
}
