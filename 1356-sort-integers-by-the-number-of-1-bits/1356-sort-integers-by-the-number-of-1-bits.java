import java.util.*;

class Solution {
    public int[] sortByBits(int[] arr) {

        Map<Integer, List<Integer>> map = new TreeMap<>();

        // Group numbers by bit count
        for (int i = 0; i < arr.length; i++) {
            int bits = countOnes(arr[i]);

            map.putIfAbsent(bits, new ArrayList<>());
            map.get(bits).add(arr[i]);
        }

        int[] ans = new int[arr.length];
        int ind = 0;

        // Sort each list and fill result
        for (Integer key : map.keySet()) {

            List<Integer> list = map.get(key);
            Collections.sort(list);
            
            for (int num : list) {
                ans[ind++] = num;
            }
        }
        return ans;
    }

    public static int countOnes(int x) {
        int count = 0;
        while (x != 0) {
            if ((x & 1) == 1)
                count++;
            x >>= 1;
        }
        return count;
    }
}