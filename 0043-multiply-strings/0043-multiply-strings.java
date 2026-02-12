class Solution {
    public String multiply(String num1, String num2) {
        if(num1.equals("0") || num2.equals("0"))
            return "0";
        List<String> l = new ArrayList<>();
        int count = 0;
        for(int i=num2.length()-1; i>=0; i--)
        {
            char digit = num2.charAt(i);
            String ans = mul(num1, digit);
            ans = addTrailZero(ans,count);
            l.add(ans);
            count++;
        }
        String res = l.get(0);
        for(int i=1;i<l.size();i++)
        {
            res = addString(res,l.get(i));
        }
        return res;
    }
    public String addString(String s1, String s2)
    {
        int carry = 0;
        int i = s1.length()-1;
        int j = s2.length()-1;
        StringBuilder ans = new StringBuilder();
        while(i >= 0 && j >= 0)
        {
            int num1 = s1.charAt(i) - '0';
            int num2 = s2.charAt(j) - '0';
            int sum = carry + num1 + num2;
            ans.append(sum % 10);
            carry = sum / 10;
            i--;
            j--;
        }
        while(i >= 0)
        {
            int num = s1.charAt(i) - '0';
            int sum = carry + num;
            ans.append(sum % 10);
            carry = sum / 10;
            i--;
        }
        while(j >= 0)
        {
            int num = s2.charAt(j) - '0';
            int sum = carry + num;
            ans.append(sum % 10);
            carry = sum / 10;
            j--;
        }
        if(carry > 0)
            ans.append(carry);
        return ans.reverse().toString();
    }
    public String addTrailZero(String s, int count)
    {
        if(count == 0)
            return s;
        StringBuilder ans = new StringBuilder(s);
        while(count > 0)
        {
            ans.append(0);
            count--;
        }
        return ans.toString();
    }
    public String mul(String s, char c)
    {
        StringBuilder ans = new StringBuilder();
        int carry = 0;
        for(int i=s.length()-1; i>=0;i--)
        {
            char d = s.charAt(i);
            int prod = (d - '0') * (c - '0');
            prod += carry;
            ans.append(prod % 10);
            carry = prod / 10;
        }
        if(carry > 0)
            ans.append(carry);
        return ans.reverse().toString();
    }
}