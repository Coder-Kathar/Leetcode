class Solution {
    public boolean isValid(String word) {
        if(word.length() < 3)
            return false;
        boolean digit = false;
        boolean vowel = false;
        boolean con = false;
        boolean spe = true;
        for(char c : word.toCharArray())
        {
            if(Character.isDigit(c))
                digit = true;
            else if("AEIOUaeiou".indexOf(c) != -1)
                vowel = true;
            else if((c >= 'A' && c <= 'Z') || (c >= 'a' && c <= 'z'))
                con = true;
            else
                spe = false;
        }
        return vowel && con && spe;    
    }
}