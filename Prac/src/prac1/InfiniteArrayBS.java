//This program is designed for infinite elements in the array, may not work properly in finite elements.
public class InfiniteArrayBS {
    public static void main(String[] args) {
        int[] arr = new int[]{3, 5, 7, 9, 10, 90,
                100, 130, 140, 160, 170};
        int target = 10;
        int start = 0, end = 1;
        int ans=-1;
        while(target > arr[end]) {
            int temp = end + 1;
            end = end + (end - start + 1) * 2;
            start = temp;
        }
        ans = Binary_Search(arr, target, start, end);
        System.out.println(ans);
    }
    static int Binary_Search(int[] arr, int target, int start, int end) {

        while(start <= end) {
            int mid = start + (end - start) / 2;
            if(arr[mid] > target) {
                end = mid-1;
            } else if (arr[mid] < target) {
                start = mid+1;
            }else{
                return mid;
            }
        }
        return -1;
    }
}
