package com.testcore;

public class LeftShiftString {
    // Function to left-shift a string by n positions
    public static String leftShiftString(String str, int n) {
        // Calculate the effective shift to handle cases where n > str.length()
        int shift = n % str.length();
        // Left-shift by concatenating the substring from the shift index to the end with the substring from the start to the shift index
        return str.substring(shift) + str.substring(0, shift);
    }

    public static String rightShiftString(String str, int n) {
        // Calculate the effective shift to handle cases where n > str.length()
        int shift = str.length() - (n % str.length());
        // Left-shift by concatenating the substring from the shift index to the end with the substring from the start to the shift index
        return str.substring(shift) + str.substring(0, shift);
    }

    public static void main(String[] args) {
        String originalString = "abcdef";
        int shiftBy = 2;

        String leftShiftedString = leftShiftString(originalString, shiftBy);
        String rightShiftedString = rightShiftString(originalString, shiftBy);
        System.out.println("Original String: " + originalString);
        System.out.println("Shifted String: " + leftShiftedString);
        System.out.println("Shifted String: " + rightShiftedString);
    }
}