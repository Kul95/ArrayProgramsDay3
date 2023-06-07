package com.bridglabz.ArraysAssignmentQuestions;

import java.util.Scanner;

public class ReverseArrayPrint {
    public static void reverseArray(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num=sc.nextInt();
        int arr[]=new int [num];
        System.out.println(" Enter the number of elements:");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        System.out.print("Original array are:");
        for(int i=0;i<num;i++){
            System.out.print(" "+arr[i]);
        }
        System.out.println();
        System.out.print("Reverse array is: ");
        for(int i=arr.length-1;i>=0;i--){
            System.out.print(" "+arr[i]);
        }
    }
    public static void main(String[] args) {
        reverseArray();
    }
}
