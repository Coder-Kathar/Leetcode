class Solution {
    public int minDeletion(String s, int k) {
        Map<Character,Integer> map = new HashMap<>();
        for(char ch : s.toCharArray())
        {
            map.put(ch, map.getOrDefault(ch,0)+1);
        }
        if(map.size() <= k)
            return 0;
        List<Integer> l = new ArrayList<>();
        for(Character c : map.keySet())
        {
            l.add(map.get(c));
        }
        Collections.sort(l);
        int count = 0;
        int n = l.size();
        for(int i=0;i<l.size();i++)
        {
            count += l.get(i);
            n--;
            if(n == k)
                break;
        }
        return count;
    }
}