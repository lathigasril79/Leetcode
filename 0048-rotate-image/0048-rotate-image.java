class Solution {
    public void rotate(int[][] matrix) {
        int r=matrix.length;
        int c=matrix[0].length;
        
        int mat[][] = new int[r][c];
        for(int i=0;i<r;i++)
        for(int j=0;j<c;j++)
        mat[i][j]=matrix[j][i];
        int j= c-1;
        
        for(int m=0;m<r/2;m++)
        {
        for(int i=0;i<r;i++)
        {   
            int s=mat[i][m];
            mat[i][m]=mat[i][j];
            mat[i][j]=s;
        }
        j--;
        }
        for(int i=0;i<r;i++)
        for( j=0;j<c;j++)
        matrix[i][j]=mat[i][j];
    }
}