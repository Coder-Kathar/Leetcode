class Solution
{
    public boolean isNumber(String s)
    {
        boolean num=false,sign=false,dot=false,expo=false;
        for(int i=0;i<s.length();i++)
        {
            char ch = s.charAt(i);
            if(ch>='0' && ch<='9')
            {
                num =true;
            }
            else if(ch=='+' || ch=='-')
            {
                if(num==true || dot ==true || sign==true)
                {
                    return false;
                }
                else
                {
                    sign = true;
                }
            }
            else if(ch=='e' || ch=='E')
            {
                if(num==false || expo==true)
                {
                    return false;
                }
                else
                {
                    expo=true;
                    num=false;
                    sign=false;
                    dot=false;
                }
                    
            }
            else if(ch=='.')
            {
                if(expo==true || dot==true)
                {
                    return false;
                }
                else
                {
                    dot=true;
                }
            }
            else
            {
                return false;
            }
        }
        return num;   
    }
}