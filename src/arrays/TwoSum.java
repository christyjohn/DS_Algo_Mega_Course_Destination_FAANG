package arrays;

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
