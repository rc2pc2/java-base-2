package org.lessons.java;

import java.util.Scanner;

public class LongestWord {
    public static void main(String[] args) {

        // #  due variabili
        // ^ firstWord
        // % secondWord
        // se la prima parola è più lunga della seconda, allora
            // scriviamo che la prima parola è la più lunga
        // altrimenti scriviamo che la seconda e' la piu' lunga

        Scanner scanner = new Scanner(System.in);

        System.out.println("Type the first word:");
        String firstWord = scanner.nextLine();
        
        System.out.println("Type the second word:");
        String secondWord = scanner.nextLine();

        scanner.close();

        if ( firstWord.length() > secondWord.length() ){
            System.out.println("First word is the longest");
        } else if ( firstWord.length() < secondWord.length()) {
            System.out.println("Second word is the longest");
        } else { // % in tutti gli altri casi
            System.out.println("The given words share the same length");
        }

    }
    
}
