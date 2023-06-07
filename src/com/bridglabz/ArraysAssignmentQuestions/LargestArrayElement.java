package com.bridglabz.ArraysAssignmentQuestions;

import java.util.Scanner;

public class LargestArrayElement {
    public static void largestElement(){

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number:");
        int num=sc.nextInt();
        int arr[]=new int[num];
        System.out.println("Enter the array elements:");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        System.out.print("Array elements are:");
        for(int i=0;i<num;i++){
            System.out.print(" "+arr[i]);
        }
        System.out.println();
int max=arr[0];
for(int i=0;i<arr.length;i++){
    if(arr[i]>max)
        max=arr[i];
}
        System.out.println("Largest element is :"+max);
    }

    public static void main(String[] args) {
        largestElement();
    }
}
