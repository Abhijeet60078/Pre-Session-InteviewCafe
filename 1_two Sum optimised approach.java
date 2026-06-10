class Solution {
    public int[] twoSum(int[] arr, int target) {

        HashMap<Integer, Integer> data = new HashMap<>();
        int[] result = {-1, -1};

        for (int index = 0; index < arr.length; index++) {

            int need = target - arr[index];

            if (data.containsKey(need)) {
                result[0] = data.get(need);
                result[1] = index;
                break;
            }

            data.put(arr[index], index);
        }

        return result;
    }
}