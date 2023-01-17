import java.util.Scanner;

public class exercicioY {
    public static void main(String[] args) {
        int numero;
        numero = validarInputNumero();
        mostrarDivisoresNumero(numero);
    }

    private static void mostrarDivisoresNumero(int numero) {
        boolean existedivisores = false;
        for (int i = 3; i <= numero; i += 3) {
            if (numero % i == 0) {
                System.out.println(i);
                existedivisores = true;
            }
        }
        if (!existedivisores) {
            System.out.println("without dividers multiples of 3");
        }
    }

    private static int validarInputNumero() {
        Scanner sc = new Scanner(System.in);
        int numero;
        do {
            System.out.println("Insira um número inteiro positivo:");
            numero = sc.nextInt();
        } while (numero <= 0);
        return numero;
    }
}
