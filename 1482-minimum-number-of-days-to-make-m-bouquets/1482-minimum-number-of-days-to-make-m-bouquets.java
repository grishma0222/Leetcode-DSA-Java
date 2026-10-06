class Solution {
    boolean possible(int[] bloomDay,int day,int m,int k)
    {
        int cnt=0;
        int nofb=0;
        for(int i=0;i<bloomDay.length;i++)
        {
            if(bloomDay[i]<=day)
            {
                cnt++;
            }else{
                nofb +=(cnt/k);
                cnt=0;
            }
        }
        nofb +=(cnt/k);
        return nofb>=m;
    }
    public int minDays(int[] bloomDay, int m, int k) {
        long val=m*1L*k*1L;
        if(val>bloomDay.length) return -1;
        int mini=Integer.MAX_VALUE;
        int maxi=Integer.MIN_VALUE;
        for(int i=0;i<bloomDay.length;i++)
        {
            mini=Math.min(mini,bloomDay[i]);
            maxi=Math.max(maxi,bloomDay[i]);
        }
        int low=mini;
        int high=maxi;
        while(low<=high)
        {
            int mid=(low+high)/2;
            if(possible(bloomDay,mid,m,k)){
                high=mid-1;
            }
            else{ low=mid+1;}
        }
        return low;
    }
}