import java.util.Scanner;

public class ModularizationK {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero;

        numero = sc.nextInt();
        System.out.println("points=" + fazerPontuacao(numero));
    }

    public static int fazerPontuacao(int numero) {
        int digit, points = 0, inversao = 0, copydigit = 0;
        boolean numeroRepetido = false;

        do {
            digit = numero % 10;
            numero = numero / 10;
            inversao = inversao * 10 + digit;

        } while (numero != 0);

        numero = inversao;

        while (numero != 0) {
            digit = numero % 10;
            numero = numero / 10;

            if (numeroRepetido && digit == copydigit) {
                points -= digit;
            } else if (digit == copydigit) {
                points = -points;
                points -= digit;
                numeroRepetido = true;
            } else {
                points += digit;
            }
            copydigit = digit;
        }

        return points;
    }
}
