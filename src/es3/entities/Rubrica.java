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
        rubrica.remove(name);
    }

    public String ricercaNome(int numTel) {
        Set<String> keys = rubrica.keySet();
        String name = "";
        for (String key : keys) {
            if (rubrica.get(key) == numTel) name = key;
        }
        if (name == "") return "Il numero selezionato non corrisponde a nessun numero";
        else return name;
    }

    public int numTel(String name) {
        return rubrica.get(name);
    }

    public void stampaRubrica() {
        System.out.println("La lista è la seguente:");
        Set<String> keys = rubrica.keySet();
        for (String key : keys) {
            System.out.println(key + ": " + rubrica.get(key));
        }
    }
}
