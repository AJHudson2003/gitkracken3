package com.company;

public class Main {
    public static void rollASix() {
        int rollDice = 0;

        while (rollDice != 6) {
            rollDice = (int) (Math.random() * 6 + 1);
            System.out.println("You rolled: " + rollDice);

            if (rollDice == 3) {
                break;
            }
        }
        if (rollDice == 6) {
            System.out.println("You Win!!!");
        } else {
            System.out.println("You Lose");
        }
    }

    public static void main(String[] args) {
        //inner and outer loop
        for(int i=0; i<3; i++) {
            System.out.println("Outer Loop: " + i);
            for (int j = 0; j < 5; j++) {
                System.out.println("\tInner Loop " + j + ": Hi Everyone!");// this t will tab for me
            }
        }
        rollASix();
    }
}
