package com.lrs;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("Sum is " + sumDigits(32123));
    }

    public static int sumDigits(int n){
        if (n < 10){
            return -1;
        }
        int sum = 0;
        while (n > 0){
            sum = sum + n%10;
            n = n/10;
        }

        return sum;
    }
}
