import java.util.Scanner;

public class Esercizio_4 {
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Inserisci un numero intero:");
        int number = input.nextInt();


        System.out.println("Conto alla rovescia:");

        for (int i = number; i >= 0; i--) {
            System.out.println(i);
        }

        input.close();
    }

}
