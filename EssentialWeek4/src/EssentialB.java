import java.util.Scanner;

public class EssentialB {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int num, alg, somaP;

        num = ler.nextInt();

        while (num > 0) {
            somaP = 0;
            do {
                alg = num % 10;
                num = num / 10;
                if (alg % 2 == 0) {
                    somaP += alg;
                }
            } while (num != 0);
            System.out.println(somaP);
            num = ler.nextInt();
        }
    }
}
