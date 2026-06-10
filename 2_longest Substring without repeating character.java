class Solution {
    public int lengthOfLongestSubstring(String str) {

        HashMap<Character, Integer> data = new HashMap<>();

        int start = 0;
        int end = 0;
        int longest = 0;

        while (end < str.length()) {

            char current = str.charAt(end);

            if (data.containsKey(current) && data.get(current) >= start) {

                int size = end - start;
                longest = Math.max(longest, size);

                start = data.get(current) + 1;
            }

            data.put(current, end);
            end++;
        }

        int size = end - start;
        longest = Math.max(longest, size);

        return longest;
    }
}