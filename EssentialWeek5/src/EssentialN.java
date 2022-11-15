import java.util.Scanner;

public class EssentialN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero, alg, alg2, ultimonumero = 1, numerocopia, numeroMaior = 0;
        boolean incorrect;

        numero = sc.nextInt();

        while (numero >= 0) {
            numerocopia = numero;
            incorrect = false;
            if (numero > numeroMaior && numeroMaior == (numero - 1)) {
                do {
                    alg = numerocopia % 10;
                    alg2 = (numerocopia / 10) % 10;
                    numerocopia = numerocopia / 10;

                    if (alg < alg2 || alg == alg2) {
                        incorrect = true;
                    }
                } while (numerocopia != 0);

                if (!incorrect && ultimonumero < numeroMaior) {
                    System.out.println(numeroMaior);
                    System.out.println(numero);
                } else if (!incorrect) {
                    System.out.println(numero);
                }
                ultimonumero = numero;
            }
            numeroMaior = numero;
            numero = sc.nextInt();
            if (numero < numeroMaior) {
                numeroMaior = numero;
            }
        }
    }
}

