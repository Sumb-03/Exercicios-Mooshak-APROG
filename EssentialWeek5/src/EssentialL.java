import java.util.Scanner;

public class EssentialL {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, numero = 0, somadivisores;

        n = sc.nextInt();

        for (int i = 1; i <= n; i++) {

            do {
                numero++;
                somadivisores = 0;

                for (int x = 1; x < numero; x++) {

                    if (numero % x == 0) {
                        somadivisores += x;
                    }
                }

            } while (numero != somadivisores);
            System.out.println(numero);
        }
    }
}
