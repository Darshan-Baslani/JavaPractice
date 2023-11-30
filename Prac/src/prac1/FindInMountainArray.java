package prac1;
//leetcode 1095 - hard
//https://leetcode.com/problems/find-in-mountain-array/
public class FindInMountainArray {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,3,1};
        System.out.println(find_index(arr,5));
    }
    public static int find_index(int[] arr, int target)  {
        int peak = peakIndexInMountainArray(arr);
        int ans = BinSearch(arr,target,0,peak);
        if(ans != -1) {
            return ans;
        }
        return BinSearch(arr,target,peak+1,arr.length-1);
    }

    public static int peakIndexInMountainArray(int[] arr) {
        int start = 0, end = arr.length - 1, maxIndex = 0;
        while(start < end) {
            int mid = start + (end - start) / 2;
            if(arr[mid] > arr[mid + 1]) {
                end = mid;
            }else{
                start = mid + 1;
            }
        }
        return start;
    }
    static int BinSearch(int[] arr, int target, int start, int end) {
        if(arr[start]<arr[end]){
            while(start<=end) {
                int mid = start + ((end-start)/2);
                if(arr[mid] > target){
                    end = mid-1;
                } else if (arr[mid] < target) {
                    start = mid+1;
                }else{
                    return mid;
                }
            }
        }else{
            while(start<=end) {
                int mid = start + ((end-start)/2);
                if(arr[mid] > target){
                    start = mid+1;
                } else if (arr[mid] < target) {
                    end = mid-1;
                }else{
                    return mid;
                }
            }
        }
        return -1;
    }
}
