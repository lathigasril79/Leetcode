class Solution {
    public boolean isValidSudoku(char[][] board) {
        for(int i=0;i<board.length;i++)
        {
            ArrayList<Character> al = new ArrayList<>();
            for(int j=0;j<board[0].length;j++)
            {
                if(Character.isDigit(board[i][j]))
                    if(!al.contains(board[i][j]))
                        al.add(board[i][j]);
                    else
                        return false;
            }
        }

        for(int j=0;j<board[0].length;j++)
        {
            ArrayList<Character> al = new ArrayList<>();
            for(int i=0;i<board.length;i++)
            {
                if(Character.isDigit(board[i][j]))
                    if(!al.contains(board[i][j]))
                        al.add(board[i][j]);
                    else
                        return false;
            }
        }
        for(int k=0;k<9;k+=3)
        {
        for(int j=0;j<9;j+=3)
        {
            ArrayList<Character> al = new ArrayList<>();
            for(int i=k;i<k+3;i++)
            {   for(int l=j;l<j+3;l++)
                if(Character.isDigit(board[i][l]))
                    if(!al.contains(board[i][l]))
                        al.add(board[i][l]);
                    else
                        return false;
            }
        }
        }
        return true;
    }
}