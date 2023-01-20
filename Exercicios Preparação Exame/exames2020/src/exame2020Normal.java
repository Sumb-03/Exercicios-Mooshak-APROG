import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class exame2020Normal {
    public static void main(String[] args) throws FileNotFoundException {
        int[][] lugares;
        final String ficheiro = "Exercicios Preparação Exame/exames2020/ocupacaoSala2020-01-14.txt";
        final int numeroLugaresConsecutivos = 4;
        lugares = lerOcupacaoDaSala(ficheiro);
        System.out.println("Receita total da sala foi: " + calcularBilheteira(lugares));
        System.out.println("Fila com 4 lugares consecutivos: " + informarLugares(lugares, numeroLugaresConsecutivos));
    }

    private static int[][] lerOcupacaoDaSala(String nomeFicheiro) throws FileNotFoundException {
        final int FILAS = 24;
        final int LUGARES = 30;
        String[] linha;
        int[][] lugares = new int[FILAS][LUGARES];
        File ficheiro = new File(nomeFicheiro);
        Scanner sc = new Scanner(ficheiro);

        while (sc.hasNextLine()) {
            linha = sc.nextLine().split(";");
            for (int i = 0, l = Integer.parseInt(linha[0]); i < LUGARES; i++) {
                lugares[l][i] = Integer.parseInt(linha[i+1]);
            }
        }
        sc.close();
        return lugares;
    }

    private static int calcularBilheteira(int[][] lugares) {
        final int ZONA1 = 7, PRECOZONA1 = 20;
        final int ZONA2 = 15, PRECOZONA2 = 15;
        final int PRECOZONA3 = 10;
        int valorTotalBilheteira = 0;
        for (int i = 0; i < lugares.length; i++) {
            for (int x = 0; x < lugares[0].length; x++) {
                if (i <= ZONA1 && lugares[i][x] == 1) {
                    valorTotalBilheteira += PRECOZONA1;
                } else if (i <= ZONA2 && lugares[i][x] == 1) {
                    valorTotalBilheteira += PRECOZONA2;
                } else if (lugares[i][x] == 1) {
                    valorTotalBilheteira += PRECOZONA3;
                }
            }
        }
        return valorTotalBilheteira;
    }

    private static int informarLugares(int[][] lugares, int numeroLugares) {
        boolean verificacao = true;
        for (int i = lugares.length - 1; i >= 0; i--) {
            for (int x = 0; x < lugares[0].length - numeroLugares; x++) {
                for (int a = 1; a <= numeroLugares; a++) {
                    verificacao = lugares[i][x] == 0 && lugares[i][x + a] == 0;
                }
                if (verificacao) {
                    return i;
                }
            }
        }
        return -1;
    }
}
