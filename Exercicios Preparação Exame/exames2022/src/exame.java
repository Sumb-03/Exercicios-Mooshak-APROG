import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class exame {
    public static void main(String[] args) throws FileNotFoundException {
        String[] musics = {"On my way", "Memories", "Perfect", "Havana"};
        double[][] info = {{201.6, 3.25}, {189, 2.80}, {256.8, 2.75}, {202.8, 2.35}};

        System.out.printf("Música com o preço mais elevado: %s%n", findMostExpensiveMusic(musics, info));
        System.out.printf("Maior diferença de duração entre músicas: %.2fs%n", calculateBiggestDifference(info));
        writeToFile(musics, info);
    }

    private static String findMostExpensiveMusic(String[] musicas, double[][] info) {
        int posicaoarray = 0;
        double precoMax = info[0][1];
        for (int i = 1; i < info.length; i++) {
            if (precoMax <= info[i][1]) {
                posicaoarray = i;
            }
        }
        return musicas[posicaoarray];
    }

    private static void sort(String[] musicas, double[][] info) {
        double aux;
        for (int i = 0; i < info.length; i++) {
            aux = info[i][0];
            if (info[i][0] > info[i + 1][0]) {
                info[i][0] = info[i + 1][0];
                info[i + 1][0] = aux;
            } else if (info[i][0] == info[i + 1][0]) {
                if (musicas[i].compareTo(musicas[i + 1]) > 0) {
                    info[i][0] = info[i + 1][0];
                    info[i + 1][0] = aux;
                }
            }
        }
    }

    private static double calculateBiggestDifference(double[][] info) {
        double valorMin, valorMax;
        valorMin = valorMax = info[0][0];

        for (int i = 0; i < info.length; i++) {
            if (info[i][0] < valorMin) {
                valorMin = info[i][0];
            } else if (info[i][0] > valorMax) {
                valorMax = info[i][0];
            }
        }
        return valorMax - valorMin;
    }

    private static void writeToFile(String[] musicas, double[][] info) throws FileNotFoundException {
        String nomeficheiro = "musics.txt";
        File ficheiro = new File(nomeficheiro);
        PrintWriter printwriter = new PrintWriter(ficheiro);

        for (int i = 0; i < musicas.length; i++) {
            printwriter.printf("%s / %.2fs / %.2f€ %n", musicas[i], info[i][0], info[i][1]);
        }
        printwriter.close();
    }
}
