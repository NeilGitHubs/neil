package com.hankun.neil.base;

import java.util.Arrays;
import java.util.List;

/**
 * @author neil
 * @ClassName: Test
 * @Description: TODO
 * @date 2021/4/2 15:55
 */
public class Test {
    public static void main(String[] args) {
//        int[] integers = {2, 1, 3, 2, 4, 2, 3};
//        int jump = jump(integers);
//        System.out.println(jump);
        String a = "aaa    aa a";
        String[] s = a.split("/ " );
        List<String> list = Arrays.asList(s);
        list.forEach(System.out::println);
        Solution solution1 = new Solution();
        int[] aa = {2,7,1,3,9};
        int rob = solution1.rob(aa);
        System.out.println(rob);

    }

    public static int jump(int[] nums) {
        int length = nums.length;
        int end = 0;
        int maxPosition = 0;
        int steps = 0;
        for (int i = 0; i < length - 1; i++) {
            maxPosition = Math.max(maxPosition, i + nums[i]);
            if (i == end) {
                end = maxPosition;
                steps++;
            }
        }
        return steps;
    }


    static class Solution {
        public int rob(int[] nums) {
            if (nums == null || nums.length == 0) {
                return 0;
            }
            int length = nums.length;
            if (length == 1) {
                return nums[0];
            }
            int[] dp = new int[length];
            dp[0] = nums[0];
            dp[1] = Math.max(nums[0], nums[1]);
            for (int i = 2; i < length; i++) {
                dp[i] = Math.max(dp[i - 2] + nums[i], dp[i - 1]);
            }
            return dp[length - 1];
        }

    }


}
