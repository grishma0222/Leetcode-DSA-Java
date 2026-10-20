class Solution {
    public int maxSubArray(int[] nums) {
         int sum=0,start=0;
        int ansstart=-1;
        int ansend=-1;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            if(sum==0){ start=i;}
            sum +=nums[i];
            if(sum>max){ max=sum;
            ansstart=start;
            ansend=i;
            }
            if(sum<0) {sum=0;}
        }
    
        return max;
    }
}