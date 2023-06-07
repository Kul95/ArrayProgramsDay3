package com.bridglabz.ArraysAssignmentQuestions;

import java.util.Scanner;

public class SmallestElementInAnArray {
    public static void minElement(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num=sc.nextInt();
        int arr[]=new int[num];
        System.out.println("Enter the array element:");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        System.out.print("Print the array elements:");
        for(int i=0;i<num;i++){
            System.out.print(" "+arr[i]);
        }
        System.out.println();
        int min=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]<min)
                min=arr[i];
        }
        System.out.print("Smallest element are:"+min);
    }
    public static void main(String[] args) {
        minElement();
    }
}
