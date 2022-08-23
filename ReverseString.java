package com.java.example;

import java.util.Arrays;

public class ReverseString {
    public static void main(String[] args) {
        String str = "Geeks";
        System.out.println(str);
        System.out.println(reverseWord(str));

    }

    public static String reverseWord(String str){

        char array [] = str.toCharArray();
        int l = 0;
        int r = array.length-1;
        StringBuilder sb = new StringBuilder();
        while (r>=l){
           sb.append(array[r]);
            r--;
        }
        return sb.toString();
    }
}
