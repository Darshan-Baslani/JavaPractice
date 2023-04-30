package prac1;

import java.util.Scanner;

public class temperature {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter temperature in celsius: ");
        float tempC = input.nextFloat();

        System.out.println("Temperature in Fahrenheit = "+ ((tempC * 9/5) +32));
        //Math.max(5,6);

    }
}
