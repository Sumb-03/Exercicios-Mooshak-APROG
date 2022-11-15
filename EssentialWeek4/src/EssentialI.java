import java.util.Scanner;

public class EssentialI {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int primeironumero, segundonumero, primeiromax, segundomax, primeiromultiplo, segundomultiplo;

        primeironumero = ler.nextInt();
        segundonumero = ler.nextInt();

        if (primeironumero < segundonumero) {
            primeiromax = primeironumero;
            segundomax = segundonumero;
            primeiromultiplo = primeironumero;
            segundomultiplo = segundonumero;
        } else {
            primeiromax = segundonumero;
            segundomax = primeironumero;
            primeiromultiplo = segundonumero;
            segundomultiplo = primeironumero;
        }

        do {
            do {
                primeiromax += primeiromultiplo;
            } while (primeiromax < segundomax);

            while (segundomax < primeiromax) {
                segundomax += segundomultiplo;
            }

        } while (primeiromax != segundomax);

        System.out.println(primeiromax);

    }
}
