package com.example.array.stockspan;

import java.util.Arrays;

public class StockSpanMainTest {
    public static void main(String[] args) {
//        int [] array = {100,60,70,65,80,85};
        int [] array = {31, 27, 14, 21, 30, 22};
        System.out.println(Arrays.toString(getStockSpan(array)));
    }

    public static int [] getStockSpan(int [] array){
        int [] spanArray = new int[array.length];
        spanArray[0] = 1;
        for (int i = 1; i<array.length;i++){
            spanArray[i] = 1;
            int j = i-1;
            while (j>=0 && array[j]<=array[i]){
                int sp = spanArray[i];
                spanArray[i] = ++sp;
                j--;
            }
        }
        return spanArray;
    }
}
