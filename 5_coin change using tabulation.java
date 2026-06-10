class Solution {

    public int coinChange(int[] values, int target) {

        int size = values.length;

        long[][] table = new long[size][target + 1];

        for (int row = 0; row < size; row++) {

            for (int col = 0; col <= target; col++) {

                long notTake = (row > 0)
                        ? table[row - 1][col]
                        : (col == 0 ? 0 : Integer.MAX_VALUE);

                if (col < values[row]) {
                    table[row][col] = notTake;
                } else {

                    long take = 1 + table[row][col - values[row]];

                    table[row][col] = Math.min(notTake, take);
                }
            }
        }

        int result = (int) table[size - 1][target];

        if (result == Integer.MAX_VALUE) {
            return -1;
        }

        return result;
    }
}