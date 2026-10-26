class Solution {
    public int maxFrequencyElements(int[] nums) {
        int n=nums.length;
        int[] freq=new int[101];
        int max=0;
        for(int i=0;i<n;i++)
        {
            freq[nums[i]]++;
            max=Math.max(max,freq[nums[i]]);
        }
       
        int count =0;
        for(int i=0;i<101;i++)
        {
            if( freq[i]==max)
            {
                count +=freq[i];
            }
        }
        return count;
    }
}