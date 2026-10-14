class Solution {
    int Count(int[] arr,int size)
    {
        int low=0;
        int high=size-1;
        int count=0;
        while(low<=high)
        {
            int mid=low+(high-low)/2;
            if(arr[mid]<0)
            {
                count =size-mid;
               high=mid-1;
            }else{
                low=mid+1;
            }
        }
        return count;
    }
    public int countNegatives(int[][] grid) {
        int n=grid.length;
        int m=grid[0].length;
        int res=0;
        for(int i=0;i<n;i++)
        {
            res +=Count(grid[i],m);
        }
        return res;
    }
}