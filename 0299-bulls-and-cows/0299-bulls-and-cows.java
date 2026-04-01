class Solution {
    public String getHint(String secret, String guess) {
        int bulls = 0, cows = 0;
        int[] freq = new int[10];
        for(int i=0;i<secret.length();i++)
        {
            char c = secret.charAt(i);
            char ch = guess.charAt(i);

            if(c == ch)
            {
                bulls++;
            }
            else
            {
                if(freq[c-'0'] < 0) cows++;
                if(freq[ch-'0'] > 0) cows++; 
                freq[c - '0']++;
                freq[ch - '0']--;
            }
        }
        return bulls + "A" + cows + "B";
    }
}