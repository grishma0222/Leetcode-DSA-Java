void rotate(int** matrix, int matrixSize, int* matrixColSize) {
    int i,j,k,temp;
    for(i=0;i<matrixSize;i++)
    {
        for(j=i+1;j<matrixSize;j++)
        {
 temp=matrix[i][j];
matrix[i][j]=matrix[j][i];
matrix[j][i]=temp;
        }
    }
    for(i=0;i<matrixSize;i++)
    {
        for(j=0,k=matrixSize-1;j<k;j++,k--)
        {
             temp=matrix[i][j];
            matrix[i][j]=matrix[i][k];
            matrix[i][k]=temp;
        }
    }
}