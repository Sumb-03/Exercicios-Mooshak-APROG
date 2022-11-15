import java.util.Scanner;

public class ModularizationD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero1, numero2;
        numero1 = sc.nextInt();
        numero2 = sc.nextInt();
        if (numero1 >= numero2) {
            System.out.println("C(" + numero1 + "," + numero2 + ")=" + combinations(numero1, numero2));
            System.out.println("P(" + numero1 + "," + numero2 + ")=" + permutations(numero1, numero2));
        }
    }

    public static int factorial(int m) {
        int fatorial = 1;
        for (int i = 2; i <= m; i++) {
            fatorial = fatorial * i;
        }
        return fatorial;
    }

    public static int combinations(int m, int n) {
        int combination;
        combination = factorial(m) / (factorial(n) * factorial(m - n));
        return combination;
    }

    public static int permutations(int m, int n) {
        int permutation;
        permutation = factorial(m) / factorial(m - n);
        return permutation;
    }
}
