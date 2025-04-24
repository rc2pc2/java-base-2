package com.ferragnez.party;

import java.util.Scanner;

public class CheckGuest {
    public static void main(String[] args) {

        // // @ creiamo un nuovo array di stringhe, con all-interno i nostri invitati come stringhe
        // String[] guests = { "Dua Lipa", "Paris Hilton", "Manuel Agnelli", "J-Ax", "Francesco Totti", "Ilary Blasi", "Bebe Vio", "Luis", "Pardis Zarei", "Martina Maccherone", "Rachel Zeilic" };

        // // * definiamo ed assegniamo ad una variabile il nostro Scanner
        // Scanner scanner = new Scanner(System.in);

        // System.out.println("Please type your name");
        // // # utilizziamo il nostro scanner per inserire in una stringa il nome che l'utente ha inserito
        // String guestName = scanner.nextLine();

        // // @ definisco e inizializzo a false una variabile di tipo booleano che verifichi la presenza del nostro nome
        // boolean isGuestInvited = false;

        // // $ per ogni elemento disponibile nella lista, 
        //     // @ verifico se sia uguale a quello inserito dall'utente
        //         // * qualora dovesse esserlo allora esco dal ciclo e assegno a TRUE il valore della variabile che ne verfichi la presenza
        // for (int i = 0; i < guests.length; i++) {
        //     System.out.println("Sto analizzando l'elemento all'indice " + i + ", con valore: " + guests[i]);
        //     if (guestName.equals(guests[i])){
        //         isGuestInvited = true;
        //         break;
        //     }
        // }

        // // ! finche' non ho trovato l'invitato (il valore della variabile di riga 12 sia FALSE) e non ho finito di scorrere la lista di nomi, continua a
        //     // @ verificare se il nome attuale sia uguale a quello inserito
        //         // * qualora dovesse esserlo allora esco dal ciclo e assegno a TRUE il valore della variabile che ne verfichi la presenza
        // int index = 0;
        // while ( !isGuestInvited && index < guests.length){
        //     if (guestName.trim().equalsIgnoreCase(guests[index])){
        //         isGuestInvited = true;
        //     }

        //     index++; // ! index = index + 1;
        // }


        // // ( in base al valore della variabile booleana comunico all'utente se possa partecipare o meno alla nostra festa
        // // if (isGuestInvited == false){
        // //     System.out.println("I'm sorry, you're not invited!");
        // // } else {
        // //     System.out.println("Welcome to the party " + guestName + " !");
        // // }

        // if (isGuestInvited){ 
        //     System.out.println("Welcome to the party " + guestName + " !");
        // } else {
        //     System.out.println("I'm sorry, you're not invited!");
        // }
        
        // scanner.close();

        String[] guests = { "Dua Lipa", "Paris Hilton", "Manuel Agnelli", "J-Ax", "Francesco Totti", "Ilary Blasi", "Bebe Vio", "Luis", "Pardis Zarei", "Martina Maccherone", "Rachel Zeilic" };

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please type your name:");
        String guestName = scanner.nextLine();
        scanner.close();

        boolean isGuestInvited = false;
        int index = 0;
        while ( !isGuestInvited && index < guests.length){
            if (guestName.trim().equalsIgnoreCase(guests[index])){
                isGuestInvited = true;
            }
            index++; 
        }

        if (isGuestInvited){ 
            System.out.println("Welcome to the party " + guestName + " !");
        } else {
            System.out.println("I'm sorry, you're not invited!");
        }
        
    }
}