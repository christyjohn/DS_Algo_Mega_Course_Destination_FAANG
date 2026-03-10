package arrays.medium.P238_product_except_self;

/**
 * Leetcode: 238
 *
 * Given an integer array nums, return an array answer such that answer[i] is equal to the product of all the elements of nums except nums[i].
 * The product of any prefix or suffix of nums is guaranteed to fit in a 32-bit integer.
 * You must write an algorithm that runs in O(n) time and without using the division operation.
 *
 * Example 1:
 * Input: nums = [1,2,3,4]
 * Output: [24,12,8,6]
 *
 * Example 2:
 * Input: nums = [-1,1,0,-3,3]
 * Output: [0,0,9,0,0]
 *
 * Constraints:
 *
 *     2 <= nums.length <= 105
 *     -30 <= nums[i] <= 30
 *     The input is generated such that answer[i] is guaranteed to fit in a 32-bit integer.
 *
 * Follow up: Can you solve the problem in O(1) extra space complexity? (The output array does not count as extra space for space complexity analysis.)
 */

import java.util.Arrays;

public class ProductExceptSelfBetter {
    public static void main(String[] args) {
        int[] nums;
        //nums = new int[] {1, 2, 3, 4};
        nums = new int[] { -1, 1, 0, -3, 3 };

        System.out.println(Arrays.toString(productExceptSelf(nums)));
    }

    public static int[] productExceptSelf(int[] nums) {
        int[] productNums = new int[nums.length];
        int[] prefix = new int[nums.length];
        int[] postfix = new int[nums.length];

        prefix[0] = 1;
        postfix[nums.length - 1] = 1;

        for(int i = 1; i < nums.length; ++i) {
            prefix[i] = prefix[i - 1] * nums[i - 1];
            postfix[nums.length - (i + 1)] = postfix[nums.length - i] * nums[nums.length - i];
        }

        //System.out.println("Prefix: " + Arrays.toString(prefix));
        //System.out.println("Postfix: " + Arrays.toString(postfix));

        for(int i = 0; i < nums.length; i++) {
            productNums[i] = prefix[i] * postfix[i];
        }

        return productNums;
    }
}
