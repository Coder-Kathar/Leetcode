class Solution {
    public List<String> topKFrequent(String[] words, int k) {
        Map<String,Integer> map = new HashMap<>();
        for(String x : words)
        {
            map.put(x, map.getOrDefault(x,0)+1);
        }

        PriorityQueue<String> pq = new PriorityQueue<>(
            (a, b) -> {
                if(!map.get(a).equals(map.get(b)))
                {
                    return map.get(b) - map.get(a);
                }
                return a.compareTo(b);
            }
        );
        pq.addAll(map.keySet());

        List<String> ans= new ArrayList<>();
        for(int i=0;i<k;i++)
        {
            ans.add(pq.poll());
        }
        return ans;
    }
}