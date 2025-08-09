class Solution {
    public boolean reportSpam(String[] message, String[] bannedWords) {
        Set<String> set = new HashSet<>();
        for(String x : bannedWords)
            set.add(x);
        int count = 0;
        for(String y : message)
        {
            if(set.contains(y))
                count++;
            if(count == 2)
                return true;
        }
        return false;
    }
}