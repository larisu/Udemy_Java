package com.larisa;

public class Main {

    public static void main(String[] args) {
        //int width = 32
        int myMinValue = -2_147_483_648;
        int myMaxValue = 2_147_483_647;
        int myIntTotal = (myMinValue / 2);
        System.out.println("myIntTotal = " + myIntTotal);

        //byte width = 8
        byte myByteValue = -128;
        byte mynewByteValue = (byte)(myByteValue / 2);
        System.out.println("myNewByteValue = " + mynewByteValue);
        //short width = 16
        short myShortValue = 32767;
        short mynewShortValue = (short)(myShortValue / 2);

        //long width = 64
        long myLongValue = -9_223_372_036_854_775_807L;

        System.out.println("################## CHALLENGE ###############");
        byte chByte = 27;
        short chShort = 5000;
        int chInt = 27091986;
        long chLong = 50_000L + 10L * (chByte + chShort + chInt);
        short chShortTotal =  (short)(1000 + 10 * (chByte + chShort + chInt));
        System.out.println("Challenge " + chLong);

        System.out.println("Challenge short" + chShortTotal);
    }
}
