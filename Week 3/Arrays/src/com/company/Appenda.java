package com.company;

public class Appenda {

    public static void main(String[] args) {
        String [] animals = {"koal", "pand", "zebr", "anacond", "bo", "chinchill", "cobr", "gorill", "hyen", "hydr", "iguan", "impal", "pum", "tarantul", "pirahn" };
        for (int i = 0; i < animals.length; i++) {
            animals[i] = animals[i] + "a";
        }
        for (String newWords : animals) {
            System.out.print(newWords + " ");
        }
    }
}