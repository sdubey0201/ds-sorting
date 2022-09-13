package com.example.array.mergesortarray;

import java.util.Arrays;

public class MergeSortArrayTestMain {
    public static void main(String[] args) {
//        int [] array1 = {2,5,7};
//        int [] array2 = {3,11};
//        int [] array1 = {2, 5, 9};
//        int [] array2 = {12, 19, 23};
        int [] array1 = {3, 9, 10, 18, 23};
        int [] array2 = {5, 12, 15, 20, 21, 25};
//        int [] array1 = {2, 20};
//        int [] array2 = {5, 9, 14, 16, 19};
        System.out.println(Arrays.toString(getMergeArray(array1,array2)));

    }

    public static int[] getMergeArray(int [] array1,int [] array2){

        if (array1 == null || array1.length<1){
            return array2;
        }else if (array2 ==null || array2.length<1){
            return array1;
        }else {
            int [] newArray =null;
            if (array1!=null && array1.length>0 && array2!=null && array2.length>0){
               newArray = new int[array1.length+array2.length];
               int l1 = array1.length-1;
               int l2 = array2.length-1;
               int i =0;
               int j = 0;
               int k = 0;
               while (i<=l1&&j<=l2){
                   if (array1[i]<array2[j]) {
                       newArray[k]=array1[i];
                       k++;
                       i++;
                       }else {
                       //if (j<l2){
                           newArray[k]=array2[j];
                           k++;
                           j++;
                       //}

                   }
                   }
               if (i<=l1){
                   while (i<=l1){
                       newArray[k]=array1[i];
                       k++;
                       i++;
                   }
               }else {
                   while (j<=l2){
                       newArray[k] = array2[j];
                       k++;
                       j++;
                   }
               }

               }
            return newArray;
            }

        }




}
