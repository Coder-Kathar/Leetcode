class Solution {
    public char repeatedCharacter(String s) {
        Set<Character> set = new HashSet<>();
        for(char ch : s.toCharArray())
        {
            if(set.contains(ch))
                return ch;
            else
                set.add(ch);
        }
        return ' ';
    }
}