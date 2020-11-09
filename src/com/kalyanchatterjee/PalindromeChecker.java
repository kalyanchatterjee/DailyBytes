package com.kalyanchatterjee;

public class PalindromeChecker {
    public void check(String str) {

        String cleanStr = str.replaceAll("[^a-zA-z]", "");

        int pointer1 = 0;
        int pointer2 = cleanStr.length() - 1;

        while (pointer1 < cleanStr.length()) {
            if (cleanStr.charAt(pointer2) == cleanStr.charAt(pointer1)) {
                pointer1++;
                pointer2--;
            } else {
                System.out.println(str + " is not a palindrome.");
                return;
            }
        }
        System.out.println(str + " is a palindrome.");
    }
}
