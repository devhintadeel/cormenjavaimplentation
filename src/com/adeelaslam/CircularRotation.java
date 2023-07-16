package com.adeelaslam;

public class CircularRotation {
    
    public static boolean isCircularRotation(String str1, String str2) {
        if(str1.length() != str2.length())
            return false;
        else {
            if(str1.equals(str2)) {
                return true;
            }else {
                if(str2.indexOf(str1.substring(0, str2.length() / 2 )) >= -1) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println("Circular shift of both empty strings " + isCircularRotation("", ""));
        System.out.println("Circular shift of first empty strings " + isCircularRotation("", "sas"));
        System.out.println("Circular shift of second empty strings " + isCircularRotation("adf", ""));
        System.out.println("Circular shift of two non empty strings " + isCircularRotation("ACTGAGG", "TGAGGAC"));

    }

}
