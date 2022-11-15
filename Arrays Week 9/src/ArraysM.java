import java.util.Scanner;

public class ArraysM {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int[] arrNumeros = new int[35];
        int tamanhoArray;
        tamanhoArray = criarArrayNumeros(arrNumeros);

        for (int i = 0; i < tamanhoArray; i++) {
            System.out.println(arrNumeros[i] + ":" + calcularNumeroDigitosDiferentes(arrNumeros, i));
        }
    }
    private static int calcularNumeroDigitosDiferentes(int[] arrNumeros, int x) {
        int numero = arrNumeros[x];
        int alg, countAlgarismos = 0, countDigitosDiferentes = 0;
        boolean verificacao;

        do {
            alg = numero % 10;
            numero = numero / 10;
            countAlgarismos++;
        } while (numero != 0);

        return countDigitosDiferentes;
    }

    private static int criarArrayNumeros(int[] arrNumeros) {
        int arrCount = 0, numero = sc.nextInt();

        while (numero >= 0) {
            arrNumeros[arrCount] = numero;
            numero = sc.nextInt();
            arrCount++;
        }
        return arrCount;
    }
}
