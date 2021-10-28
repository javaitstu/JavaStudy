package com.加一;


public class Solution {
    public static void main(String[] args) {
        int[] digits = {9};
        Solution solution = new Solution();
        int[] ints = solution.plusOne(digits);
        for (int ints1: ints) {
            System.out.println(ints1);
        }
    }
    public int[] plusOne(int[] digits) {
        int length = digits.length;
        //1.直接加一
        //digits[length] += 1;
        //2.最后一位为9
        //if (++ digits[length] == 10) {
        //    digits[length] = 0;
        //    digits[length-1] ++;
        //}
        //3.最后两位为9
        //if (++ digits[length] == 10) {
        //    digits[length] = 0;
        //    if (++digits[length-1] == 10) {
        //        digits[length -1] = 0;
        //        digits[length-2]++;
        //    }
        //}

        for (int i = length-1; i >= 0; i--) {
            if (digits[i] == 9) {
                digits[i] = 0;
            } else {
                digits[i] ++;
                break;
            }
        }
        if (digits[0] == 0) {
            int[] ints = new int[length + 1];
            ints[0] = 1;
            for (int i = 1; i < length+1;i++) {
                ints[i] = digits[i - 1];
            }
            return ints;
        }
        return digits;
    }
}
