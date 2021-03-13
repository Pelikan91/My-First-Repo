package com.company;

public class Matrix {

    public static void main(String[] args) {
        int[][] twoDimensionArray = new int[4][4];

        for (int row = 0; row < 4; row++) {
            for (int column = 0; column < 4; column++) {
                if (row==column) {
                    twoDimensionArray[row][column] = 1;
                } else {
                    twoDimensionArray[row][column] = 0;
                }
                System.out.print(twoDimensionArray[row][column]+ " ");
            }
            System.out.println();
        }
    }
}