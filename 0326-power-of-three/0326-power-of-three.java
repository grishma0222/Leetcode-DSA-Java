class Solution {
    public boolean isPowerOfThree(int n) {
        boolean p=false;
        if(n<=0)
        { return false;   }
        else{
            for(int i=0;i<=n;i++){
            long  res=(long)Math.pow(3,i);
                if(res==n){return true;}
                if(res>n){return false;}
            }
        }
return false;
    }
}