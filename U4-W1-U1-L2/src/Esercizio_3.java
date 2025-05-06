import java.util.Scanner;

public class Esercizio_3 {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        String inputString;

        while (true) {
            System.out.println("Inserisci una stringa (o ':q' per uscire)");
            inputString = input.nextLine();

            if(inputString.equals(":q")){
                System.out.println("Uscita dal programma.");
                break;
            } else {
                if(inputString.length() > 0) {
                    System.out.println("Caratteri separati dalle virgole:");
                    for (int i = 0; i < inputString.length(); i++) {
                        System.out.print(inputString.charAt(i));
                        if (i < inputString.length() - 1) {
                            System.out.print(",");
                        }
                    }
                    System.out.println();
                } else {
                    System.out.println("Hai inserito una stringa vuota.");
                }
            }
        }
        input.close();
    }
}
