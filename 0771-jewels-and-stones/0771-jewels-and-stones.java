class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        int count=0;
      
            for(int j=0;j<stones.length();j++){
                  for(int i=0;i<jewels.length();i++)
        {
                if(jewels.charAt(i)==stones.charAt(j)){
                    count++;
                    break;
                }
            }
        }
        return count;
    }
}