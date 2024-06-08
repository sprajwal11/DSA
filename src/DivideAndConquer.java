import java.util.Arrays;

public class DivideAndConquer {

    static void conquer(int[] arr, int s,int mid, int e){
        int merged[]=new int[e-s+1];
        int index1=s;
        int index2=mid+1;
        int x=0;

        while (index1<=mid && index2<=e){
            if (arr[index1]<=arr[index2]){
                merged[x]=arr[index1];
                x++;
                index1++;
            }
            else{
                merged[x]=arr[index2];
                x++;
                index2++;
            }
        }
        while (index1<=mid){
            merged[x]=arr[index1];
            x++;
            index1++;
        }
        while (index2<=e){
            merged[x]=arr[index2];
            x++;
            index2++;
        }

        for (int i=0, j=s;i< merged.length;i++,j++){
            arr[j]=merged[i];
        }
    }

    static void divide(int arr[], int s,int e){
        if (s>=e){
            return;
        }
        int mid=s+(e-s)/2;

        divide(arr,s,mid);
        divide(arr,mid+1,e);
        conquer(arr,s,mid,e);
    }

    static void quickSort(int[] arr,int si,int ei){
        if (si>=ei){
            return;
        }
        int pIdx=partition(arr, si, ei);
        quickSort(arr, si,pIdx-1);
        quickSort(arr,pIdx+1,ei);
    }

    private static int partition(int[] arr, int si, int ei) {
        int pivot =arr[ei];
        int i=si-1; //to make place for elements smaller than pivot

        for (int j=si;j<ei;j++){
            if (arr[j]<=pivot){
                i++;

                //swap
                int temp=arr[j];
                arr[j]=arr[i];
                arr[i]=temp;
            }
        }
        i++;

        //swap
        int temp=pivot;
        arr[ei]=arr[i];
        arr[i]=temp;
        return i;

    }


    static void printArr(int arr[]){
        System.out.println(Arrays.toString(arr));
    }


    static int searchSortedRotatedArr(int arr[],int target,int si, int ei){
        if (si>ei){
            return -1;
        }
        int mid=si+(ei-si)/2;

        if (arr[mid]==target){
            return mid;
        }
        //mid on L1
        if (arr[si]<=arr[mid]){
            //case a: left{
            if (arr[si]<=target && target<=arr[mid]){
                return searchSortedRotatedArr(arr,target,si,mid-1);
            }
            else {
                //case b: right
               return searchSortedRotatedArr(arr,target,mid+1,ei);
            }
        }
        //mid on line 2
        else {
//            case c: right
            if (arr[mid]<=target && target<=arr[ei]){
                return searchSortedRotatedArr(arr,target,mid+1,ei);
            }
            else{
                //case d: left
                return searchSortedRotatedArr(arr,target,si,mid-1);
            }
        }
    }

    public static void main(String[] args) {


       // int arr[]={6,3,9,5,2,8};
        //int n=arr.length;
        //merge sort
        //divide(arr,0,n-1);
        //System.out.println(Arrays.toString(arr));

        //quickSort(arr,0,arr.length-1);
       // printArr(arr);

        int sortedRotatedArr[]={4,5,6,7,0,1,2};
        System.out.println(searchSortedRotatedArr(sortedRotatedArr,5,0, sortedRotatedArr.length-1));
    }
}
