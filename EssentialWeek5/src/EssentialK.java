import java.util.Scanner;

public class EssentialK {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        boolean isprime;

        n = sc.nextInt();

        for (int numero = 2; numero <= n; numero++) {
            isprime = true;
            for (int i = 2; i <= numero / 2 && isprime; i++) {
                if (numero % i == 0) {
                    isprime = false;
                }
            }
            if (isprime) {
                System.out.println(numero);
            }
        }
    }
}

