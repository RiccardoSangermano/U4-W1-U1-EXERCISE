import java.util.Scanner;

public class Geometria {


    public static double perimetroRettangolo(double lato1, double lato2) {
        return 2 * (lato1 + lato2);
    }


    public static int pariDispari(int numero) {
        if (numero % 2 == 0) {
            return 0;
        } else {
            return 1;
        }
    }


    public static double perimetroTriangolo(double a, double b, double c) {
        double semiperimetro = (a + b + c) / 2;
        if (semiperimetro <= a || semiperimetro <= b || semiperimetro <= c) {
            System.out.println("ATTENZIONE: I lati forniti non formano un triangolo valido.");
            return Double.NaN;
        }
        return Math.sqrt(semiperimetro * (semiperimetro - a) * (semiperimetro - b) * (semiperimetro - c));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1
        System.out.println("--- Calcolo del perimetro del rettangolo ---");
        System.out.print("Inserisci la lunghezza del primo lato (decimale): ");
        double latoRettangolo1 = scanner.nextDouble();
        System.out.print("Inserisci la lunghezza del secondo lato (decimale): ");
        double latoRettangolo2 = scanner.nextDouble();
        double perimetroR = perimetroRettangolo(latoRettangolo1, latoRettangolo2);
        System.out.println("Il perimetro del rettangolo è: " + perimetroR);
        System.out.println();


        scanner.nextLine();

        // 2
        System.out.println("--- Verifica se un numero è pari o dispari ---");
        System.out.print("Inserisci un numero intero: ");
        int numeroVerifica = scanner.nextInt();
        int risultatoParita = pariDispari(numeroVerifica);
        if (risultatoParita == 0) {
            System.out.println("Il numero " + numeroVerifica + " è pari.");
        } else {
            System.out.println("Il numero " + numeroVerifica + " è dispari.");
        }
        System.out.println();


        scanner.nextLine();

        // 3
        System.out.println("--- Calcolo dell'area del triangolo (Formula di Erone) ---");
        System.out.print("Inserisci la lunghezza del primo lato (decimale): ");
        double latoTriangolo1 = scanner.nextDouble();
        System.out.print("Inserisci la lunghezza del secondo lato (decimale): ");
        double latoTriangolo2 = scanner.nextDouble();
        System.out.print("Inserisci la lunghezza del terzo lato (decimale): ");
        double latoTriangolo3 = scanner.nextDouble();
        double areaTriangolo = perimetroTriangolo(latoTriangolo1, latoTriangolo2, latoTriangolo3);
        if (!Double.isNaN(areaTriangolo)) {
            System.out.println("L'area del triangolo è: " + areaTriangolo);
        }
        System.out.println();

        scanner.close();
    }
}
