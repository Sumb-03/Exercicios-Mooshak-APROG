import java.util.Scanner;

public class EssentialG {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int numero, numerodivisores = 0;

        numero = ler.nextInt();

        for (int i = 1; i <= numero; i++) {
            if (numero % i == 0) {
                numerodivisores++;
                System.out.println(i);
            }
        }

        System.out.println("(" + numerodivisores + ")");
    }
}
