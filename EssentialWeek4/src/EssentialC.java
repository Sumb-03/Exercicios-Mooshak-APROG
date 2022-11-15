import java.util.Scanner;

public class EssentialC {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int num, alg, counterimp = 0, produtoimpares = 1;

        num = ler.nextInt();

        do {
            alg = num % 10;
            num = num / 10;
            if (alg % 2 != 0) {
                produtoimpares = produtoimpares * alg;
                counterimp++;
            }
        } while (num != 0);

        if (counterimp == 0) {
            System.out.println("no odd digits");
        } else {
            System.out.println(produtoimpares);
        }

    }
}
