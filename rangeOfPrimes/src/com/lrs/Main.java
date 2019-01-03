package com.lrs;

public class Main {

    public static void main(String[] args) {
	// write your code here
       rangePrimes(3,33);
    }

    public static void rangePrimes(int a, int b){
        int count = 0;

        for (int i = a; i<=b; i++){
            if (isPrime(i)){
                count++;
                System.out.println(i);
            }
            if (count == 3){
                break;
            }
        }
    }

    public static boolean isPrime(int n){

        if (n == 1){
            return false;
        }
        for (int i = 2; i <= n/2; i++){
            if (n % i == 0){
                return false;
            }
        }
        return true;
    }
}
