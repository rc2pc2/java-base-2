package org.lessons.java;

public class Array {
    public static void main(String[] args) {
        
        // % voglio un array di interi
        int[] interi = { 33, 11, 22, 44, 66 };
        // System.out.println(interi[3]);

        interi[3] = 431;

        // System.out.println(interi[3]); // { 33, 11, 22, 431, 66 };

        for ( int i = 0; i < interi.length ; i++ ){ 
            System.out.println("All'indice " + i +" si trova l'elemento: " + interi[i]);
        }

        int[] interiSenzaPopolarli = new int[10];
        // System.out.println(interiSenzaPopolarli);

        for ( int i = 0; i < interiSenzaPopolarli.length ; i++ ){ 
            System.out.println("All'indice " + i +" si trova l'elemento: " + interiSenzaPopolarli[i]);
        }

    }
}
