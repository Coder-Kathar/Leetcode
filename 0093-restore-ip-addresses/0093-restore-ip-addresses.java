class Solution {
    public List<String> restoreIpAddresses(String s) {
        List<String> result = new ArrayList<>();
        backtrack(s, 0, new ArrayList<>(), result);
        return result;
    }
    private void backtrack(String s, int ind, List<String> path, List<String> result)
    {
        if(path.size() == 4)
        {
            if(ind == s.length())
            {
                result.add(String.join(".",path));
            }
            return;
        }
        for(int i=1; i<=3; i++)
        {
            if(ind + i > s.length())
                break;
            String part = s.substring(ind, ind+i);
            if(part.startsWith("0") &&  part.length() > 1 || Integer.parseInt(part) > 255)
                continue;
            path.add(part);
            backtrack(s, ind+i, path, result);
            path.remove(path.size()-1);
        }
    }
}