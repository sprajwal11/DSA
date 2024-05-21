import java.util.Arrays;

public class Main {


    public static void main(String[] args) {

        int[] arr={2,3,5,6,14,16,18};
        int target=4;

     //   System.out.println(BinarySearch.ceilingNum(arr,target));
    //    System.out.println(BinarySearch.floorNum(arr,target));

        //leetcode: https://leetcode.com/problems/find-smallest-letter-greater-than-target/
        char letters[]= {'c','f','j'};
        char character='a';
       //System.out.println(BinarySearch.nextGreatestLetter(letters,character));

        //leetcode: https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/description/
        //case 1
        int[] nums = {5,7,7,8,8,10};
        char t=8;

        //case 2
       // int[] nums = {5,7,7,8,8,10};
        //char t=6;

        //case 3
       // int[] nums = {};
       // char t=0;
      //  System.out.println(Arrays.toString(BinarySearch.searchRange(nums,t)));

       // System.out.println(BinarySearch.infiniteArray(nums,t));

        //https://leetcode.com/problems/peak-index-in-a-mountain-array/
        //int[] arr1 = {0, 1, 0};
       // System.out.println(BinarySearch.peakIndexInMountainArray(arr1));

        //https://leetcode.com/problems/find-in-mountain-array/description/
        int[] array = {1,2,3,4,5,3,1} ;
        int target2 = 3;
       // System.out.println(BinarySearch.findInMountainArray(target2,array));

        //https://leetcode.com/problems/search-in-rotated-sorted-array/submissions/1167805424/
        //int[] sortedRotatedArr ={4,5,6,7,0,1,2};
        //int number=1;
        int[] sortedRotatedArr ={3,4,5,6,7,1,2};
        int number=4;
        //System.out.println(BinarySearch.searchInRotatedSortedArray(sortedRotatedArr,number));

        int[] sortedRotatedArr2 ={2,3,4,5,1};

        //System.out.println(BinarySearch.findMininRotatedArray(sortedRotatedArr2));

        //https://leetcode.com/problems/search-in-rotated-sorted-array/description/
//        System.out.println(BinarySearch1D.findInRotatedArray(sortedRotatedArr2,5));


        //https://leetcode.com/problems/find-minimum-in-rotated-sorted-array/
        //System.out.println(BinarySearch.findMinInRotatedArray(sortedRotatedArr2));


        //############### Binary Search in 2D Arrays #############

        int[][] twoDArr={
                {10,20,30,40},
                {15,25,35,45},
                {28,29,37,49},
                {33,34,38,50}};

       // System.out.println(Arrays.toString(BinarySearch2D.sortedRnC(twoDArr,21)));


        //################### Array questions ################
        int arrMoveZeros[]={8,1,0,2,1,0,3};

        //System.out.println(Arrays.toString(ArraysQuestions.moveZeros(arrMoveZeros)));

        int arrRemoveEven[]={3,2,4,7,10,5};

//        System.out.println(Arrays.toString(ArraysQuestions.removeEvan(arrRemoveEven)));

        int[] revArr={2,11,5,10,7,8};

//        System.out.println(Arrays.toString(ArraysQuestions.reverseArr(revArr)));

        int[] minInArr={5,9,3,15,1,2};
//        System.out.println(ArraysQuestions.minInArr(minInArr));

//        int [] secondMax= {12,34,2,34,33,1};
//        System.out.println(ArraysQuestions.secondMax(secondMax));
//
//        int[] resizeArr={5,9,3,10};
//        resizeArr=ArraysQuestions.resizeArr(resizeArr,6);
//        System.out.println(Arrays.toString(ArraysQuestions.resizeArr(resizeArr,2)));

//        int[] missingNum={1,5,2,3,4,7};
//
//        System.out.println(ArraysQuestions.findMissingNum(missingNum));
//
//        String str="madam";
//        System.out.println(ArraysQuestions.checkPalindrome(str));

//        int[] sortArr={1,6,5,2,3,4,7,0,2,-3};
//        ArraysQuestions.sortArrWithBubbleSort(sortArr);
//        System.out.println(Arrays.toString(sortArr));

//        int[] selectionSortArr={1,6,5,2,3,4,7,0,2,-3};
//        ArraysQuestions.selectionSort(selectionSortArr);
//        System.out.println(Arrays.toString(selectionSortArr));

//        int[] insertionSortArr={1,6,5,2,3,4,7,0,2,-3};
//       ArraysQuestions.insertionSort(insertionSortArr);
//        System.out.println(Arrays.toString(insertionSortArr));

//        int[] cyclicSortArr={5,2,4,3,1};
//        ArraysQuestions.cyclicSort(cyclicSortArr);
//        System.out.println(Arrays.toString(cyclicSortArr));


        //https://leetcode.com/problems/missing-number/
//        int[] findMissingNumber = {3,0,1};
//        System.out.println(ArraysQuestions.missingNumber(findMissingNumber));

        int[] findDisappearedNumbers={4,3,2,7,8,2,3,1};

      //  System.out.println(ArraysQuestions.findDisappearedNumbers(findDisappearedNumbers).toString());

        String s="madam";
        int start=0;
        int end=s.length()-1;
        boolean pal=true;
        while (start<=end){
            if (s.charAt(start)!=s.charAt(end)){
                pal=false;
                break;
            }
            else{
                start++;
                end--;
            }
        }
        System.out.println(pal);
    }





}