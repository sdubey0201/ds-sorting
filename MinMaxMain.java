package com.java.example.array.minmax;

public class MinMaxMain {
    public static void main(String[] args) {
       int [] values = {1, 3, 4, 1};
       printMinMax(values);
       System.out.println(findMinMaxSum(values,values.length));
    }

    public static void printMinMax(int [] values){

        int min  =values[0];
        int max = values[0];
        for (int i =1;i<values.length;i++){
           if (values[i]<min){
               min = values[i];
           }if (values[i]>max){
               max = values[i];
            }
        }
        System.out.println("min : "+min);
        System.out.println("Max : "+max);
    }

    public static int findMinMaxSum(int A[],int N){

        int min  =A[0];
        int max = A[0];
        for (int i =1;i<N;i++){
            if (A[i]<min){
                min = A[i];
            }if (A[i]>max){
                max = A[i];
            }
        }

        return min+max;

    }
}
