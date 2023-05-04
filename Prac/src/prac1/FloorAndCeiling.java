package prac1;

import java.util.Arrays;
import java.util.Scanner;

public class FloorAndCeiling {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = {2,3,5,8,45,67,89,};
        System.out.println(Arrays.toString(arr));
        System.out.print("Enter target element: ");
        int target = in.nextInt();

        System.out.println("Floor = "+myFloor(arr,target) + "\nCeiling = "+myCeiling(arr,target));

    }
    static int myFloor(int[] arr, int target) {
        int start = 0, end = arr.length - 1;
        int ans = -1;
        /*while(start<=end) {

            int mid = start + (end-start)/2;

            if(arr[mid] < target) {
                ans = start;
                start = mid+1;
            } else if (arr[mid] > target) {
                ans = start;
                end = mid-1;
            }else{
                return arr[mid];
            }
        }
        return arr[ans-1];

    }*/
        if(target < arr[start]) {
            return -1;
        }

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] > target) {
                end = mid - 1;
            } else if (arr[mid] < target) {
                start = mid + 1;
            } else {
                return arr[mid];
            }
        }
        return arr[end];
    }
    static int myCeiling(int[] arr, int target) {
        int start = 0, end = arr.length - 1;
        if(target > arr[end]){
            return -1;
        }

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] > target) {
                end = mid - 1;
            } else if (arr[mid] < target) {
                start = mid + 1;
            } else {
                return arr[mid];
            }
        }
        return arr[start];
    }
}
