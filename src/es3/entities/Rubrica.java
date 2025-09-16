package es3.entities;

import java.util.HashMap;
import java.util.Set;

public class Rubrica {
    private HashMap<String, Integer> rubrica = new HashMap<>();

    /*public Rubrica(String name, int numTel) {
        this.rubrica.put(name, numTel);
    }*/

    public void addContact(String name, int telNum) {
        rubrica.put(name, telNum);
    }

    public void deleteContact(String name) {
        try {
            if (rubrica.get(name) == null) throw new Exception("Nope");
            else rubrica.remove(name);
            System.out.println("Numero cancellato!");
        } catch (Exception e) {
            System.out.println("Numero non trovato");
        }
    }

    public String ricercaNome(int numTel) {
        try {
            Set<String> keys = rubrica.keySet();
            String name = "";
            for (String key : keys) {
                if (rubrica.get(key) == numTel) name = key;
            }
            if (name == "") throw new Exception("Nope");
            return "Il nome cercato è " + name;
        } catch (Exception e) {
            return "Il numero selezionato non corrisponde a nessun numero";
        }
    }

    public void numTel(String name) {
        try {
            int numTel = 0;
            if (rubrica.get(name) == null) throw new Exception("Nope");
            else numTel = rubrica.get(name);
            System.out.println("Il numero è " + numTel);
        } catch (Exception e) {
            System.out.println("Il nome non corrisponde a nessun numero telefonico");
        }
    }

    public void stampaRubrica() {
        System.out.println("La lista è la seguente:");
        Set<String> keys = rubrica.keySet();
        for (String key : keys) {
            System.out.println(key + ": " + rubrica.get(key));
        }
    }
}
