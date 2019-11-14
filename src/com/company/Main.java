package com.company;

public class Main {

    public static void main(String[] args) {
        //inner and outer loop
        for(int i=0; i<3; i++) {
            System.out.println("Outer Loop: " + i);
            for (int j = 0; j < 5; j++) {
                System.out.println("\tInner Loop " + j + ": Hi Everyone!");// this t will tab for me
            }
        }
    }
}
