class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
        ArrayList<Integer> obj = new ArrayList<Integer> ();
        for(int i=0;i<nums.length;i++)
        {
            obj.add(index[i],nums[i]);
        }
     int outPut[] = new int[nums.length];
        for(int i =0;i<nums.length;i++)
            outPut[i] = obj.get(i);
        return outPut;
    }
}