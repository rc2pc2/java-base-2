package org.lessons.java;

import java.util.Random;
import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        
        // % voglio generare un array composto da 15 numeri interi randomici
        Random generator = new Random();
        Scanner scanner = new Scanner(System.in);
        
        int[] interi = new int[15]; // [ spazio contiguo di memoria associato a 15 interi
        
        // @ chiedo all'utente di cercare un numero
        for (int i = 0; i < interi.length ; i++){
            interi[i] = generator.nextInt(10);
            // System.out.println(interi[i]);
        }

        int numeroDaCercare = 1;
        // // & restituisco se e' presente o meno nel nostro array di interi

        // // @ variabile booleana a false ==> boolean isFound = false;
        // boolean trovato = false;
    
        // // # per ogni elemento nell-array "elemento"
        // for (int i = 0; i < interi.length; i++) {
        //     int elementoCorrente = interi[i];
        //     System.out.println(elementoCorrente);

        //     // % se "elemento" == numeroDaCercare ==> 
        //     if (elementoCorrente == numeroDaCercare){
        //         trovato = true; // . allora l-ho trovato;
        //         break;
        //     } 
        // }

        int index = 0;
        boolean trovato = false;
        while (trovato == false && index < interi.length){
            if (interi[index] == numeroDaCercare){
                trovato = true; 
            } 
            System.out.println(interi[index]);
            index++;
        }
                
        System.out.println("L'elemento e' presente oppure no? ");
        System.out.println(trovato);



        scanner.close();
    }
}
