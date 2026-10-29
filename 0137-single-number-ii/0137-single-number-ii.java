class Solution {
    public int singleNumber(int[] nums) {
        int n=nums.length;
        HashMap<Integer,Integer> m=new HashMap<>();
        for(int x:nums)
        {
           m.put(x,m.getOrDefault(x,0)+1);
        }
        for(int num :m.keySet()){
        if(m.get(num)==1){
            return num;
                        }
            }
    return -1;
                }
}