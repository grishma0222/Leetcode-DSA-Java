class Solution {
    public int xorOperation(int n, int start) {
        long ans=0;
        for(int i=0;i<n;i++){
            long res=(start+2*i);
            ans =ans^res;
        }
        return (int)ans;
    }
}