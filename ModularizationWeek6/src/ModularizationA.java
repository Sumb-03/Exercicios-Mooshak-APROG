import java.util.Scanner;

public class ModularizationA {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero, n, sumNumbers = 0, countNumber = 0;
        final int K = 5;
        double averageNumbers;
        n = sc.nextInt();
        numero = sc.nextInt();

        while (numberofdigits(numero) < n && countNumber < K) {
            sumNumbers += numero;
            countNumber++;
            if (countNumber < K) {
                numero = sc.nextInt();
            }
        }

        if (countNumber > 0) {
            averageNumbers = (double) sumNumbers / countNumber;
        } else {
            averageNumbers = sumNumbers;
        }
        System.out.format("%.2f%n", averageNumbers);
    }

    public static int numberofdigits(int numero) {
        int countDigit = 0;
        do {
            numero = numero / 10;
            countDigit++;
        } while (numero != 0);
        return countDigit;
    }
}
