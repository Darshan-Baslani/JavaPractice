package prac1;

import java.util.Scanner;

public class function {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter no 1: ");
        int num1 = in.nextInt();
        System.out.print("Enter no 2: ");
        int num2 = in.nextInt();

        System.out.println("Sum of num1 and num2 = " + sum(num1,num2));

    }
    static int sum(int num1, int num2) {
        return num1+num2;
    }
}
