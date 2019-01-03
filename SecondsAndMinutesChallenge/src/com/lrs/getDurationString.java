package com.lrs;

public class getDurationString {

    private static final String INVALID_VALUE_MESSAGE = "Invalid value";

    public static void main(String[] args) {

        System.out.println(getDurationString(670, 20));
        System.out.println(getDurationString(20000));
    }

    public static String format(int val) {
        String strVal = "" + val;
        if (val < 10) {
            strVal = "0" + val;
        }
        return strVal;
    }

    public static String getDurationString(int minutes, int seconds) {

        String strHours, strMinutes, strSeconds;
        if (minutes < 0 || seconds < 0 || seconds > 59) {
            return INVALID_VALUE_MESSAGE;
        } else {
            int hours = minutes / 60;
            minutes = minutes % 60;

                return format(hours) + "h" + format(minutes) + "m" + format(seconds) + "s";
            }
        }

        public static String getDurationString(int seconds) {

            if (seconds < 0) {
                return INVALID_VALUE_MESSAGE;
            } else {
                int minutes = seconds / 60;
                seconds = seconds % 60;
                return getDurationString(minutes, seconds);
            }
        }
    }


