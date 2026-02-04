class Solution {
    public String addSpaces(String s, int[] spaces) {
        StringBuilder sb = new StringBuilder();
        int itr = 0;
        int i;
        for(i=0;i<s.length();i++)
        {
            if(spaces[itr] == i)
            {
                sb.append(" ").append(s.charAt(i));
                itr++;
            }
            else
            {
                sb.append(s.charAt(i));
            }
            if(itr == spaces.length)
            {
                break;
            }
        }
        i++;
        for(;i<s.length();i++)
            sb.append(s.charAt(i));
        return sb.toString();
    }
}