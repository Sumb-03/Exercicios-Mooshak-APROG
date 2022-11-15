import java.util.Scanner;

public class ArraysA {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int[] classificacoes;
        int n;

        n = sc.nextInt();
        classificacoes = CriarArraycomNotas(n);
        System.out.println("average=" + calcularMediaTurma(classificacoes, n));
        System.out.println("failures=" + numeroAlunosReprovados(classificacoes));

    }

    public static double calcularMediaTurma(int[] classificacoes, int n){
        int somatotal = 0;
        double media;

        for (int i = 0; i < n; i++) {
            somatotal += classificacoes[i];
        }
        media = (double)somatotal / n;
        return media;
    }

    public static int numeroAlunosReprovados(int[] classificacoes){
        int qtdReprovados = 0, nota;

        for (int i = 0; i < classificacoes.length; i++) {
            nota = classificacoes[i];
            if(nota < 10){
                qtdReprovados++;
            }
        }
        return qtdReprovados;
    }
    public static int[] CriarArraycomNotas(int n) {
        int[] classificacoes = new int[n];
        int numero;

        for (int i = 0; i < n; i++) {
            numero = sc.nextInt();
            classificacoes[i] = numero;
        }
        return classificacoes;
    }
}
