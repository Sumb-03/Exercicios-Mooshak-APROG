import java.util.Scanner;

public class exercicioI {
    public static void main(String[] args) {
        int numero;

        numero = validarInputNumero();
        if (isFibonacci(numero)){
            System.out.println("is a Fibonacci number");
        } else {
            System.out.println("is not a Fibonacci number");
        }
    }

    private static boolean isFibonacci(int numero) {
        int primeirotermo = 0, segundotermo = 1, somatermos = 0;

        if (numero == 0){
            return true;
        }
        while (somatermos < numero) {
            somatermos = primeirotermo + segundotermo;
            primeirotermo = segundotermo;
            segundotermo = somatermos;
        }
        return somatermos == numero;
    }

    private static int validarInputNumero() {
        Scanner sc = new Scanner(System.in);
        int numero;
        do {
            System.out.println("Insira um número inteiro positivo:");
            numero = sc.nextInt();
        } while (numero < 0);
        return numero;
    }
}
