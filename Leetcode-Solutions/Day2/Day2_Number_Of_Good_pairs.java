class Solution {
    public int numIdenticalPairs(int[] nums) {
        Map<Integer, Integer> mp = new HashMap<>();
        int cnt = 0;

        for (int num : nums) {
            if (mp.containsKey(num)) {
                cnt += mp.get(num); // Add count of previous occurrences
            }
            mp.put(num, mp.getOrDefault(num, 0) + 1); // Increment frequency
        }

        return cnt;
    }
}
