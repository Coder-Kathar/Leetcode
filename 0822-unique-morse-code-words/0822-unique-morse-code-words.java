class Solution {
    public int uniqueMorseRepresentations(String[] words) {
        String codes[] = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        char ch = 'a';
        Map<Character,String> map = new HashMap<>();
        for(String x : codes)
        {
            map.put(ch++,x);
        }
        String res[] = new String[words.length];
        for(int i=0;i<res.length;i++)
        {
            String ans = "";
            for(char c : words[i].toCharArray())
            {
                ans += map.get(c);
            }
            res[i] = ans.toString();
        }
        System.out.println(Arrays.toString(res));
        Set<String> set = new HashSet<>();
        for(String x : res)
        {
            set.add(x);
        }
        return set.size();
    }
}