package prac1;

public class TimesOfRotationOfArrayBS {
    public static void main(String[] args) {
        int arr[] = {7, 9, 11, 12, 15};
        int times_of_rotaion = peak(arr) + 1;
        System.out.println(times_of_rotaion);
    }
    public static int peak(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while(start<=end) {
            int mid = start + (end-start) / 2;
            if(arr[mid] > arr[mid+1]) {
                return mid;
            } else if (arr[mid] < arr[mid-1]) {
                return mid - 1;
            } else if (arr[start] < arr[mid]) {
                start = mid+1;
            }else{
                end = mid-1;
            }
        }
        return -1;
    }
}
