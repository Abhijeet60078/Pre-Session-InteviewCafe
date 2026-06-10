class Solution {

    HashMap<Integer, Integer> memo = new HashMap<>();

    public int climbStairs(int steps) {

        if (steps <= 2) {
            return steps;
        }

        if (memo.containsKey(steps)) {
            return memo.get(steps);
        }

        int ways = climbStairs(steps - 1) + climbStairs(steps - 2);

        memo.put(steps, ways);

        return ways;
    }
}