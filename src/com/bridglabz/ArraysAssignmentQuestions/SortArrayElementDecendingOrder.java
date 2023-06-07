package com.bridglabz.ArraysAssignmentQuestions;

import java.util.Scanner;

public class SortArrayElementDecendingOrder {
    public static void decendingSort(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number:");
        int num=sc.nextInt();
        int arr[]=new int[num];
        System.out.println("Enter the array elements:");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        System.out.print("Original Array:");
        for(int i=0;i<num;i++){
            System.out.print(" "+arr[i]);
        }
        System.out.println();
        System.out.print("Sorted array descending order:");
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]<arr[j]){
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
            System.out.print(" "+arr[i]);
        }
    }
    public static void main(String[] args) {
        decendingSort();
    }
}
