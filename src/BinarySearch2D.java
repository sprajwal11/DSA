public class BinarySearch2D {

    public static int[] sortedRnC(int[][] matrix, int target){

        int r=0;
        int c= matrix.length-1;

        while(r< matrix.length && c>=0){
            if(matrix[r][c]==target){
                return new int[]{r,c};
            }
            if (matrix[r][c]<target){
                r++;
            }
            else {
                c--;
            }
        }
        return new int[]{-1,-1};
    }

    public static int[] fullySorted(int[][] matrix, int target){
        int r=matrix.length;
        int c=matrix[0].length;

        if(r==1){
            return binarySearch(matrix,0,0,c-1,target);
        }
        int rStart=0;
        int rEnd=r-1;
        int cMid=c/2;

        while (rStart<(rEnd-1)){ //
            int mid=rStart+(rEnd-rStart)/2;
            if(matrix[mid][cMid]==target){
                return new int[]{mid,cMid};
            }
            if(matrix[mid][cMid]<target){
                rStart=mid;
            }
            else {
                rEnd=mid;
            }

        }
        if(matrix[rStart][cMid]==target){
            return new int[]{rStart,cMid};
        }
        if (matrix[rStart+1][cMid]==target){
            return new int[]{rStart+1,cMid};
        }


        return new int[]{-1,-1};
    }


    //search int the row provided between the column provided
    static int[] binarySearch(int[][] matrix, int row,int cStart,int cEnd,int target){
        while(cStart<=cEnd){
            int mid=cStart+(cEnd-cStart)/2;

            if (matrix[row][mid]==target){
                return new int[]{row,mid};
            }
            if (matrix[row][mid]<target){
                cStart=mid+1;
            }
            else {
                cEnd=mid-1;
            }
        }
        return new int[]{-1,-1};
    }
}
