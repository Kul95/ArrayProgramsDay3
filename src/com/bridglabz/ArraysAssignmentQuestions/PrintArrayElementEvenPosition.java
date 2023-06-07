package com.bridglabz.ArraysAssignmentQuestions;

import java.util.Scanner;

public class PrintArrayElementEvenPosition {
    public static void evenElement(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number:");
        int num=sc.nextInt();
        int arr[]=new int[num];
        System.out.println("Enter the array elements:");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        System.out.print("Print Original array:");
        for(int i=0;i<num;i++){
            System.out.print(" "+arr[i]);
        }
        System.out.println();
        System.out.print("Even array elements are: ");
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2==0){
                System.out.print(" "+arr[i]);
            }
        }
    }
    public static void main(String[] args) {
        evenElement();
    }
}
