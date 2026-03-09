package strings.eazy;

/**
 * Leetcode: 242
 * 
 * Given two strings s and t, return true if t is an of s, and false otherwise.
 *
 *
 * Example 1:
 *
 * Input: s = "anagram", t = "nagaram"
 * Output: true
 *
 * Example 2:
 *
 * Input: s = "rat", t = "car"
 * Output: false
 *
 * Constraints:
 *
 *     1 <= s.length, t.length <= 5 * 104
 *     s and t consist of lowercase English letters.
 *
 * Follow up: What if the inputs contain Unicode characters? How would you adapt your
 * solution to such a case?
 */

public class ValidAnagram {
    public static void main(String[] args) {
        //String s = "anagram";
        //String t = "nagaram";
        String s = "rat";
        String t = "car";

        System.out.println(isAnagram(s, t));
    }

    public static boolean isAnagram(String s, String t) {
        if (s.length() != t.length())
            return false;

        int[] chars = new int[26];

        for(int i = 0; i < s.length(); i++) {
            chars[s.charAt(i) - 'a']++;
            chars[t.charAt(i) - 'a']--;
        }

        for(int i : chars)
            if (i != 0)
                return false;

        return true;
    }
}
