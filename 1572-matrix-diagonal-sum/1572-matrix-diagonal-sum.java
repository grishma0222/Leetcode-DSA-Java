class Solution {
    public int diagonalSum(int[][] mat) {
        int n=mat.length;
        int sum1=0,sum2=0;
        for(int i=0;i<n;i++)
        {
            sum1 =sum1+(mat[i][i]+mat[i][n-1-i]);
            if(i==n/2 && n%2!=0)
            {
                sum1 -=mat[i][i];
            }
        }
        return sum1;
    }
}