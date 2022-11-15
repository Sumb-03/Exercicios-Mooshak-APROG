import java.util.Scanner;

public class ArraysL {
    static Scanner sc = new Scanner(System.in);
    static int COMPRIMENTOARRAY = 30;

    public static void main(String[] args) {
        int[] arrVizinhos = new int[COMPRIMENTOARRAY];
        criarArrayVizinhos(arrVizinhos);
        for (int i = 1; i < (arrVizinhos.length - 1) && arrVizinhos[i+1] != 0; i++) {
            if (verificarNeighbor(arrVizinhos, i)) {
                System.out.println(arrVizinhos[i]);
            }
        }
    }
    public static boolean verificarNeighbor(int[] arrVizinhos, int i) {
        return arrVizinhos[i] > arrVizinhos[i - 1] && arrVizinhos[i] > arrVizinhos[i + 1];
    }
    private static void criarArrayVizinhos(int[] arrVizinhos) {
        int numero = sc.nextInt();
        int arrCount = 0;

        while (numero > -1) {
            arrVizinhos[arrCount] = numero;
            numero = sc.nextInt();
            arrCount++;
        }
    }
}
