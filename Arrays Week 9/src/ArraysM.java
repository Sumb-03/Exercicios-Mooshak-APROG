import java.util.Scanner;

public class ArraysM {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int[] arrNumeros = new int[60];
        int tamanhoArray;
        tamanhoArray = criarArrayNumeros(arrNumeros);

        for (int i = 0; i < tamanhoArray; i++) {
            System.out.println(arrNumeros[i] + ":" + calcularNumeroDigitosDiferentes(arrNumeros, i));
        }
    }

    private static boolean verificarSeNumeroRepetido(int numerocopia, int alg) {
        boolean repetido = false;
        int alg2;
        do {
            alg2 = numerocopia % 10;
            numerocopia /= 10;
            if (alg == alg2) {
                repetido = true;
            }

        } while (numerocopia != 0);
        return repetido;
    }

    private static int calcularNumeroDigitosDiferentes(int[] arrNumeros, int x) {
        int numero = arrNumeros[x];
        int alg, numerocopia, countAlgarismosDiferentes = 0;
        boolean repetido;

        while (numero != 0) {
            alg = numero % 10;
            numero = numero / 10;
            countAlgarismosDiferentes++;
            numerocopia = numero;
            repetido = verificarSeNumeroRepetido(numerocopia, alg);
            if (repetido) {
                countAlgarismosDiferentes--;
            }
        }
        if (arrNumeros[x] == 0){
            countAlgarismosDiferentes = 1;
        }
        return countAlgarismosDiferentes;
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
