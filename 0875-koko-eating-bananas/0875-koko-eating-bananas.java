class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int low=0;
   int high=Arrays.stream(piles).max().getAsInt();
   int ans=0;
   while(low<=high)
   {
    int mid=low+(high-low)/2;
    long sum=0;
    for(int x:piles)
    {
        sum +=(int) Math.ceil((double)x/mid);
    }
    if(sum<=h)
    {
        ans=mid;
        high=mid-1;
    }
    else{
        low=mid+1;
    }
   }
   return ans;
    }
}