import java.util.Scanner;

public class ArraysN {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int ordemMatriz;
        do {
            ordemMatriz = sc.nextInt();
        } while (ordemMatriz <= 1 || ordemMatriz > 20);

        int[][] matriz = new int[ordemMatriz][ordemMatriz];

        criarMatrizQuadrada(matriz);
        calcularDiagonaisDireitaParaEsquerda(matriz);
    }

    private static void criarMatrizQuadrada(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                matriz[i][j] = sc.nextInt();
            }
        }
    }

    private static void calcularDiagonaisDireitaParaEsquerda(int[][] matriz) {
        for (int x = matriz.length - 1; x >= 0; x--) {
            int linha = 0;
            for (int y = x; y <= matriz.length - 1; y++) {
                System.out.printf("[%d]", matriz[linha][y]);
                linha++;
            }
            System.out.println();
        }
        for (int x = 1; x < matriz.length; x++) {
            int linha = x;
            for (int y = 0; y < matriz.length - x; y++) {
                System.out.printf("[%d]", matriz[linha][y]);
                linha++;
            }
            System.out.println();
        }
    }
}
