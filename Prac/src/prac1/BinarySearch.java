package prac1;

import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = {2,3,4,7,9,23,56,89,100};
        System.out.print("Enter target element: ");
        int target = in.nextInt();
        System.out.println("Target("+target+") was found on index : "+Binary_Search(arr,target));
    }
    //will return the index, if not present return -1
    static int Binary_Search(int[] arr, int target) {
        int start = 0, end = arr.length-1;

        //int mid = (start + end) /2;
        //the above formula will not work when the values are high, they will exceed the range of int.
        //int mid = start + (end-start)/2; - This is a better way to do the same
        // start + (end-start)/2 = (2start + end - start) /2 = (start+end) /2
        //so its basically the same formula, but it will take lesser range

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
