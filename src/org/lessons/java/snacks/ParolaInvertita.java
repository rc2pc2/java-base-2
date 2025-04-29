package org.lessons.java.snacks;

import java.util.Scanner;

public class ParolaInvertita {

    public static void main(String[] args) {

        // % Chiediamo all'utente la nostra stringa
        // & prendiamo uno scanner
        // * salviamo la prossima riga in una stringa
        System.out.println("Inserisci una parola");
        Scanner scanner = new Scanner(System.in);

        String parolaOriginale = scanner.nextLine();
        
        String parolaGirata = "";

        // ! per ogni lettera a partire dall'ultima
        for (int i = parolaOriginale.length() - 1; i >= 0; i--) {
            parolaGirata += parolaOriginale.charAt(i);
        }

        // for (int i = 0; i < parolaOriginale.length(); i++) {
        //     parolaGirata = parolaOriginale.charAt(i) + parolaGirata; 
        // }

        System.out.println(parolaGirata);
        // @ compongo una stringa e la ritorno
        scanner.close();
    }
}
