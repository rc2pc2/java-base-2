package org.lessons.java.snacks;

public class ArrayPush {
    public static void main(String[] args) {
        int[] numbers = { 10, 55, 122, 312, 231, 6, 12, 23, 52 };

        // # creo un nuovo array più lungo di uno
        int[] newNumbers = new int[numbers.length + 1];

        // $ qualsiasi metodo per poter copiare un array in un
        for (int i = 0; i < numbers.length; i++) {
            newNumbers[i] = numbers[i];
        }
        
        // newNumbers[newNumbers.length - 1] = 777;
        
        for (int i = 0; i < newNumbers.length; i++) {
            System.out.println(newNumbers[i]);
        }
        
    }
}
