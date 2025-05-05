import java.util.Scanner;

public class ConcatenazioneStringhe {
    public static void main(String[] arg){
        int a = 50;
        int b = 30;
        int result = multiply(a, b);
        System.out.println(result);

        System.out.println(concat("bla", 6));
    }
    public static int multiply(int a, int b){
        return a*b;
    }

    public static String concat(String str, int num){
        return str + num;
    }
}
