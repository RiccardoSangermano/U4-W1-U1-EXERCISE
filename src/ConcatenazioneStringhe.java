import java.util.Scanner;

public class ConcatenazioneStringhe {
    public static void concatenaEInverti() {
        Scanner scanner = new Scanner(System.in);
        String[] stringhe = new String[3];


        for (int i = 0; i < 3; i++) {
            System.out.print("Inserisci la stringa numero " + (i + 1) + ": ");
            stringhe[i] = scanner.nextLine();
        }


        String concatenataOrdine = "";
        for (String str : stringhe) {
            concatenataOrdine += str;
        }
        System.out.println("\nConcatenazione in ordine di scrittura: " + concatenataOrdine);


        String concatenataInversa = "";
        for (int i = stringhe.length - 1; i >= 0; i--) {
            concatenataInversa += stringhe[i];
        }
        System.out.println("Concatenazione in ordine inverso: " + concatenataInversa);

        scanner.close();
    }

    public static void main(String[] args) {
        concatenaEInverti();
    }
}
