package arrays;
/*
Given an array of integers nums and an integer target, return indices of the two numbers
such that they add up to target.
You may assume that each input would have exactly one solution, and you may not use the
same element twice.
You can return the answer in any order.

Example 1:
Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].

Example 2:
Input: nums = [3,2,4], target = 6
Output: [1,2]

Example 3:
Input: nums = [3,3], target = 6
Output: [0,1]

Constraints:
    2 <= nums.length <= 104
    -109 <= nums[i] <= 109
    -109 <= target <= 109
    Only one valid answer exists.
*/

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static void main(String[] args) {
        //int[] nums = { 2, 7, 9, 15};
        //int target = 9;
        int[] nums = { 3, 2, 4 };
        int target = 6;

        int[] twosum = twosum(nums, target);
        System.out.println(Arrays.toString(twosum));
    }

    public static int[] twosum(int[] nums, int target) {
        int reminder = 0;
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            reminder = target - nums[i];
            if (map.containsKey(reminder))
                return new int[]{i, map.get(reminder)};
            else
                map.put(nums[i], i);
        }

        return new int[] {};
    }
}
