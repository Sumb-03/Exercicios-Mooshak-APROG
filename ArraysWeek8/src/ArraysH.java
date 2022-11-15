import java.util.Scanner;

public class ArraysH {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int[] sequencia;
        int n;
        String instrucao;

        n = sc.nextInt();
        sequencia = criarArraySequencia(n);
        sc.nextLine();
        instrucao = sc.nextLine();

        while (!instrucao.equals("exit")) {
            switch (instrucao) {
                case "right":
                    rodarSequenciaDireita(sequencia);
                    mostrarSequencia(sequencia);
                    break;
                case "left":
                    rodarSequenciaEsquerda(sequencia);
                    mostrarSequencia(sequencia);
                    break;
            }
            instrucao = sc.nextLine();
        }
    }
    public static int[] criarArraySequencia(int n) {
        int[] sequencia = new int[n];

        for (int i = 0; i < n; i++) {
            sequencia[i] = sc.nextInt();
        }
        return sequencia;
    }
    public static void mostrarSequencia(int[] sequencia) {
        for (int i = 0; i < sequencia.length; i++) {
            System.out.printf("[%d]", sequencia[i]);
        }
        System.out.println();
    }
    public static void rodarSequenciaDireita(int[] sequencia) {
        int valor = sequencia[sequencia.length - 1];
        for (int i = sequencia.length - 1; i > 0; i--) {
            sequencia[i] = sequencia[i - 1];
        }
        sequencia[0] = valor;
    }
    public static void rodarSequenciaEsquerda(int[] sequencia) {
        int valor = sequencia[0];
        for (int i = 0; i < sequencia.length - 1; i++) {
            sequencia[i] = sequencia[i + 1];
        }
        sequencia[sequencia.length - 1] = valor;
    }
}
