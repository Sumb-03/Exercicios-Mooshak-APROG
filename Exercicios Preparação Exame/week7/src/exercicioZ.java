import java.util.Scanner;

public class exercicioZ {
    public static void main(String[] args) {
        int numero1, numero2;
        numero1 = readIntegerValue();
        numero2 = readIntegerValue();
        validarTruePrimeinRange(showRange(numero1, numero2));
    }

    private static void validarTruePrimeinRange(int[] ranges) {
        int countTruePrime = 0;
        for (int i = ranges[1]; i <= ranges[0]; i++) {
            if (validarTruePrime(i)) {
                System.out.println(i);
                countTruePrime++;
            }
        }
        System.out.printf("(%d)%n", countTruePrime);
    }

    private static boolean validarTruePrime(int numero) {
        int counter = 0, algarismo;
        int numeroAlgarismos = Integer.toString(numero).length();

        do {
            algarismo = numero % 10;
            numero = numero / 10;
            numero = algarismo * (int) Math.pow(10, numeroAlgarismos-1) + numero;
            if (!validarPrime(numero)) {
                return false;
            }
            counter++;
        } while (counter < numeroAlgarismos);
        return true;
    }

    private static boolean validarPrime(int numero) {
        if (numero == 0) {
            return false;
        }
        for (int i = 2; i <= numero / 2; i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    }

    private static int[] showRange(int numero1, int numero2) {
        int[] ranges = new int[2];
        if (numero1 > numero2) {
            ranges[0] = numero1;
            ranges[1] = numero2;
        } else {
            ranges[0] = numero2;
            ranges[1] = numero1;
        }
        return ranges;
    }

    private static int readIntegerValue() {
        Scanner sc = new Scanner(System.in);
        int numero;
        do {
            System.out.println("Introduza um número inteiro:");
            numero = sc.nextInt();
        } while (numero < 0);
        return numero;
    }
}
