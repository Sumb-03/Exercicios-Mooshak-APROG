import java.util.Scanner;

public class ArraysB {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int[] conjuntoNumerosPositivos;
        int min;

        conjuntoNumerosPositivos = criarArraycomNumeros();
        min = determinarNumeroMin(conjuntoNumerosPositivos);

        if (min != 0){
            System.out.println("min=" + min);
            System.out.println("occurrences=" + determinarNumeroOccorrencias(conjuntoNumerosPositivos, min));
        }
    }

    public static int[] criarArraycomNumeros() {
        int[] classificacoes = new int[20];
        int numero, countPosicao = 0;

        numero = sc.nextInt();
        while (numero > 0) {
            classificacoes[countPosicao] = numero;
            countPosicao++;
            numero = sc.nextInt();
        }
        return classificacoes;
    }

    public static int determinarNumeroMin(int[] array) {
        int min = array[0];

        for (int i = 0; i < array.length; i++) {
            if (array[i] < min && array[i] != 0) {
                min = array[i];
            }
        }
        return min;
    }

    public static int determinarNumeroOccorrencias(int[] array, int min) {
        int countOcorrencias = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] == min) {
                countOcorrencias++;
            }
        }
        return countOcorrencias;
    }
}
