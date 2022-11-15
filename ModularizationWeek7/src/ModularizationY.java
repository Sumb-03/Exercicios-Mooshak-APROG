import java.util.Scanner;

public class ModularizationY {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int numero1, numero2;

        numero1 = readPositiveValue();
        numero2 = readPositiveValue();
        showTablesInRange(numero1, numero2);
    }
    public static int readPositiveValue() {
        int numero;
        do {
            numero = sc.nextInt();
        } while (numero < 1);
        return numero;
    }

    public static void showTablesInRange(int numero1, int numero2) {
        int bigger, lower;

        if (numero1 > numero2) {
            bigger = numero1;
            lower = numero2;
        } else {
            bigger = numero2;
            lower = numero1;
        }

        for (int i = lower; i <= bigger; i++) {
            showTableOfNumber(i);
        }
    }

    public static void showTableOfNumber(int number){
        int result;

        System.out.println("Multiplication table of " + number);
        for (int i = 1; i <= 10; i++) {
            result = number * i;
            System.out.printf("%d x %d = %d%n", number, i, result);
        }
    }
}
