package Not_USACO.LeetCode;

public class LargestSubstring {
    /**
     * Given a string s, return the length of the longest substring between two
     * equal characters, excluding the two characters. If there is no such substring
     * return -1. A substring is a contiguous sequence of characters within a
     * string.
     */
    public class LargestSubstring {
        public static void main(String[] args) {
            System.out.println(maxLengthBetweenEqualCharacters("abca"));
        }

        public static int maxLengthBetweenEqualCharacters(String s) {
            char[] arr = s.toCharArray();
            int max = -1;
            for (int i = 0; i < arr.length; i++) {
                for (int j = arr.length - 1; j > i; j--) {
                    if (arr[i] == arr[j]) {
                        max = Math.max(max, j - i - 1);
                        break;
                    }
                }
            }
            return max;
        }
    }

}
