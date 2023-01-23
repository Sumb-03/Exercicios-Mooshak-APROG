import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;
import java.io.File;

public class exameRecurso {
    static final int MAX_MESES = 6;
    static final int COLUNAS = 4;

    public static void main(String[] args) throws FileNotFoundException {
        String[] meses = new String[MAX_MESES];
        int[][] jogos = new int[MAX_MESES][COLUNAS];
        readInformationFromFile(meses, jogos);
        System.out.println("Mês com percentagem de vitórias maior: " + getTheMostVictoriousMonth(meses, jogos));
        System.out.println(Arrays.toString(getAverages(jogos)));
        writeStatistics(getAverages(jogos)[0], jogos, meses);

    }

    private static void readInformationFromFile(String[] meses, int[][] jogos) throws FileNotFoundException {
        String nomeficheiro = "Exercicios Preparação Exame/exames2022/xadrez1a6.txt";
        File ficheiro = new File(nomeficheiro);
        Scanner sc = new Scanner(ficheiro);
        String [] temp;

        for (int i = 0; i < jogos.length; i++) {
            temp = sc.nextLine().split(",");
            meses[i] = temp[0];
            for (int x = 0; x < jogos[0].length; x++) {
                jogos[i][x] = Integer.parseInt(temp[x+1]);
            }
        }
        sc.close();
    }

    private static String getTheMostVictoriousMonth(String[] meses, int[][] jogos) {
        int maxVitorias = jogos[0][0];
        int posicaoMax = 0;

        for (int i = 1; i < jogos.length; i++) {
            if (jogos[i][0] > maxVitorias) {
                maxVitorias = jogos[i][0];
                posicaoMax = i;
            }
        }
        return meses[posicaoMax];
    }

    private static double[] getAverages(int[][] jogos) {
        double[] media = new double[jogos[0].length];

        for (int i = 0; i < jogos.length; i++) {
            media[0] += (double) jogos[i][0] / jogos.length;
            media[1] += (double) jogos[i][1] / jogos.length;
            media[2] += (double) jogos[i][2] / jogos.length;
            media[3] += (double) jogos[i][3] / jogos.length;
        }
        return media;
    }

    private static void writeStatistics(double mediajogos, int[][] jogos, String[] meses) {
        System.out.printf("Meses com mais de %.1f jogos%n", mediajogos);
        for (int i = 0; i < jogos.length; i++) {
            if (jogos[i][0] > mediajogos) {
                System.out.printf("%s : %d%n", meses[i], jogos[i][0]);
            }
        }
    }
}
