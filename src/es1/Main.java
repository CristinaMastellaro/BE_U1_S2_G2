package es1;

import java.util.HashSet;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Inserisci il numero di elementi da inserire nella lista");
        int num = 0;
        boolean reask = true;
        while (reask) {
            try {
                num = Integer.parseInt(s.nextLine());
                if (num >= 20) {
                    throw new Exception("Troppi elementi da compilare, scrivi un numero inferiore o uguale a 20");
                }
                reask = false;
            } catch (Exception e) {
                System.err.println(e.getMessage());
            }
        }
        HashSet<String> arrayS = new HashSet<>();
        HashSet<String> arrayRepeatedString = new HashSet<>();
        HashSet<String> arrayNotRepeatedString = new HashSet<>();
        // Crea il set con tutte le parole e il set di parole duplicate
        for (int i = 0; i < num; i++) {
            System.out.println("\nInserisci il nuovo elemento");
            String newString = s.nextLine();
            // Add ritorna se il valore è stato inserito nel set o meno
            boolean isNotInArray = arrayS.add(newString);
            if (!isNotInArray) arrayRepeatedString.add(newString);
        }
        // Per creare l'array di parole scritte un'unica volta
        for (String string : arrayS) {
            if (!arrayRepeatedString.contains(string)) arrayNotRepeatedString.add(string);
        }

        System.out.println("Parole duplicate: " + arrayRepeatedString);
        System.out.println("Numero di parole distinte: " + arrayNotRepeatedString.size());
        System.out.println("Elenco delle parole distinte: " + arrayNotRepeatedString);
        System.out.println("Elenco di tutte le parole: " + arrayS);
    }
}
