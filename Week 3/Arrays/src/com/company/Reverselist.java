package com.company;

public class Reverselist {

    public static void main(String[] args) {
        int [] numbers = { 3, 4, 5, 6, 7};
        int reverse;
        for (int i = 0; i < numbers.length/2; i++) {
            reverse = numbers[i];
            numbers[i] = numbers[numbers.length-i-1];
            numbers[numbers.length-i-1] = reverse;
        }
        for (int i : numbers) {
            System.out.print(i+" ");
        }
    }
}