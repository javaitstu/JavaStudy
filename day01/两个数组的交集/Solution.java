package com.两个数组的交集;

import java.util.ArrayList;
import java.util.Arrays;

public class Solution {

    public static void main(String[] args) {
        /**
         * [3,1,2]
         * [1,1]
         */
        int[] nums1 = {3,1,2};
        int[] nums2 = {1,1};
        Solution solution = new Solution();
        int[] ints = solution.intersect(nums1, nums2);
        for (int i = 0; i < ints.length; i++) {
            System.out.println(ints[i]);
        }
    }
    public int[] intersect(int[] nums1, int[] nums2) {
        /**
         * 输入：nums1 = [1,2,2,1],
         *      nums2 = [2,2]
         * 输出：[2,2]
         */
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int len1 = nums1.length;
        int len2 = nums2.length;
        int i = 0,j = 0;
        ArrayList<Integer> list = new ArrayList<Integer>();
        while (i < len1 && j < len2) {
            if (nums1[i] == nums2[j]){
                list.add(nums1[i]);
                i ++;
                j ++;
            } else if (nums1[i] > nums2[j]) {
                j ++;
            } else if (nums1[i] < nums2[j]) {
                i ++;
            }
        }
        int[] res = new int[list.size()];
        for (int k = 0; k < list.size(); k++) {
            res[k] = list.get(k);
        }
        return res;
    }
}
