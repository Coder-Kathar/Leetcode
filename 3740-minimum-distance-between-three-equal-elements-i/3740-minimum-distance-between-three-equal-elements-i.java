class Solution {
    public int minimumDistance(int[] nums) {
        Map<Integer, List<Integer>> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.computeIfAbsent(nums[i], k -> new ArrayList<>()).add(i);
        }
        int minDist = Integer.MAX_VALUE;
        for (List<Integer> indices : map.values()) {
            if (indices.size() < 3) continue;
            for (int i = 0; i + 2 < indices.size(); i++) {
                int a = indices.get(i);
                int c = indices.get(i + 2);
                int distance = 2 * (c - a);
                minDist = Math.min(minDist, distance);
            }
        }
        return minDist == Integer.MAX_VALUE ? -1 : minDist;
    }
}
