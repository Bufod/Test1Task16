package com.company;

import java.util.Scanner;

public class Variant2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for (int i = 0, j = 0; i < n; i++) {
            int tmp = in.nextInt();
            if (tmp != 0) {
                arr[j++] = tmp;
            }
        }

        for (int el :
                arr) {
            System.out.print(el + " ");
        }
    }
}
