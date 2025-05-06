import java.util.Scanner;


public class Exercise_2 {
    public static void main(String[] arg){
        Scanner input =new Scanner(System.in);
        System.out.println("Inserisci un numero intero: ");
        int numero = input.nextInt();

        String numeroInLettere;

        switch (numero) {
            case 0:
                numeroInLettere="Zero";
                break;
            case 1:
                numeroInLettere = "Uno";
                break;
                case 2:
                    numeroInLettere = "Due";
                    break;
            case 3:
                numeroInLettere = "Tre";
                break;
            default:
                numeroInLettere ="Mi dispiace! Ma il numero deve essere compreso fra 0 e 3";

        }
        System.out.println(numeroInLettere);
        input.close();
    }
}
