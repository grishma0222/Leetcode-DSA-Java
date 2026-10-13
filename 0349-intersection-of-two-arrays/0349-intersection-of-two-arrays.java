class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
       HashSet<Integer> set=new HashSet<>();
       for(int i=0;i<nums1.length;i++){
        set.add(nums1[i]);
       }
       int m=Math.min(nums1.length,nums2.length);
       int[] res=new int[m];
       int count=0;
       for(int i=0;i<nums2.length;i++)
       {
        if(set.contains(nums2[i]))
        {
            res[count]=nums2[i];
            count++;
            set.remove(nums2[i]);
        }
       }
       return Arrays.copyOf(res,count);
      
    }
}