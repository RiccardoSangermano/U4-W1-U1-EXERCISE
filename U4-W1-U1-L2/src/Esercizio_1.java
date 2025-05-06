import java.util.Scanner;

public class Esercizio_1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Test del metodo stringaPariDispari
        System.out.print("Inserisci una stringa per verificare se ha un numero pari o dispari di caratteri: ");
        String testo = input.nextLine();
        if (stringaPariDispari(testo)) {
            System.out.println("La stringa \"" + testo + "\" ha un numero pari di caratteri.");
        } else {
            System.out.println("La stringa \"" + testo + "\" ha un numero dispari di caratteri.");
        }
        System.out.println();

        // Test del metodo annoBisestile
        System.out.print("Inserisci un anno per verificare se è bisestile: ");
        int anno = input.nextInt();
        if (annoBisestile(anno)) {
            System.out.println("L'anno " + anno + " è bisestile.");
        } else {
            System.out.println("L'anno " + anno + " non è bisestile.");
        }

        input.close();
    }

    public static boolean stringaPariDispari(String str) {
        return str.length() % 2 == 0;
    }

    public static boolean annoBisestile(int anno) {
        if (anno % 4 == 0) {
            if (anno % 100 == 0) {
                return anno % 400 == 0;
            } else {
                return true;
            }
        } else {
            return false;
        }
    }
}
