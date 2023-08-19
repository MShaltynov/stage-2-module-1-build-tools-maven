package com.epam.utils;

public class StringUtils {
    public static void main(String[] args) {
        System.out.println(isPositiveNumber(""));
    }
    public static boolean isPositiveNumber(String str) {
        //code!
        if (str == null) {
            return false;
        }
        if (str.startsWith("0")&&str.length()>1) {
            return false;
        }
        try {
            if (Double.parseDouble(str) <= 0) {
                return false;
            }
        } catch (Exception e) {
            return false;
        }
        return true;
    }
}
