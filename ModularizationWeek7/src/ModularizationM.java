import java.util.Scanner;

public class ModularizationM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero, countPositivo = 0, countNumero = 0, countUnico = 0;
        numero = sc.nextInt();

        while (numero != 0) {
            countNumero++;
            if (verificarUnico(numero) == 0) {
                System.out.println(numero);
                countUnico++;
            }
            if (numero > 0) {
                countPositivo++;
            }
            numero = sc.nextInt();
        }

        if (countNumero != 0) {
            System.out.printf("negatives: %.2f%%%n", (double) (countNumero - countPositivo) / countNumero * 100);
            System.out.printf("positives: %.2f%%%n", (double) countPositivo / countNumero * 100);
            System.out.printf("with unique digits: %.2f%%%n", (double) countUnico / countNumero * 100);
        }
    }

    public static int verificarUnico(int numero) {
        int alg1, alg2, numerocopia, numerocopia2, countalg1 = 0, countalg2, verificacao = 0;
        numerocopia2 = numero;

        do {
            countalg1++;
            alg1 = numero % 10;
            numero = numero / 10;
            numerocopia = numerocopia2;
            countalg2 = 0;
            do {
                countalg2++;
                alg2 = numerocopia % 10;
                numerocopia = numerocopia / 10;
                if (alg1 == alg2 && countalg2 != countalg1) {
                    verificacao++;
                }
            } while (numerocopia != 0 && verificacao == 0);
        } while (numero != 0 && verificacao == 0);

        return verificacao;
    }
}
