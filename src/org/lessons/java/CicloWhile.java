package org.lessons.java;

public class CicloWhile {
    
    public static void main(String[] args) {
        
        // % Ciclo che va da 0 a un numero che scelgo
        // % Ciclo che va da un numero che scelgo ad un altro
        // % Ciclo in cui voglio avere un certo numero di iterazioni che conosco in anticipo

        // # Ciclo in cui non so quante volte dovro' iterare
        // # Finche' ho elementi, continua a fare ...
        // # Finche' non piove, continua dire che non serve ritirare i panni...
        // # Finche' non finisce la partita, non accendere il microonde

        int[] interi = { 33, 11, 22, 44, 66 };


        // ! fino a quando (espressione) allora esegui il blocco di codice

        int i = 0;
        while ( i < interi.length ){
            System.out.println(interi[i]);
            // % condizione di uscita
            i++;
        }

        i = 0;
        do {
            System.out.println("ciao");
            i++;
        } while ( false );

    }
}
