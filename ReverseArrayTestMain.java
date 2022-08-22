package com.java.example.reversearray;

import java.util.Arrays;

public class ReverseArrayTestMain {
    public static void main(String[] args) {

        int values[] = {9,8,7,4,2,1};
        System.out.println(Arrays.toString(values));
        System.out.println(Arrays.toString(reverseArray(values)));

    }


    public static int [] reverseArray(int [] values){
        if (values!=null && values.length>0){
            int l =0;
            int r = values.length-1;
            while (l<r){
                int temp = values[l];
                values[l] =values[r];
                values[r]= temp;
                l++;
                r--;

            }
        }
        return values;
    }
}
