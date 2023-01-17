import java.util.Scanner;

public class exercicioH {
    public static void main(String[] args) {
        int numero;
        boolean primo;
        numero = validarNumeroInteiro();
        primo = validarSePrimo(numero);
        mostrarResultado(primo);
    }

    private static void mostrarResultado(boolean primo) {
        if (primo) {
            System.out.println("prime");
        } else {
            System.out.println("not prime");
        }
    }

    private static boolean validarSePrimo(int numero) {
        if (numero == 1) {
            return false;
        }
        for (int i = 2; i <= numero / 2; i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    }

    private static int validarNumeroInteiro() {
        Scanner sc = new Scanner(System.in);
        int numero;
        do {
            System.out.println("Insira o número Inteiro Positivo:");
            numero = sc.nextInt();
        } while (numero <= 0);
        return numero;
    }
}

