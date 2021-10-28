package 只出现一次的数字;

public class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = {4,1,2,1,2};
        System.out.println(solution.singleNumber(nums));
    }
    public int singleNumber(int[] nums) {
        int reduce = 0;
        for (int num : nums) {
            reduce =  reduce ^ num;
        }
        return reduce;

    }
}
