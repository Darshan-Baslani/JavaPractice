package prac1;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExample {
    public static void main(StringBuilder[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<Integer> aList = new ArrayList<>();

        for(int i=0; i<5; i++) {
            aList.add(in.nextInt());
        }
        for(int i=0; i<5; i++) {
            System.out.println(aList.get(i));
        }

    }
}
