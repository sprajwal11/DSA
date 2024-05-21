public class Arrays2D {
    public static void main(String[] args) {
        int[][] arr = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15, 16}};
        //printSpiralMatrix(arr);
        //diagonalSumOpt(arr);

        //int[][] matrix={{1,2,3},{3,1,2},{2,3,1}};
        //System.out.println(checkValid(matrix)); // need improvement

        int[][] sortedMatrix={
                {10,20,30,40},
                {15,25,35,45},
                {27,29,37,48},
                {32,33,39,50}};
        int target=45;
        searchInSortedMatrix(sortedMatrix,target);
    }

    static void searchInSortedMatrix(int[][] matrix, int t){ //timecomplexity O(n+m)
        int row=0;
        int col=matrix[0].length-1;

        while (row<matrix.length && col>=0){
            if (matrix[row][col]==t){
                System.out.println(row+" "+col);
                return;
            }
            if (t<matrix[row][col]){
                col--;
            }
            if (t>matrix[row][col]){
                row++;
            }
        }
        System.out.println("Not found");
    }

    static boolean checkValid(int[][] matrix) {

        int n=matrix.length;
        for(int i=0;i<n;i++){
            int sum=0;
            for(int j=0;j<matrix[i].length;j++){
                sum+=matrix[i][j];
            }
            //System.out.println(sum);
           // System.out.println(n*(n+1)/2);
            if(sum!=n*(n+1)/2){
                return false;
            }
        }
        return true;
    }

    static void diagonalSumBF(int[][] arr) {
        int sum = 0;
        for (int r = 0; r < arr.length; r++) {
            for (int c = 0; c < arr[r].length; c++) {
                if (r == c || r + c == arr.length - 1) {
                    sum += arr[r][c];
                }
            }
        }
        System.out.println(sum);
    }
    static void diagonalSumOpt(int[][] mat) {
        int sum = 0;
        for (int i = 0; i < mat.length; i++) {
            sum+=mat[i][i];
            if (i!=mat.length-1-i){
                sum+=mat[i][mat.length-i-1];
            }
        }
        System.out.println(sum);
    }

    static void printSpiralMatrix(int[][] arr) {

        int startR = 0;
        int startC = 0;
        int endR = arr.length - 1;
        int endC = arr[0].length - 1;

        while (startR <= endR && startC <= endC) {
            //top
            for (int c = startC; c <= endC; c++) {
                System.out.print(arr[startR][c] + " ");
            }
            //right
            for (int r = startR + 1; r <= endR; r++) {
                System.out.print(arr[r][endC] + " ");
            }
            //bottom
            for (int c = endC - 1; c >= startC; c--) {
                if (startR == endR) {
                    break;
                }
                System.out.print(arr[endR][c] + " ");
            }
            //left
            for (int r = endR - 1; r >= startR + 1; r--) {
                if (startC == endC) {
                    break;
                }
                System.out.print(arr[r][startC] + " ");
            }
            startR++;
            startC++;
            endR--;
            endC--;
        }
    }


}
