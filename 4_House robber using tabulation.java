class Solution {

    public int rob(int[] nums) {

        int size = nums.length;

        if (size == 1) {
            return nums[0];
        }

        int[] best = new int[size];

        best[0] = nums[0];
        best[1] = Math.max(nums[0], nums[1]);

        for (int pos = 2; pos < size; pos++) {
            best[pos] = Math.max(nums[pos] + best[pos - 2], best[pos - 1]);
        }

        return best[size - 1];
    }
}