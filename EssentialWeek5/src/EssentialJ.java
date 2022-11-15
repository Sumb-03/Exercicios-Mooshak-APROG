import java.util.Scanner;

public class EssentialJ {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, numero, alg, numerocopia, countalgarismos, countdivisores;
        double percentagemdivisores, maxpercentagem = 0;

        n = sc.nextInt();

        if (n > 0) {
            for (int x = 1; x <= n; x++) {

                numero = sc.nextInt();
                numerocopia = numero;
                countdivisores = 0;
                countalgarismos = 0;

                do {
                    alg = numero % 10;
                    numero = numero / 10;


                    if (alg != 0 && numerocopia % alg == 0) {
                        countdivisores++;
                    }
                    countalgarismos++;

                } while (numero != 0);

                percentagemdivisores = (double) countdivisores / countalgarismos * 100;
                System.out.format("%.2f%%%n", percentagemdivisores);

                if (percentagemdivisores > maxpercentagem) {
                    maxpercentagem = percentagemdivisores;
                }
            }
            System.out.format("(%.2f%%)%n", maxpercentagem);
        }
    }
}
