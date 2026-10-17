class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int max=0,set=0;;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>max){max=arr[i];set=i;}
        }
        return set;
    }
}