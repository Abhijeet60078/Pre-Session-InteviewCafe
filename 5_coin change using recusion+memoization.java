class Solution {

    public long findCoins(int[] coins, int target, int index, long[][] memo) {

        if (index == coins.length) {
            if (target == 0) {
                return 0;
            }
            return Integer.MAX_VALUE;
        }

        if (memo[index][target] != -1) {
            return memo[index][target];
        }

        long notTake = findCoins(coins, target, index + 1, memo);

        if (target < coins[index]) {
            return memo[index][target] = notTake;
        }

        long take = 1 + findCoins(coins, target - coins[index], index, memo);

        return memo[index][target] = Math.min(take, notTake);
    }

    public int coinChange(int[] coins, int amount) {

        int size = coins.length;

        long[][] memo = new long[size][amount + 1];

        for (int row = 0; row < size; row++) {
            Arrays.fill(memo[row], -1);
        }

        int result = (int) findCoins(coins, amount, 0, memo);

        if (result == Integer.MAX_VALUE) {
            return -1;
        }

        return result;
    }
}