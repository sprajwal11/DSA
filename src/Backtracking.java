import java.util.Arrays;

public class Backtracking {

    static void changeArr(int[] arr, int i, int val) {
        //base case
        if (i >= arr.length) {
            return;
        }
        //recursion
        arr[i] = val;
        changeArr(arr, i + 1, val + 1);
        arr[i] = arr[i] - 2;
    }

    static void findSubset(String str, String newStr, int i) {
        if (i >= str.length()) {
            if (newStr.length() == 0) {
                System.out.println("null");
            }
            System.out.println(newStr);
            return;
        }
        char character = str.charAt(i);
        findSubset(str, newStr + character, i + 1);
        findSubset(str, newStr, i + 1);

        //newStr+=character;
        //System.out.println(newStr);
    }

    static void findPermutation(String str, String newStr) {
        if (str.length() == 0) {
            System.out.println(newStr);
            return;
        }
        for (int i = 0; i < str.length(); i++) {
            char curr = str.charAt(i);
            String temp = str.substring(0, i) + str.substring(i + 1);
            findPermutation(temp, newStr + curr);
        }

    }


    private static boolean isSafe(char[][] board, int row, int col) {
        //vertical up
        for (int i = row - 1; i >= 0; i--) {
            if (board[i][col] == 'Q') {
                return false;
            }
        }//diagonal up left
        for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == 'Q') { //diagonal up left
                return false;
            }
        }//diagonal up right
        for (int i = row - 1, j = col + 1; i >= 0 && j < board[i].length; i--, j++) {
            if (board[i][j] == 'Q') {
                return false;
            }
        }
        return true;
    }

    static void printBoard(char[][] board) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

    static void nQueen(char[][] board, int row) {
        if (row == board.length) {
            System.out.println("=========Board=========");
            printBoard(board);
            return;
        }

        for (int i = 0; i < board.length; i++) {
            if (isSafe(board, row, i)) {
                board[row][i] = 'Q';
                nQueen(board, row + 1);
                board[row][i] = 'X'; //backtracking step
            }
        }
    }

    static int gridWays(int i, int j, int n, int m) {
        if (i==n-1 && j==m-1){
            return 1;
        } else if (i==n||j==m) {
            return 0;

        }
        int w1 = gridWays(i + 1, j, n, m);
        int w2 = gridWays(i, j + 1, n, m);

        return w1 + w2;
    }

    static boolean sudokuSolver(int sudoku[][], int row, int col){


        int nextRow=row, nextCol=col+1;
        if (col+1==9){
            nextRow=row+1;
            nextCol=0;
        }
        for (int digit=1;digit<=9;digit++){
            if (isSafe(sudoku,row,col,digit)){
                sudoku[row][col]=digit;
               if ( sudokuSolver(sudoku,nextRow,nextCol)) {
                    return true;
               }
               sudoku[row][col]=0;
            }
        }
        return false;
    }

    private static boolean isSafe(int[][] sudoku, int row, int col, int digit) {
        return true;
    }

    public static void main(String[] args) {
        // int[] arr={1,2,3,4,5};

        //changeArr(arr,0,1);

        // System.out.println(Arrays.toString(arr));


//        String str = "abc";

        // findSubset(str,"",0);
//        findPermutation(str, "");
//        int n = 4;
//        char[][] board = new char[n][n];
//
//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j < n; j++) {
//                board[i][j] = 'X';
//            }
//        }
//        // printBoard(board);
//        nQueen(new char[4][4], 0);

       // int n = 3, m = 3;

        //System.out.println(gridWays(0, 0, n, m));
        int sudoku[][] = { {0, 0, 8, 0, 0, 0, 0, 0, 0},
                {4, 9, 0, 1, 5, 7, 0, 0, 2},
                {0, 0, 3, 0, 0, 4, 1, 9, 0},
                {1, 8, 5, 0, 6, 0, 0, 2, 0},
                {0, 0, 0, 0, 2, 0, 0, 6, 0},
                {9, 6, 0, 4, 0, 5, 3, 0, 0},
                {0, 3, 0, 0, 7, 2, 0, 0, 4},
                {0, 4, 9, 0, 3, 0, 0, 5, 7},
                {8, 2, 7, 0, 0, 9, 0, 1, 3} };
    }
}
