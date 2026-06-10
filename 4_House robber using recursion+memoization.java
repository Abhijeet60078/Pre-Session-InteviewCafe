class Solution {

    public int findMax(int[] nums, int index, int[] memo) {

        if (index >= nums.length) {
            return 0;
        }

        if (memo[index] != -1) {
            return memo[index];
        }

        int robCurrent = nums[index] + findMax(nums, index + 2, memo);
        int skipCurrent = findMax(nums, index + 1, memo);

        memo[index] = Math.max(robCurrent, skipCurrent);

        return memo[index];
    }

    public int rob(int[] nums) {

        int[] memo = new int[nums.length];
        Arrays.fill(memo, -1);

        return findMax(nums, 0, memo);
    }
}