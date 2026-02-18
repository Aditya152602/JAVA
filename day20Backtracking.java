/*import java.util.ArrayList;
import java.util.List;
//Print all Permutations                               MOST IMPORTANT QUESTIONS

public class day20Backtracking {
    //Print all permutations
    public static void printPermutation(String str, int idx, String perm){
        if(str.length() == 0){
            System.out.println(perm);
            return;
        }
        for (int i=0;i<str.length();i++){    //TIME COMPLEXITY O[n*n!].
            char currChar = str.charAt(i);
            String newStr = str.substring(0,i) + str.substring(i+1);
            printPermutation(newStr, idx+1, perm+currChar);
        }
    }
    public static void main (String args[]){
        String str = "abc";
        printPermutation(str,0,"");
    }

    //N-Queens [TIME COMPLEXITY-O(n^n)]

    public boolean isSafe (int row, int col, char[][] board){
        //horizontal
        for(int j=0; j<board.length;j++){
            if(board[row][j] == 'Q'){
                return false;
            }
        }
        //Vertical
        for(int i=0; i<board.length;i++){
            if(board[i][col] == 'Q'){
                return false;
            }
        }
        //Upper Left
        int r = row;
        for(int c=0; c>=0 && r>=0;c--,r--){
            if(board[r][c] == 'Q'){
                return false;
            }
        }
        //Upper Right
        r = row;
        for(int c=col; c<board.length && r>=0;r--,c++){
            if(board[r][c] == 'Q'){
                return false;
            }
        }
        //Lower left
        r = row;
        for (int c=col; c>=0 && r< board.length; r++,c--){
            if(board[r][c] == 'Q'){
                    return false;
            }
        }
        //Lower Right
        for (int c=col; c< board.length && r< board.length;c++,r++) {
            if (board[r][c] == 'Q') {
                return false;
            }
        }
        return true;
    }
    public void saveBoard(char[][] board , List<List<String>> allBoards){
        String row = "";
        List<String> newBoard = new ArrayList<>();
        for (int i=0; i<board.length;i++){
            row = "";
            for(int j = 0;j<board[0].length;j++){
                if (board[i][j] == 'Q')
                    row += 'Q';
                else
                    row += '.';
            }
            newBoard.add(row);
        }
        allBoards.add(newBoard);
    }
    public void helper(char[][] board , List<List<String>> allBoards, int col){
        if(col == board.length){
            saveBoard(board,allBoards);
            return;
        }

        for (int row = 0;row<board.length;row++){
            if (isSafe(row,col,board)){
                board[row][col] = 'Q';
                helper(board,allBoards,col+1);
            }
        }
    }
    public List<List<String>> solveNQueens(int n){
        List<List<String>> allBoards = new ArrayList<>();
        char[][] board = new char[n][n];
        helper(board,allBoards,0);
        return allBoards;
    }

}*/

