package com.lrs;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int sum = 0, count = 0;
        for (int i = 1; i <= 1000; i++){
            if (i % 15 == 0){
                System.out.println(i);
                sum += i;
                count++;
            }
            if (count == 5){

                break;
            }
        }
        System.out.println("Sum is " + sum);
    }
}
