package com.lrs;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        Scanner scanner = new Scanner(System.in);

        while (true){
            System.out.println("Enter number");
            boolean isNumber = scanner.hasNextInt();


            if (isNumber){
                int n = scanner.nextInt();
                if (n < min){
                    min = n;
                }
                if (n > max){
                    max = n;
                }
            }
            else {
                System.out.println("Invalid number");
                System.out.println("Max is " + max + "and Min is " + min);
                break;
            }
            scanner.nextLine();
        }

        scanner.close();
    }
}
