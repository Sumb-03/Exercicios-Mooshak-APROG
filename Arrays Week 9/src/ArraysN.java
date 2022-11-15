import java.util.Scanner;

public class ArraysN {
    static Scanner sc = new Scanner(System.in);
    static int ORDEM_MATRIZ = sc.nextInt();
    //corrigir isto, tem q ser entre 1 e 20
    public static void main(String[] args) {
        int[][] matriz = new int[ORDEM_MATRIZ][ORDEM_MATRIZ];
        criarMatrizQuadrada(matriz);
        calcularDiagonaisDireitaParaEsquerda(matriz);
    }
    private static void criarMatrizQuadrada(int[][] matriz) {
        for (int i = 0; i < ORDEM_MATRIZ; i++) {
            for (int j = 0; j < ORDEM_MATRIZ; j++) {
                matriz[i][j] = sc.nextInt();
            }
        }
    }
    
    private static void calcularDiagonaisDireitaParaEsquerda(int[][] matriz){
        //for (int i = 0; i < (2*ORDEM_MATRIZ -1); i++) {
            for (int x = 0; x < ORDEM_MATRIZ; x++) {
                for (int y = ORDEM_MATRIZ-1; y >= 0; y--) {
                    System.out.printf(" [%d] ", matriz[x][y]);
                }
                System.out.println();
            }
            
        //}
    }
}
