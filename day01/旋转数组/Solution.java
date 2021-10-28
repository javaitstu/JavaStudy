package 旋转数组;

public class Solution {

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = {1,2};
        solution.rotate(nums,3);
        for (int i = 0; i < nums.length; i ++) {
            System.out.println(nums[i]);
        }
    }

    public void rotate(int[] nums, int k) {
        int len = nums.length;
        k = k % len;
        if(k != 0){
            int[] temp = new int[k];
            int l = 0;
            for(int i = len - k; i < len; i ++) {
                temp[l++] = nums[i];
            }
            for(int j = len - k - 1; j >= 0; j--){
                nums[j+k] = nums[j];
            }
            for(int i = 0; i < k; i ++) {
                nums[i] = temp[i];
            }
        }

    }
}
