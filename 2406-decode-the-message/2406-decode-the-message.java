class Solution {
    public String decodeMessage(String key, String message) {
        List<Character> arr = new ArrayList<>();
        for(char c : key.toCharArray())
        {
            if(c != ' ')
            {
                if(!arr.contains(c))
                {
                    arr.add(c);
                }
            }
        }
        String s = "";
        for(char c : message.toCharArray())
        {
            if(c == ' ')
            {
                s += c;
            }
            else
            {
                int ind = arr.indexOf(c);
                int val = ind + 97;
                s += (char) val;
            }
        }
        return s;
    }
}