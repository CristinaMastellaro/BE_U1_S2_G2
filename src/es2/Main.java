package es2;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Scrivi il numero di elementi all'interno della lista");
        boolean reask = true;
        int n = 0;
        while (reask) {
            try {
                n = Integer.parseInt(s.nextLine());
                if (n >= 20) {
                    throw new Exception("Troppi elementi da compilare, scrivi un numero inferiore o uguale a 20");
                }
                reask = false;
            } catch (Exception e) {
                System.err.println(e.getMessage());
            }
        }

        ArrayList<Integer> newList = createList(n);
        System.out.println("La lista è " + newList);
        newList = invertedList(newList);
        System.out.println("La lista con anche l'ordine invertito è " + newList);

        System.out.println("I valori in posizione pari sono: " + evenOrOdd(newList, true));
        System.out.println("I valori in posizione dispari sono: " + evenOrOdd(newList, false));
    }

    public static ArrayList<Integer> createList(int num) {
        Random r = new Random();
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < num; i++) {
            list.add(r.nextInt(0, 100));
        }
        return list;
    }

    public static ArrayList<Integer> invertedList(ArrayList<Integer> list) {
        for (int i = list.size() - 1; i >= 0; i--) {
            list.addLast(list.get(i));
        }
        return list;
    }

    public static ArrayList<Integer> evenOrOdd(ArrayList<Integer> list, boolean even) {
        ArrayList<Integer> newListEven = new ArrayList<>();
        ArrayList<Integer> newListOdd = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            if (i % 2 == 1) newListEven.add(list.get(i));
            else newListOdd.add(list.get(i));
        }
        if (even) return newListEven;
        else return newListOdd;
    }
}
