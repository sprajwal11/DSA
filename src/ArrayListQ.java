import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class ArrayListQ {

    static void containerWithMostWater(List<Integer> height) {
        int start = 0, end = height.size() - 1;
        int mostWater = 0;

        while (start <= end) {

            int maxHeight = Math.min(height.get(start), height.get(end));
            int width = end - start;

            mostWater = Math.max(mostWater, maxHeight * width);

            if (height.get(start) < height.get(end)) {
                start++;
            } else {
                end--;
            }
        }
        System.out.println(mostWater);

    }

    static void pairSum(List<Integer> arr, int target){
        int start=0, end=arr.size()-1;
        int[] pair={-1,-1};
        while (start<=end){
            if (arr.get(start)+arr.get(end)>target){
                end--;
            } else if (arr.get(start)+arr.get(end)<target) {
                start++;
            }
            else{
                pair[0]=arr.get(start);
                pair[1]=arr.get(end);
                break;
            }
        }
        System.out.println(Arrays.toString(pair));
    }

    static void pairSumSortedRotatedArr(List<Integer> arr, int target){
            int pivot=findPivot(arr);
            int[] pair={-1,-1};
            int n=arr.size();

            int left=pivot+1;
            int right=pivot;

            while (left!=right){
                if (arr.get(left)+arr.get(right)==target){
                    pair[0]=arr.get(left);
                    pair[1]=arr.get(right);
                    break;
                }
                else if (arr.get(left)+arr.get(right)<target){
                    left=(left+1)%n;
                }
                else {
                    right=(n+right-1)%n;
                }

            }
        System.out.println(Arrays.toString(pair));

    }

    static int findPivot(List<Integer> arr){
        for (int i = 1; i < arr.size()-1; i++) {
            if (arr.get(i-1)<arr.get(i) && arr.get(i)>arr.get(i+1) ){
                return i;
            }
        }
        return arr.size()-1;
    }

    public static void main(String[] args) {

        List<Integer> height = new ArrayList<>();

        height.add(1);
        height.add(8);
        height.add(6);
        height.add(2);
        height.add(5);
        height.add(4);
        height.add(8);
        height.add(3);
        height.add(7);

       // containerWithMostWater(height);

        List<Integer> sortedArrList=new ArrayList<>();

        sortedArrList.add(1);
        sortedArrList.add(2);
        sortedArrList.add(3);
        sortedArrList.add(4);
        sortedArrList.add(5);
        sortedArrList.add(6);

        int t=6;

        pairSum(sortedArrList,t);


        ArrayList<Integer> sortedRotatedArr = new ArrayList<>();
//11, 15, 6, 8, 9, 10 - Sorted & Rotated
        sortedRotatedArr.add(11);
        sortedRotatedArr.add(15);
        sortedRotatedArr.add(6);
        sortedRotatedArr.add(8);
        sortedRotatedArr.add(9);
        sortedRotatedArr.add(10);
        int target = 16;


        pairSumSortedRotatedArr(sortedRotatedArr,target);

        List<Integer> linkedList=new LinkedList<>();

        linkedList.hashCode();
    }
}
