import java.util.Scanner;

public class ModularizationE {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, numero1, numero2, maxCount = 0;
        String max = "";
        n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            numero1 = sc.nextInt();
            numero2 = sc.nextInt();
            if (commondigits(numero1, numero2) > 0 && commondigits(numero1, numero2) >= maxCount) {
                maxCount = commondigits(numero1, numero2);
                max = "" + numero1 + "/" + numero2;
            }
        }
        if (maxCount > 0) {
            System.out.println(max);
        } else {
            System.out.println("no results");
        }

    }

    public static int commondigits(int numero1, int numero2) {
        int alg1, alg2, countAlg1 = 0, countAlg2, countQtd = 0;
        do {
            countAlg1++;
            alg1 = numero1 % 10;
            numero1 = numero1 / 10;
            countAlg2 = 0;

            do {
                countAlg2++;
                alg2 = numero2 % 10;
                numero2 = numero2 / 10;
                if (alg2 == alg1 && countAlg1 == countAlg2) {
                    countQtd++;
                }
            } while (numero2 != 0);

        } while (numero1 != 0);
        return countQtd;
    }
}
