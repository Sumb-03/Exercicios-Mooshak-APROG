import java.util.Scanner;

public class exercicioI {
    public static void main(String[] args) {
        int numero1, numero2, minimoMultiploComum;
        numero1 = validarNumeroInteiro();
        numero2 = validarNumeroInteiro();
        minimoMultiploComum = descobrirMinimoMultiploComun(numero1, numero2);
        System.out.println("O MMC é : " + minimoMultiploComum);
    }

    private static int descobrirMinimoMultiploComun(int numero1, int numero2) {
        int maiornumero, menornumero, multiploMaior, multiploMenor;
        if (numero1 > numero2) {
            maiornumero = multiploMaior = numero1;
            menornumero = multiploMenor = numero2;
        } else {
            maiornumero = multiploMaior = numero2;
            menornumero = multiploMenor = numero1;
        }
        do {
            while (menornumero < maiornumero) {
                menornumero += multiploMenor;
            }

            while (maiornumero < menornumero) {
                maiornumero += multiploMaior;
            }

        } while (maiornumero != menornumero);

        return maiornumero;
    }

    private static int validarNumeroInteiro() {
        Scanner sc = new Scanner(System.in);
        int numero;
        do {
            System.out.println("Insira um Número Inteiro Positivo:");
            numero = sc.nextInt();
        } while (numero <= 0);
        return numero;
    }
}
