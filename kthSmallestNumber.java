package com.java.example.kthsmallestnumber;

import java.util.Arrays;

public class kthSmallestNumber {
    public static void main(String[] args) {
      int array[] = { 7, 10, 4, 3, 20, 15};
      int k = 3;
      int low=0;
      int high = array.length-1;
      //Output: 7
//        k = 4
//        Output: 10
        ;
        System.out.println(getKthSmallestNumber(array,low,high,k));
        System.out.println(Arrays.toString(array));
        //System.out.println("kth smallest number : "+value);
    }
    public static int getKthSmallestNumber(int array[],int l, int r, int k){

                int positions = getPosition(array,l,r);
                if (positions == k-1){
                    return array[positions];
                }else if (positions>k-1){
                    return getKthSmallestNumber(array,l,positions-1,k);
                 }else {
                    return getKthSmallestNumber(array,positions+1,r,k);
                }

    }
    // quick sort partition
    public static int getPosition(int array[],int low, int high) {
        System.out.println("position called ");
         int position = low;
         int pivot = array[high];
         for (int j = low;j<high;j++){
             if (array[j]<pivot){
                 int temp = array[position];
                 array[position] = array[j];
                 array[j] = temp;
                 position++;
             }
         }
         int temp = array[position];
         array[position] = array[high];
         array[high] = temp;
        System.out.println("position "+position);
         return position;
    }
}
