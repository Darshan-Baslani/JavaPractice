package prac1;

import java.util.Scanner;

public class array {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter no of elements you want to enter: ");
        int num = in.nextInt();
        int[] arr = new int[num];

        System.out.println("Enter array elements: ");
        for(int i=0; i<arr.length; i++) {
            arr[i] = in.nextInt();
        }
        System.out.println("Array elements are: ");
        for(int element : arr) {
            System.out.print(element);
        }

    }
}
