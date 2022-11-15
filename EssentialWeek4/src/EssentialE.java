import java.util.Scanner;

public class EssentialE {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int numero, alg, posicaoalgarismo, conversao;

        numero = ler.nextInt();

        while (numero > 0) {
            conversao = 0; posicaoalgarismo = 0;
            do {
                alg = numero % 10;
                numero = numero / 10;
                conversao += alg * Math.pow(8, posicaoalgarismo);
                posicaoalgarismo++;

            } while (numero != 0);

            System.out.println(conversao);

            numero = ler.nextInt();
        }

    }
}
