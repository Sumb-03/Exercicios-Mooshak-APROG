import java.util.Scanner;

public class ArraysO {
    static Scanner sc = new Scanner(System.in);

    // Caso o professor veja este exercício penso que o código está um bocado á trolha e pouco eficiente, visto que
    // tenho 2 metodos com mais que uma responsabilidade, desde já peço desculpa mas não me veio outra maneira melhor
    // á cabeça. Boa Noite.

    public static void main(String[] args) {
        int ordemMatriz;
        do {
            ordemMatriz = sc.nextInt();
        } while (ordemMatriz <= 1 || ordemMatriz > 20);

        int[][] matriz = new int[ordemMatriz][ordemMatriz];

        criarMatrizQuadrada(matriz);
        for (int i = 0; i < 2; i++) {
            for (int x = 0; x < 2; x++) {
                System.out.printf("[%d]", calcularSomaCadaQuadrante(matriz)[i][x]);
            }
            System.out.println();
        }
    }

    private static int[][] calcularSomaCadaQuadrante(int[][] matriz) {
        int[][] matrizSomaQuadrantes = new int[2][2];
        if (matriz.length % 2 == 0) {
            calcularSomaQuadrantesOrdemPar(matriz, matrizSomaQuadrantes);
        } else {
            calcularSomaQuadrantesOrdemImpar(matriz, matrizSomaQuadrantes);
        }
        return matrizSomaQuadrantes;
    }

    private static void calcularSomaQuadrantesOrdemImpar(int[][] matriz, int[][] matrizSomaQuadrantes) {
        int q1 = 0, q2 = 0, q3 = 0, q4 = 0;
        for (int i = 0; i < matriz.length / 2; i++) {
            for (int x = matriz.length / 2 + 1; x < matriz.length; x++) {
                q1 += matriz[i][x];
            }
        }
        matrizSomaQuadrantes[0][1] = q1;
        for (int i = 0; i < matriz.length / 2; i++) {
            for (int x = 0; x < matriz.length / 2; x++) {
                q2 += matriz[i][x];
            }
        }
        matrizSomaQuadrantes[0][0] = q2;
        for (int i = matriz.length / 2 + 1; i < matriz.length; i++) {
            for (int x = 0; x < matriz.length / 2; x++) {
                q3 += matriz[i][x];
            }
        }
        matrizSomaQuadrantes[1][0] = q3;
        for (int i = matriz.length / 2 + 1; i < matriz.length; i++) {
            for (int x = matriz.length / 2 + 1; x < matriz.length; x++) {
                q4 += matriz[i][x];
            }
        }
        matrizSomaQuadrantes[1][1] = q4;
    }

    private static void calcularSomaQuadrantesOrdemPar(int[][] matriz, int[][] matrizSomaQuadrantes) {
        int q1 = 0, q2 = 0, q3 = 0, q4 = 0;
        for (int i = 0; i < matriz.length / 2; i++) {
            for (int x = matriz.length / 2; x < matriz.length; x++) {
                q1 += matriz[i][x];
            }
        }
        matrizSomaQuadrantes[0][1] = q1;
        for (int i = 0; i < matriz.length / 2; i++) {
            for (int x = 0; x < matriz.length / 2; x++) {
                q2 += matriz[i][x];
            }
        }
        matrizSomaQuadrantes[0][0] = q2;
        for (int i = matriz.length / 2; i < matriz.length; i++) {
            for (int x = 0; x < matriz.length / 2; x++) {
                q3 += matriz[i][x];
            }
        }
        matrizSomaQuadrantes[1][0] = q3;
        for (int i = matriz.length / 2; i < matriz.length; i++) {
            for (int x = matriz.length / 2; x < matriz.length; x++) {
                q4 += matriz[i][x];
            }
        }
        matrizSomaQuadrantes[1][1] = q4;
    }
    private static void criarMatrizQuadrada(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int x = 0; x < matriz.length; x++) {
                matriz[i][x] = sc.nextInt();
            }
        }
    }
}
