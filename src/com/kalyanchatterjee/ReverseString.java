package com.kalyanchatterjee;

public class ReverseString {
    public void reverse(String str) {

        if (str.length() == 1) {
            System.out.println(str);
            return;
        }

        StringBuilder sb = new StringBuilder(str);

        int pointer1 = 0;
        int pointer2 = sb.length() - 1;

        String s;

        while (pointer1 != pointer2) {
            s = sb.substring(pointer1, pointer1 + 1);
            sb.replace(pointer1, pointer1 + 1, sb.substring(pointer2, pointer2 + 1));
            sb.replace(pointer2, pointer2 + 1, s);

            pointer1++;
            if (pointer1 != pointer2) {
                pointer2--;
            }
        }

        System.out.println(sb.toString());
    }
}
