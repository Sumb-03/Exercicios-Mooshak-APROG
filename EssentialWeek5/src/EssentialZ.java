import java.util.Scanner;

public class EssentialZ {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero, alg, countAlg = 0, countEven = 0, maxOdd = 1;
        double percentageEven;
        boolean odd = false;
        numero = sc.nextInt();

        do {
            alg = numero % 10;
            numero = numero / 10;

            if (alg % 2 == 0) {
                countEven++;
            } else {
                odd = true;
                if (alg > maxOdd) {
                    maxOdd = alg;
                }
            }
            countAlg++;
        } while (numero != 0);

        percentageEven = (double) countEven / countAlg * 100;
        System.out.format("%.2f%%%n", percentageEven);
        if (odd) {
            System.out.println(maxOdd);
        } else {
            System.out.println("no odd digits");
        }
    }
}
