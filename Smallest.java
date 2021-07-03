class Smallest {
    public int numIdenticalPairs(int[] nums) {
        int i,j,result =0;
        for (i=0;i<nums.length;i++)
        {
            for(j=0;j<nums.length;j++)
            {
            if(nums[i]==nums[j]&&i<j)
                result++;
        }
        }
    return result;
    }
}
