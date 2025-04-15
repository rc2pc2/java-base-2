package org.lessons.java;

import java.util.Scanner;

public class EsempioEquals {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String stringaUno = "ciao";
        String stringaDue = scanner.nextLine(); // "ciao"
        scanner.close();
        System.out.println(stringaUno == stringaDue);
        System.out.println(stringaUno.equals(stringaDue));
    }
}
