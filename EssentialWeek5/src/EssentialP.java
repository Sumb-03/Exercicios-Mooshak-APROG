import java.util.Scanner;

public class EssentialP {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero, numero2, numerocopia, algnumero, algnumero2, countposicao1, countposicao2;
        boolean algarismorepetido;
        numero = sc.nextInt();
        numerocopia = numero2 = numero;

        while (numero >= 0) {
            algarismorepetido = false;
            countposicao1 = 0;
            do {
                countposicao1++;
                numero2 = numerocopia;
                algnumero = numero % 10;
                numero = numero / 10;
                countposicao2 = 0;
                do {
                    countposicao2++;
                    algnumero2 = numero2 % 10;
                    numero2 = numero2 / 10;

                    if (algnumero == algnumero2 && countposicao1 != countposicao2) {
                        algarismorepetido = true;
                        System.out.println(numerocopia + " : digit (" + algnumero + ") repeated in positions (" +
                                countposicao1 + ") and (" + countposicao2 + ")");
                    }
                } while (numero2 != 0 && !algarismorepetido);
            } while (numero != 0 && !algarismorepetido);

            numero = sc.nextInt();
            numerocopia = numero;
        }
    }
}

