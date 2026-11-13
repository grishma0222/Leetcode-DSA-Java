class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        int n=nums.length;
        List<Integer> ans=new ArrayList<>();
        List<Integer> res=new ArrayList<>();
        int min=Arrays.stream(nums).min().getAsInt();
        int  max=Arrays.stream(nums).max().getAsInt();
        int sum1=0,sum2=0;
 for(int  i=min;i<=max;i++)
 {
    ans.add(i);
 }
        for(int i=0;i<ans.size();i++){
            boolean found=false;
            for(int j=0;j<n;j++){
            if(ans.get(i)==nums[j]){
                found=true;
                break;
            }
        }
        if(!found)
        {
            res.add(ans.get(i));
        }
        }
        return res;
    }
}