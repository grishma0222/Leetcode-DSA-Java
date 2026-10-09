class Solution {
    public int maximumCount(int[] nums) {
        int n=0,p=0,z=0,max=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==0) z++;
            else if(nums[i]<0) n++;
            else p++;
        }
        max=Math.max(n,p);
        return max;
    }
}