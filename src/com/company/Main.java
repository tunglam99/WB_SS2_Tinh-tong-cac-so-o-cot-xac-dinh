package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap vao hang");
        int row = scanner.nextInt();
        System.out.println("nhap vao cot");
        int col = scanner.nextInt();
        int[][] arr = new int[row][col];
        for (int i =0; i< row; i++) {
            for (int j=0; j <col; j++) {
                System.out.println("nhap phan tu arr["+i+","+j+"]");
                arr[i][j] = scanner.nextInt();
            }
        }
        System.out.println("nhap vao cot muon tinh tong");
        int index = scanner.nextInt();
        int sum = 0;
        for (int i=0; i<row; i++) {
            sum += arr[i][index];
        }
        System.out.println("tong cot " + index+ " la " +sum);
    }
}
