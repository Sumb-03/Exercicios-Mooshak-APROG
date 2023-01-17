import java.util.Scanner;

public class exercicioY {
    public static void main(String[] args) {
        int numero1, numero2;
        numero1 = readPositiveValue();
        numero2 = readPositiveValue();
        showTablesInRange(numero1, numero2);
    }

    private static void showTableOfNumber(int numero) {
        System.out.println("Multiplication Table of " + numero);
        for (int i = 1; i <= 10; i++) {
            System.out.printf("%d x %d = %d%n", numero, i, numero * i);
        }
    }

    private static void showTablesInRange(int numero1, int numero2) {
        int rangeMaior, rangeMenor;
        if (numero1 > numero2) {
            rangeMaior = numero1;
            rangeMenor = numero2;
        } else {
            rangeMaior = numero2;
            rangeMenor = numero1;
        }

        for (int i = rangeMenor; i <= rangeMaior; i++) {
            showTableOfNumber(i);
        }
    }

    private static int readPositiveValue() {
        Scanner sc = new Scanner(System.in);
        int numero;
        do {
            System.out.println("Introduza um número inteiro positivo:");
            numero = sc.nextInt();
        } while (numero <= 0);
        return numero;
    }
}
