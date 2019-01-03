package com.larisa;

import java.sql.SQLOutput;

public class Main {

    public static void main(String[] args) {
        int newScore = calculateScore("Tim", 500);
        System.out.println("New score is " + newScore);

        calculateScore(75);
        calculateScore("Waz", 100);
        calculateScore();

        calcFeetAndInchesToCentimeters(6,0);
        calcFeetAndInchesToCentimeters(157);
    }

    public static int calculateScore(String playerName, int score){
        System.out.println("Player " + playerName + " scored" + score + " points");
        return score * 1000;
    }


    public static int calculateScore(int score){
        System.out.println("Unnamed Player scored " + score + " points");
        return score * 1000;
    }

    public static int calculateScore(){
        System.out.println("No played name, no points");
        return 0;
    }






    public static double calcFeetAndInchesToCentimeters(double feet, double inches){
        if (feet < 0 || inches < 0 || inches > 12){
            return -1;
        }

        double cm = inches * 2.54 + feet * 12 * 2.54;
        System.out.println(cm + "cm");
        return cm;
    }

    public static double calcFeetAndInchesToCentimeters(double inches){
        if (inches < 0){
            return -1;
        }

        double feet = (int)inches / 12;
        double rest = (int)inches % 12;

        return calcFeetAndInchesToCentimeters(feet, rest);


    }
}
