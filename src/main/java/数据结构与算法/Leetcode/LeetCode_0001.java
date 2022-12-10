package 数据结构与算法.Leetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/** LeetCode0001: 两数之和
 *
 *      问题描述:
 *          给定一个整数数组nums和一个目标值target，请你在该数组中找出和为目标值的那两个整数，并返回他们的数组下标。
 *          你可以假设每种输入只会对应一个答案。但是，数组中同一个元素不能使用两遍。
 *
 *      示例:
 *          给定 nums = [2, 7, 11, 15], target = 9
 *          因为 nums[0] + nums[1] = 2 + 7 = 9
 *          所以返回 [0, 1]
 *
 */
public class LeetCode_0001 {

    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 18;
        int[] arr = twoSum(nums,target);
        // 打印数组
        System.out.println(Arrays.toString(arr));
    }

    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> lookup = new HashMap<>();
        int[] res = new int[2];
        for (int i = 0; i < nums.length; i++) {
            if (lookup.containsKey(target - nums[i])) {
                res = new int[] { lookup.get(target - nums[i]), i };
                break;
            } else {
                lookup.put(nums[i], i);
            }
        }
        return res;
    }
}
