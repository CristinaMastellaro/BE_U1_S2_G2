package es3;

import es3.entities.Rubrica;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Rubrica rubrica = new Rubrica();
        String quit = "";
        myLoop:
        while (true) {
            System.out.println("\nCosa vuoi fare con la tua rubrica?" + "\n 1 - Aggiungere un contatto" + "\n 2 - Cancellare un contatto" + "\n 3 - Cercare il nome di un contatto con il suo numero di telefono" + "\n 4 - Cercare il numero di un contatto" + "\n 5 - Stampare la rubrica");
            int option = 0;
            try {
                quit = s.nextLine();
                if (quit.toLowerCase().equals("quit")) break myLoop;
                option = Integer.parseInt(quit);
                if (option == 0 | option > 6) throw new Exception("Numero selezionato non valido, riseleziona");
            } catch (Exception e) {
                System.err.println(e.getMessage());
                continue;
            }
            switch (option) {
                case 1:
                    while (true) {
                        try {
                            System.out.println("Scrivi il nome del contatto");
                            String name = s.nextLine();
                            System.out.println("Scrivi il numero di telefono");
                            int tel = Integer.parseInt(s.nextLine());
                            rubrica.addContact(name, tel);
                            System.out.println("Contatto aggiunto!");
                            break;
                        } catch (Exception e) {
                            System.err.println(e.getMessage());
                        }
                    }
                    break;
                case 2:
                    System.out.println("Scrivi il nome del contatto da cancellare");
                    String name = s.nextLine();
                    rubrica.deleteContact(name);
                    break;
                case 3:
                    System.out.println("Inserisci il numero di telefono della persona da cercare");
                    while (true) {
                        try {
                            int num = Integer.parseInt(s.nextLine());
                            System.out.println(rubrica.ricercaNome(num));
                            break;
                        } catch (Exception e) {
                            System.err.println(e.getMessage());
                        }
                    }
                    break;
                case 4:
                    System.out.println("Scrivi il nome del contatto di cui si vuole il numero:");
                    String searchName = s.nextLine();
                    rubrica.numTel(searchName);
                    break;
                case 5:
                    rubrica.stampaRubrica();
                    break;
                default:
                    System.out.println("Numero selezionato non valido");
            }
        }

        /*rubrica.addContact("Gino", 333784596);
        rubrica.addContact("Paolo", 211456322);
        rubrica.addContact("Carlo", 6985532);
        rubrica.addContact("Francesco", 31485432);
        rubrica.addContact("Giulia", 9762156);
        rubrica.addContact("Stefania", 121452);
        rubrica.stampaRubrica();*/

    }
}
