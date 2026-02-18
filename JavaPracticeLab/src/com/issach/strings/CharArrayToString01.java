package com.issach.strings;

public class CharArrayToString01 {

    public static void main(String[] args) {

        char ch[] = {'h', 'e', 'l', 'l', 'o'};

        String resultStr = "";

        for (int i = 0; i < ch.length; i++) {

            resultStr = resultStr + ch[i];
        }
        System.out.println(resultStr);
    }
}
