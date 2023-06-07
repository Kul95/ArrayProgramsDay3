package com.bridglabz.ArraysAssignmentQuestions;

import java.util.Scanner;

public class PrintArrayFromUser {
    public static void printArray(){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number:");
        int num=sc.nextInt();
        int arr[]=new int[num];
        System.out.println("Enter the array elements:");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        System.out.print("Print the array elements: ");
        for(int i=0;i<num;i++){
            System.out.print(" "+arr[i]);
        }
    }
    public static void main(String[] args) {
        printArray();
    }
}
