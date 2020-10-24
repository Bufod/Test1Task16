package com.company;

import java.util.Scanner;

public class Variant1 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr1 = new int[n],
                arr2 = new int[n];
        for(int i = 0; i < n; i++){
            arr1[i] = in.nextInt();
        }

        for(int i = 0, j = 0; i < arr1.length; i++){
            if (arr1[i] != 0) {
                arr2[j] = arr1[i];
                j++;
            }
        }

        for (int el :
                arr2) {
            System.out.print(el + " ");
        }
    }
}