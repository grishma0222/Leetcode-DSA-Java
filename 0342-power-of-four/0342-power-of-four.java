class Solution {
    public boolean isPowerOfFour(int n) {
      if(n<=0){return false;}
      else{
        for(int i=0;i<=n;i++)
        {
            long res=(long)Math.pow(4,i);
            if(res==n){return true;}
        }
      } 
      return false; 
    }
}