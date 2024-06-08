import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArraysQuestions {
    public static void main(String[] args) {
       // int[] arr={-2,1,-3,4,-1,2,1,-5,4};
       // printPairOfArr(arr);
       // maxSubArrSumBF(arr); //need to fix for all neg integer
       // int[] height={4,2,0,6,3,2,5};
       // trappingRainwater(height); //going to solve by auxiliary arrays

       // int[] stockPrices={7,1,5,3,6,4};
      //  buyAndSellStocks(stockPrices);

        int[] arr= {2,5,1,3,4,7};
        System.out.println(Arrays.toString(shuffle(arr,3)));
    }

    static int[] shuffle(int[] nums, int n) { //needs to fix
        int x=0;
        int y=n;
        int[] ans=new int[2*y];
        for (int i = 0; i < nums.length; i++) {
            
        }
        return ans;
    }

    static void buyAndSellStocks(int[] arr){
        int buyPrice=Integer.MAX_VALUE;
        int maxProfit=0;
        for (int i=0;i<arr.length;i++){
            if (buyPrice<arr[i]){
                int profit=arr[i]-buyPrice;  //today's profit
                maxProfit=Math.max(maxProfit,profit);
            }
            else {
                buyPrice=arr[i];
            }
        }
        System.out.println(maxProfit);
    }

    private static void trappingRainwater(int[] height) {
        int leftMax[]=new int[height.length];
        leftMax[0]=height[0];
        for (int i=1;i<height.length;i++){
            leftMax[i]=Math.max(height[i],leftMax[i-1]);
        }
        int rightMax[]=new int[height.length];
        rightMax[height.length-1]=height[height.length-1];
        for (int i=height.length-2;i>=0;i--){
            rightMax[i]=Math.max(height[i],rightMax[i+1]);
        }
        int trappedwater=0;
        for (int i = 0; i < height.length; i++) {
            int waterlevel=Math.min(leftMax[i],rightMax[i]);
            trappedwater+=waterlevel-height[i];
        }
        System.out.println(trappedwater);
    }

    static void maxSubArrSumKadanesAlgo(int[] arr){
        int max=Integer.MIN_VALUE;
        int cs=0;
        for (int i = 0; i < arr.length; i++) {
            cs=cs+arr[i];
            if (cs<0){
                cs=0;
            }
            max=Math.max(max,cs);
        }
        System.out.println(max);
    }

    static void maxSubArrSumBF(int[] arr){
        int max=Integer.MIN_VALUE;
        for (int i=0;i<arr.length;i++){
            int currSum=arr[i];
            String subArr="{"+String.valueOf(arr[i]);
            //System.out.println(subArr+"}");
            for (int j = i+1; j <arr.length; j++) {
                currSum+=arr[j];
                subArr=subArr+", "+ String.valueOf(arr[j]);
               // System.out.println(subArr+"}");
                System.out.println(currSum);
            }
            if (currSum>max){
                max=currSum;
            }
        }
        System.out.println(max);
    }

    static void printPairOfArr(int[] arr){

        for (int i = 0; i < arr.length-1; i++) {
            for (int j = i+1; j < arr.length; j++) {
                System.out.println("("+arr[i]+", "+arr[j]+")");
            }
        }
    }

    static void printSubArr(int[] arr){

        for (int i=0;i<arr.length;i++){
            String subArr="{"+String.valueOf(arr[i]);
            System.out.println(subArr+"}");
            for (int j = i+1; j <arr.length; j++) {
                subArr=subArr+", "+ String.valueOf(arr[j]);
                System.out.println(subArr+"}");
            }
        }
    }

    public static int[] moveZeros(int[] arr){
        int j=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=0 && arr[j]==0){
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
            if(arr[j]!=0){
                j++;
            }
        }
        return arr;
    }
    public static int[] removeEvan(int [] arr){
        int oddCoount=0;
        for(int i=0;i< arr.length;i++){
            if (arr[i]%2!=0){
                oddCoount++;
            }
        }
        int[] oddArr=new int[oddCoount];
        int j=0;
        for(int i=0;i< arr.length;i++){
            if (arr[i]%2!=0){
                oddArr[j]=arr[i];
                j++;
            }
        }
        return oddArr;
    }

    public static int[] reverseArr(int[] arr){
        int l=arr.length-1;
        for (int i=0;i<(l/2)+1;i++){
            int temp=arr[i];
            arr[i]=arr[l-i];
            arr[l-i]=temp;
        }
        return arr;
    }
    public static int minInArr(int[] arr){
        int min=Integer.MAX_VALUE; // or int min=arr[0];
        for (int i=0;i<arr.length;i++){
            if(min>arr[i]){
                min=arr[i];
            }
        }
        return min;
    }



    public static int secondMax(int[] arr){
        int max=arr[0];
        int sMax=arr[1];
        for (int i=0;i<arr.length;i++){
            if (max<arr[i] && max<sMax){
                sMax=max;
                max=arr[i];
            }
            if(sMax<arr[i] && arr[i]!=max){
                sMax=arr[i];
            }
        }
        return sMax;
    }

    public static int[] resizeArr(int[] arr,int capacity){
        if (capacity<arr.length){
            return arr;
        }
        int[] temp=new int[capacity];

        for (int i=0;i<arr.length;i++){
            temp[i]=arr[i];
        }
        return temp;
    }

    public static int findMissingNum(int[] arr){
        int n=arr.length+1;
      //  int sumArr=0;
        int sumOfRange=n*(n+1)/2;
         for (int i=0;i<arr.length;i++) {
             //sumArr += arr[i];
             sumOfRange-=arr[i];
         }
        return sumOfRange;
        // return sumOfRange-sumArr;
    }

    public static boolean checkPalindrome(String str){
//        String revStr="";
//        for (int i=0;i<str.length();i++){
//            revStr=str.charAt(i)+revStr;
//        }
//        return revStr.equals(str) ? true : false;
//    }

        // using two pointers

        char[] charArr=str.toCharArray();
        int start=0;
        int end=charArr.length-1;

        while (start<end){
            if (charArr[start]!=charArr[end]){
                return false;
            }
            start++;
            end--;
        }
        return  true;
    }

    public static void sortArrWithBubbleSort(int[] arr){
        int n=arr.length;
/*        for(int i=0; i < n; i++){
            boolean swap=false;
            for(int j=0; j < (n-i-1); j++){
                 if (arr[j+1]<arr[j]){
                    int temp=arr[j+1];
                    arr[j+1]=arr[j];
                    arr[j]=temp;
                    swap=true;
                }
            }
            if (!swap){
                break;
            }
        }*/
        for (int i=0;i<n;i++){
            for (int j=1;j<n-i;j++){
                if (arr[j]<arr[j-1]){
                    swap(arr,j,j-1);
//                    int temp=arr[j];
//                    arr[j]=arr[j-1];
//                    arr[j-1]=temp;
                }
            }
        }
    }

    public static void selectionSort(int[] arr){
        for (int i=0;i<arr.length;i++){
        int last=arr.length-i-1;
        int maxIndex=getMaxIndex(arr,0,last);
        swap(arr,maxIndex,last);
        }
    }
    public static int getMaxIndex(int[] arr,int start,int end){
        int max=start;
        for (int i=0;i<=end;i++){
            if (arr[i]>arr[max]){
                max=i;
            }
        }
        return max;
    }
    public static void swap(int[] arr,int first,int last){
        int temp=arr[first];
        arr[first]=arr[last];
        arr[last]=temp;
    }

    public static void insertionSort(int[] nums){
        for (int i=1;i<nums.length;i++){
            int temp=nums[i];
            int j=i-1;

            while (j>=0 && nums[j]>temp){
                nums[j+1]=nums[j];
                j--;
            }
            nums[j+1]=temp;
        }
    }

    public static void cyclicSort(int[] arr){
        int i=0;
        while (i<arr.length){
            int correct=arr[i]-1;
            if (arr[i]-1!=i){
                swap(arr,i,correct);
            }
            else{
                i++;
            }
        }
    }

    public static int missingNumber(int[] nums){
        int i=0;
        while (i<nums.length){
            int correct=nums[i];
            if (nums[i]<nums.length && nums[i]!=nums[correct]){
                swap(nums,i,correct);
            }
            else{
                i++;
            }
        }
        for (int j=0;j<nums.length;j++){
            if(nums[j]!=j)
                return j;
        }
        return nums.length;
    }

    public static List<Integer> findDisappearedNumbers(int[] nums) {
        cyclicSortForLeetCode(nums);
        //System.out.println(Arrays.toString(nums));
        return search(nums);
    }

    static void cyclicSortForLeetCode(int[] arr){
        int i=0;
        while (i<arr.length){
            int correct=arr[i]-1;
            if (arr[i]!=arr[correct]){
                swap(arr,i,correct);
            }
            else{
                i++;
            }
        }
    }
    static List<Integer> search(int[] nums){
        List<Integer> missingNums=new ArrayList<Integer>();
        for (int j=0;j<nums.length;j++){
            if(nums[j]!=j+1)
                missingNums.add(j+1);
        }
        return missingNums;
    }




}
