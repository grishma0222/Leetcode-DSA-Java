class Solution {
    public int maximumCount(int[] nums) {
       int low=0;
       int high=nums.length;
      int p=0;
      int n=nums.length;
       while(low<high)
       {
        int mid=low+(high-low)/2;
        if(nums[mid]<0)
        {
           
          low=mid+1;
        }
        else{
            high=mid;
        }
    }

    p=low;
     low=0;
    high=n;
    while(low<high)
       {
        int mid=low+(high-low)/2;
        if(nums[mid]<=0)
        {
           
          low=mid+1;
        }
        else{
            high=mid;
        }
    }
   
    int n1=n-low;
    int ans=Math.max(p,n1);
    return ans;
    }
}