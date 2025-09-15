class Solution {
    public int canBeTypedWords(String text, String brokenLetters) {
        String[] s = text.split("\\s+");
        int count = 0;
        char[] ch = brokenLetters.toCharArray();
        for(String x : s)
        {
            boolean flag = true;
            for(char c : ch)
            {
                if(x.indexOf(c) != -1)
                {
                    flag = false;
                    break;
                }
            }
            if(flag)
                count++;
        }
        return count;
    }
}