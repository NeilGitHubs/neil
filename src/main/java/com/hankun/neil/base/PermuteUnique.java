package com.hankun.neil.base;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @author neil
 * @ClassName: Permute
 * @Description: TODO
 * @date 2021/4/6 15:42
 */
public class PermuteUnique {

    public static void main(String[] args) {
        int[] a = {1,1,2};
        List<List<Integer>> permute = permuteUnique(a);
        System.out.println(permute);
    }

    public static List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> ans = new ArrayList<List<Integer>>();
        List<Integer> perm = new ArrayList<Integer>();
        boolean[] vis = new boolean[nums.length];
        Arrays.sort(nums);
        backtrack(nums, ans, 0, perm,vis);
        return ans;
    }

    public static void backtrack(int[] nums, List<List<Integer>> ans, int idx, List<Integer> perm,boolean[] vis) {
        if (idx == nums.length) {
            ans.add(new ArrayList<Integer>(perm));
            return;
        }
        for (int i = 0; i < nums.length; ++i) {
            if (vis[i] || (i > 0 && nums[i] == nums[i - 1] && !vis[i - 1])) {
                continue;
            }
            perm.add(nums[i]);
            vis[i] = true;
            // 回调，深入
            backtrack(nums, ans, idx + 1, perm,vis);
            // 撤销
            vis[i] = false;
            perm.remove(idx);
        }
    }

}
