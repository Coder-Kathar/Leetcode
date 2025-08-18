class Solution {
    public boolean isIsomorphic(String s, String t) {
        Map<Character,Character> map = new HashMap<>();
        for(int i=0;i<s.length();i++)
        {
            char key = s.charAt(i);
            char val = t.charAt(i);
            if(!map.containsKey(key) && !map.containsValue(val))
            {
                map.put(key,val);
            }
            else if(map.containsKey(key) && map.get(key) == val)
            {
                continue;
            }
            else
            {
                return false;
            }
        }
        return true;
    }
}