package prac1;

import java.util.Scanner;

public class OrderAgnosticBS {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = {2,4,7,9,23,45,67,89};
        int[] arrRev = {89,67,45,23,9,7,4,2};

        System.out.print("Enter target element: ");
        int target = in.nextInt();

        System.out.println("Target element("+target+") is at position "+BinSearch(arr,target)+" in ascending array and at postion "+BinSearch(arrRev,target)+" in descending array.");

    }
    static int BinSearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length-1;
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
