class Solution {
    public int[][] mergeArrays(int[][] nums1, int[][] nums2) {
        int size1 = nums1.length;
        int size2 = nums2.length;
        List<List<Integer>> ans = new ArrayList<>();
        
        int i=0;
        int j=0;
        while(i<size1 && j<size2)
        {
            List<Integer> in = new ArrayList<>();
            if(nums1[i][0] == nums2[j][0])
            {
                in.add(nums1[i][0]);
                in.add(nums1[i][1] + nums2[j][1]);
                i++;
                j++;
            }
            else if(nums1[i][0] < nums2[j][0])
            {
                in.add(nums1[i][0]);
                in.add(nums1[i][1]);
                i++;
            }
            else
            {
                in.add(nums2[j][0]);
                in.add(nums2[j][1]);
                j++;
            }
            ans.add(in);
        }
        while(i < size1)
        {
            List<Integer> in = new ArrayList<>();
            in.add(nums1[i][0]);
            in.add(nums1[i][1]);
            i++;
            ans.add(in);
        }
        while(j < size2)
        {
            List<Integer> in = new ArrayList<>();
            in.add(nums2[j][0]);
            in.add(nums2[j][1]);
            j++;
            ans.add(in);
        }
        int res[][] = new int[ans.size()][2];
        for(int k=0;k<ans.size();k++)
        {
            res[k][0] = ans.get(k).get(0);
            res[k][1] = ans.get(k).get(1);
        }
        return res;
    }
}