import java.util.Scanner;

public class EssentialD {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int num, alg, produtoimpares;
        boolean existeimpar;
        num = ler.nextInt();

        while (num > 0) {
            produtoimpares = 1;
            existeimpar = false;
            do {
                alg = num % 10;
                num = num / 10;
                if (alg % 2 != 0) {
                    produtoimpares = produtoimpares * alg;
                    existeimpar = true;
                }
            } while (num != 0);

            if (existeimpar == false) {
                System.out.println("no odd digits");
            } else {
                System.out.println(produtoimpares);
            }

            num = ler.nextInt();
        }

    }
}