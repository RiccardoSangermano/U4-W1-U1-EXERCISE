public class Main {
    public static int moltiplicazione(int a, int b) {
        int prodotto = a * b;
        return prodotto;
    }
    public static String concatenaNumeroMessaggio(int numero, String testo) {
        return "Numero: " + numero + " Messaggio: " + testo;
    }



    public static void main(String[] args) {
       int  numero1 = 8;
       int numero2 = 4;
       int risultato = moltiplicazione(numero1, numero2);
        System.out.println("Il prodotto di " + numero1 + " e " + numero2 + " è: " + risultato);

    int numero = 77;
    String testo = "Che bel numero";
    String numeroTesto = concatenaNumeroMessaggio(numero, testo);
    System.out.println(numeroTesto);
    }



    }

