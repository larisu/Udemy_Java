package com.lrs;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here

        Scanner scanner = new Scanner(System.in);
        int counter = 1;
        int sum = 0;

        while (counter < 11){
            System.out.println("Enter number " + counter);
            boolean hasNextInt = scanner.hasNextInt();

            if (hasNextInt) {
                int number = scanner.nextInt();
                counter++;
                sum +=number;
            } else {
                System.out.println("Invalid number");

            }
            scanner.nextLine();
        }
        System.out.println("Sum is " + sum);
        scanner.close();
    }
}
