class Solution {
    public int maximum69Number (int num) {
        char[] ch_num = String.valueOf(num).toCharArray();
        for(int i=0;i<ch_num.length;i++)
        {
            if(ch_num[i] == '6')
            {
                ch_num[i] = '9';
                break;
            }
        }
        return Integer.parseInt(new String(ch_num));
    }
}