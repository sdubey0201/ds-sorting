package com.example.array.mergesortarray;

import java.util.Arrays;

public class MergeSortArrayTestMain {
    public static void main(String[] args) {
//        int [] array1 = {2,5,7};
//        int [] array2 = {3,11};
//        int [] array1 = {2, 5, 9};
//        int [] array2 = {12, 19, 23};
//        int [] array1 = {3, 9, 10, 18, 23};
//        int [] array2 = {5, 12, 15, 20, 21, 25};
        int [] array1 = {2, 20};
        int [] array2 = {5, 9, 14, 16, 19};
//        int [] array1 = {1, 5};
//        int [] array2 = {4, 6, 7};
//        int [] array1 = {1, 3, 5, 7};
//        int [] array2 = {2, 4, 6, 8};
        System.out.println(Arrays.toString(getMergeArray1(array1,array2)));

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
        public static int [] getMergeArray1(int [] array1,int [] array2){
         int newArray [] = new int[array1.length+array2.length];
         for (int i =0;i<array1.length;i++)
             newArray[i] =array1[i];
         int l1 = array1.length;
         for (int i = 0;i<array2.length;i++){
             int temp = array2[i];
            int  j = l1-1;
            for (;j>=0;j--){
                if (newArray[j]>temp){
                    newArray[j+1] = newArray[j];
                }else {
                    break;
                }
            }
            newArray[j+1] = temp;
            l1++;
         }
         return newArray;
        }




}
