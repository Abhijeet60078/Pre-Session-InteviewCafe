class Solution {
    public int[] twoSum(int[] arr, int target) {

        int[] result = new int[2];

        for (int first = 0; first < arr.length; first++) {
            for (int second = first + 1; second < arr.length; second++) {

                if (arr[first] + arr[second] == target) {
                    result[0] = first;
                    result[1] = second;
                    return result;
                }
            }
        }

        return result;
    }
}