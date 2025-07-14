class Solution {
    public static String reverse(String ss)
    {
        char arr[] = ss.toCharArray();
        int i=0,j=arr.length-1;
        while(i < j)
        {
            char temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
        return new String(arr);
    }
    public String reverseWords(String s) {
        String str[] = s.split("\\s+");
        for(int i=0;i<str.length;i++)
        {
            str[i] = reverse(str[i]);
        }
        // System.out.println(Arrays.toString(str));
        StringBuilder ans = new StringBuilder();
        for(int i=0;i<str.length;i++)
        {
            if(i+1 < str.length)
                ans.append(str[i] + " ");
            else
                ans.append(str[i]);
        }
        return ans.toString();
    }
}