class Solution {
    public void rotate(int[][] matrix) {
        int n=matrix.length;
        int i,j,k,temp;
    for(i=0;i<n;i++)
    {
        for(j=i+1;j<n;j++)
        {
 temp=matrix[i][j];
matrix[i][j]=matrix[j][i];
matrix[j][i]=temp;
        }
    }
    for(i=0;i<n;i++)
    {
        for(j=0,k=n-1;j<k;j++,k--)
        {
             temp=matrix[i][j];
            matrix[i][j]=matrix[i][k];
            matrix[i][k]=temp;
        }
    }
}
}