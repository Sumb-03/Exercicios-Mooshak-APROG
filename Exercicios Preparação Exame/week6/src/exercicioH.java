import java.util.Scanner;

public class exercicioH {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int numeroMaxNumeros = 5;
        int counter = 0, numero;
        boolean validacaoPalindrome = false;

        while (counter <= numeroMaxNumeros && !validacaoPalindrome) {
            numero = sc.nextInt();
            validacaoPalindrome = validarSePalindrome(numero);
            counter++;
        }

        if (validacaoPalindrome){
            System.out.println("is palindrome");
        } else {
            System.out.println("attempts exceeded");
        }
    }

    private static boolean validarSePalindrome(int numero) {
        int algarismo, conversao = 0, numerocopia = numero;
        do {
            algarismo = numero % 10;
            numero = numero / 10;
            conversao = conversao * 10 + algarismo;
        } while (numero != 0);
        return numerocopia == conversao;
    }

}
