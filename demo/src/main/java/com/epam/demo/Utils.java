package com.epam.demo;

import java.util.List;

public class Utils {
    public static boolean isAllPositiveNumbers(List<String> args) {
       //magic happens here
        for (String s : args) {
            if (s == null) {
                return false;
            }
            if (s.startsWith("0") && s.length() > 1) {
                return false;
            }
            try {
                if (Double.parseDouble(s) <= 0) {
                    return false;
                }
            } catch (Exception e) {
                return false;
            }
        }
        return true;
    }
}