
import java.util.Scanner;

public class Palindromo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Palíndromo o no palíndromo: ");
        String frase = scanner.nextLine();

        frase = frase.toLowerCase();
        frase = frase.replaceAll("\\s", "");
        char letraInicial;
        char letraFinal;
        int i = 0;

       while (i < frase.length() / 2) {
           letraInicial = frase.charAt(i);
           letraFinal = frase.charAt(frase.length() - i - 1);
           if (letraInicial != letraFinal) {
               System.out.println("No es un palíndromo");
               return;
           }
           i++;
       }

        System.out.println("Es un palíndromo");
    }
}
