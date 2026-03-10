package strings.medium;

import java.util.*;

/**
 * Leetcode 49
 *
 * Given an array of strings strs, group the together. You can return the answer in any order.
 *
 * Example 1:
 * Input: strs = ["eat","tea","tan","ate","nat","bat"]
 * Output: [["bat"],["nat","tan"],["ate","eat","tea"]]
 *
 * Explanation:
 *
 *     There is no string in strs that can be rearranged to form "bat".
 *     The strings "nat" and "tan" are anagrams as they can be rearranged to form each other.
 *     The strings "ate", "eat", and "tea" are anagrams as they can be rearranged to form each other.
 *
 * Example 2:
 * Input: strs = [""]
 * Output: [[""]]
 *
 * Example 3:
 * Input: strs = ["a"]
 * Output: [["a"]]
 *
 * Constraints:
 *
 *     1 <= strs.length <= 104
 *     0 <= strs[i].length <= 100
 *     strs[i] consists of lowercase English letters.
 */

public class P49_GroupAnagrams {
    public static void main(String[] args) {
        String[] strs = { "eat","tea","tan","ate","nat","bat" };
        System.out.println(groupAnagrams(strs));
    }

    public static List<List<String>> groupAnagrams(String[] strs) {
        if(strs.length == 0) {
            return new ArrayList<>();
        }

        Map<String, List<String>> ansMap = new HashMap<>();

        int[] count = new int[26];

        for (String s : strs) {
            Arrays.fill(count, 0);

            for(char c : s.toCharArray()) {
                count[c-'a']++;
            }

            StringBuilder sb = new StringBuilder("");

            for (int i = 0; i < 26; i++) {
                sb.append("#");
                sb.append(count[i]);
            }
            String key = sb.toString();

            //System.out.println(key);

            if(!ansMap.containsKey(key)) {
                ansMap.put(key, new ArrayList<>());
            }

            ansMap.get(key).add(s);
        }

        return new ArrayList<>(ansMap.values());
    }
}
