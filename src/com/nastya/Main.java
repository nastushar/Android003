package com.nastya;

import com.sun.org.apache.bcel.internal.generic.GOTO;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        guessWord();

    }

    private static void guessWord() {
        String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli", "carrot", "cherry", "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive", "pea", "peanut", "pear", "pepper", "pineapple", "pumpkin", "potato"};
        int i = 0;


        Random rand = new Random();
        int a = rand.nextInt(11);
        String compChoice = words[a];
        //System.out.println("Мое слово " + compChoice);
        char[] char1 = compChoice.toCharArray();

        for (; ; ) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Угадай слово:");
            String userInput = sc.nextLine();
            String userAnswer = userInput.toLowerCase() ;
            //System.out.println("Твое слово " + userAnswer);
            char[] char2 = userAnswer.toCharArray();

            if (userAnswer.equals(compChoice)) {
                System.out.println("Ты угадал!!!");
                break;
            } else {
                System.out.println("Почти угадал)");
                for (i = 0; i < char1.length && i < char2.length; i++) {
                    if (char1[i] == char2[i]) {
                        System.out.printf("%c", char1[i]);
                    } else {
                        break;
                    }
                }
                for (int repeat = 1; repeat <= (15 - i); repeat++) {
                    System.out.printf("%c", '#');
                }
                System.out.println(" ");
            }
        }
    }
}


