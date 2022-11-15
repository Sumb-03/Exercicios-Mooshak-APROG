import java.util.Scanner;

public class EssentialF {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int numero, numerocopia, algarismo, conversao = 0;

        numero = ler.nextInt();
        numerocopia = numero;

        do {
            algarismo = numero % 10;
            numero = numero / 10;
            conversao = conversao * 10 + algarismo;

        } while (numero != 0);

        if (conversao == numerocopia) {
            System.out.println("palindrome");
        } else {
            System.out.println("not palindrome");
        }
    }
}
