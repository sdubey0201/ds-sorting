package com.java.example.quicksort;

import java.util.Arrays;

public class QuickSortMainTest {
    public static void main(String[] args) {
        int array [] = {12,3,5,7,4,19,26};
        int low = 0 ;
        int high = array.length-1;
        quickSort(array,low,high);
    }
    public static void quickSort(int array[],int low,int high){
        System.out.println(Arrays.toString(array));
        if (low<high) {
            int position = partition(array, low, high);
            quickSort(array, low, position - 1);
            quickSort(array, position, high);

        }

    }

    public static int partition(int a[],int low, int high){

            int i = low;
            int pivot = a[high];
            for (int j = low;j<high;j++){
                if (a[j]<pivot){
                    int temp = a[i];
                    a[i]= a[j];
                    a[j] = temp;
                    i++;

                }
            }
            int temp = a[i];
            a[i] = a[high];
            a[high] = temp;
            return i;
        }
}
