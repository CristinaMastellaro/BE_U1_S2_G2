package es3;

import es3.entities.Rubrica;

public class Main {
    public static void main(String[] args) {
        Rubrica rubrica = new Rubrica();

        rubrica.addContact("Gino", 333784596);
        rubrica.addContact("Paolo", 211456322);
        rubrica.addContact("Carlo", 6985532);
        rubrica.addContact("Francesco", 31485432);
        rubrica.addContact("Giulia", 9762156);
        rubrica.addContact("Stefania", 121452);
        rubrica.stampaRubrica();

        rubrica.deleteContact("Carlo");
        rubrica.stampaRubrica();

        System.out.println("\nIl numero di Stefania è " + rubrica.numTel("Stefania"));
        System.out.println("\nIl nome corrisponde al numero 31485432 è " + rubrica.ricercaNome(31485432));
    }
}
