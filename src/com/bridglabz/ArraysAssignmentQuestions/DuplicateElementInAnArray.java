package com.bridglabz.ArraysAssignmentQuestions;

import java.util.Scanner;

public class DuplicateElementInAnArray {
    public static void duplicateElement(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the  number:");
        int num=sc.nextInt();
        int arr[]=new int[num];
        System.out.println("Enter the array elements:");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        System.out.print("Original array :");
        for(int i=0;i<num;i++){
            System.out.print(" "+arr[i]);
        }
        System.out.println();
        System.out.print("Duplicate element are:");
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    System.out.print(" "+arr[j]);
                }
            }
        }
    }
    public static void main(String[] args) {
        duplicateElement();
    }
}
