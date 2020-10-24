package com.company;

import java.util.Scanner;

public class Variant3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = in.nextInt();
        }

        for (int i = 0; i < n; i++){
            for (int j = i; j < n-1; j++){
                if (arr[j] == 0){
                    arr[i] = arr[i+1];
                    arr[i+1] = 0;
                }
            }
        }

        for (int el :
                arr) {
            System.out.print(el + " ");
        }
    }
}
