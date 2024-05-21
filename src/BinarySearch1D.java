public class BinarySearch1D {

    public static int binarySearch(int[] arr, int target,int start,int end){

        boolean asc=arr[start]<arr[end];

        while(start<=end){
            int mid=start+(end-start)/2;
            if (asc){
                if(target<arr[mid]){
                    end=mid-1;
                } else if (target>arr[mid]) {
                    start=mid+1;
                }
                else {
                    return mid;
                }
            }
            else {
                if(target>arr[mid]){
                    end=mid-1;
                } else if (target<arr[mid]) {
                    start=mid+1;
                }
                else {
                    return mid;
                }
            }
        }
        return -1;
    }
    public static int ceilingNum(int[] arr,int t){
        int start=0;
        int end=arr.length-1;
       // int ans=arr[end];

        boolean asc=arr[start]<arr[end];

        if(t>arr[end])
            return -1;
        while (start<=end){

            int mid=start+(end-start)/2;

            if(asc){
                if(t<arr[mid]){
                    end=mid-1;
                    //ans=arr[mid];
                } else if (t>arr[mid]) {
                    start=mid+1;
                    //ans=arr[mid];
                }
                else {
                    //ans=arr[mid];
                    return mid;
                }
            }
            else {
                if(t>arr[mid]){
                    end=mid-1;
                    //ans=arr[mid];
                } else if (t<arr[mid]) {
                    start=mid+1;
                    //ans=arr[mid];
                }
                else {
                   // ans=arr[mid];
                    return mid;
                }
            }
        }
        return start;
    }

    public static int floorNum(int[] arr,int t){
        {
            int start=0;
            int end=arr.length-1;
            // int ans=arr[end];

            boolean asc=arr[start]<arr[end];

            while (start<=end){

                int mid=start+(end-start)/2;

                if(asc){
                    if(t<arr[mid]){
                        end=mid-1;
                        //ans=arr[mid];
                    } else if (t>arr[mid]) {
                        start=mid+1;
                        //ans=arr[mid];
                    }
                    else {
                        //ans=arr[mid];
                        return mid;
                    }
                }
                else {
                    if(t>arr[mid]){
                        end=mid-1;
                        //ans=arr[mid];
                    } else if (t<arr[mid]) {
                        start=mid+1;
                        //ans=arr[mid];
                    }
                    else {
                        // ans=arr[mid];
                        return mid;
                    }
                }
            }
            return end;
        }
    }

    public static char nextGreatestLetter(char[] letters, char target) {
        int start=0;
        int end=letters.length-1;
        // int ans=letters[end];

        boolean asc=letters[start]<letters[end];

        if(target>letters[end])
            return letters[0];
        while (start<=end){

            int mid=start+(end-start)/2;

            if(asc){
                if(target<letters[mid]){
                    end=mid-1;
                }
                else{
                    start=mid+1;
                }
            }
            else {
                if(target>letters[mid]){
                    end=mid-1;
                } else {
                    start=mid+1;
                }
            }
        }
        return letters[start%letters.length];
    }

    public static int[] searchRange(int[] nums, int target) {

        if(nums.length==0)
            return new int[] {-1,-1};
        int start=searchArr(nums,target,true);
        int end=searchArr(nums,target,false);

        return new int[] {start,end};
    }

    static int searchArr(int[] nums,int target,boolean findStartIndex){
        int start=0;
        int end=nums.length-1;

        int ans=-1;

        boolean asc=nums[start]<nums[end];


        while (start<=end){

            int mid=start+(end-start)/2;

            if(asc){
                if(target<nums[mid]){
                    end=mid-1;
                } else if (target>nums[mid]) {
                    start=mid+1;
                }
                else {
                    ans=mid;
                    if(findStartIndex){
                        end=mid-1;
                    }
                    else {
                        start=mid+1;
                    }
                }
            }
            else {
                if(target>nums[mid]){
                    end=mid-1;
                } else if (target<nums[mid]) {
                    start=mid+1;
                }
                else {
                    ans=mid;
                    if(findStartIndex){
                        end=mid-1;
                    }
                    else {
                        start=mid+1;
                    }
                }
            }
        }
        return ans;
    }

    public static  int infiniteArray(int[] arr,int target){
        int start=0;
        int end=1;
        while(target>arr[end]){
            int newStart=end+1;
            end=end+(end-start+1)*2;
            start=newStart;

        }
        return ans(arr,target,start,end);
    }
    public static int ans(int[] arr,int target,int start,int end){
        boolean asc=arr[start]<arr[end];

        while (start<=end){

            int mid=start+(end-start)/2;

            if(asc){
                if(target<arr[mid]){
                    end=mid-1;
                } else if (target>arr[mid]) {
                    start=mid+1;
                }
                else {
                    return mid;
                }
            }
            else {
                if(target>arr[mid]){
                    end=mid-1;
                } else if (target<arr[mid]) {
                    start=mid+1;
                }
                else {
                    return mid;
                }
            }
        }
        return end;
    }
    public static int peakIndexInMountainArray(int[] arr) {
        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] < arr[mid + 1]) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }

        return right;
    }

    public static int findInMountainArray(int target, int[] mountainArr) {
        int peak=peakIndexInMountainArray(mountainArr);
        int firstTry=binarySearch(mountainArr,target,0,peak);
        if (firstTry!=-1){
            return firstTry;
        }
        else {
            return binarySearch(mountainArr,target,peak,mountainArr.length-1);
        }



    }

    public static int searchInRotatedSortedArray(int[] nums, int target) {
        int peak=peakIndexInMountainArray(nums);
        int firstTry=binarySearch(nums,target,0,peak);
        if (firstTry!=-1){
            return firstTry;
        }
        else {
            return binarySearch(nums,target,peak+1,nums.length-1);
        }
    }

    public static int findMininRotatedArray(int[] nums) {
        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] > nums[mid + 1]) {
                left = mid + 1;
            } else if (nums[mid] < nums[mid + 1]) {
                right = mid;
            }
        }

        return nums[right];
    }
    static int findPivot(int [] arr){
        int start=0;
        int end=arr.length-1;

        while(start<=end){
            int mid=start+(end-start)/2;

            if(mid<end && arr[mid]>arr[mid+1]){
                return mid;
            }
            if(mid>start && arr[mid]<arr[mid-1]){
                return mid-1;
            }
            if(arr[mid]<=arr[start]){
                end=mid-1;
            }
            else{
                start=mid+1;
            }

        }
        return -1;

    }

    public static int findInRotatedArray(int[] nums,int target){
        int pivot=findPivot(nums);

        if(pivot==-1){
            return binarySearch(nums,target,0,pivot);
        }
        if(nums[pivot]==target){
            return pivot;
        }
        if (target>=nums[0]){
            return binarySearch(nums,target,0,pivot);
        }
        else{
            return binarySearch(nums,target,pivot+1,nums.length-1);
        }
    }

    public static int findMinInRotatedArray(int[] nums) {
        int start=0;
        int end=nums.length-1;

        while(start<=end){
            int mid=start+(end-start)/2;

            if(mid<end && nums[mid]>nums[mid+1]){
                return nums[mid+1];
            }
            if(mid>start && nums[mid]<nums[mid-1]){
                return nums[mid];
            }
            if(nums[mid]<=nums[start]){
                end=mid-1;
            }
            else{
                start=mid+1;
            }

        }
        return nums[0];
    }


}
