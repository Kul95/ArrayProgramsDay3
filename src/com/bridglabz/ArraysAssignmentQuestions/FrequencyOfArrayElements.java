package com.bridglabz.ArraysAssignmentQuestions;

import javax.security.sasl.SaslClient;
import java.util.Scanner;

public class FrequencyOfArrayElements {
    public static void friquencyOfArrayElements(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num=sc.nextInt();
        int arr[]=new int [num];
        System.out.println("Enter the array elements:");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        System.out.print("Original array:");
        for(int i=0;i<num;i++){
            System.out.print(" "+arr[i]);
        }
        System.out.println();
        for(int i=0;i<arr.length;i++){
            int x=arr[i];
            int count=0;
            if(x==-1)continue;
            for(int j=0;j<arr.length;j++){
                if(arr[j]==x){
                    ++count;
                    arr[j]=-1;
                }
            }
            System.out.println("Frequency of :"+x+" is "+count);
        }
    }
    public static void main(String[] args) {
        friquencyOfArrayElements();
    }
}
