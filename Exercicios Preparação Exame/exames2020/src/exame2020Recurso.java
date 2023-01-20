import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class exame2020Recurso {
    static final int DIAS = 7;
    static final int HORAS = 24;

    public static void main(String[] args) throws FileNotFoundException {
        double[][] temperaturas;
        final String nomeFicheiro = "Exercicios Preparação Exame/exames2020/temperaturasSemana50.txt";
        temperaturas = lerTemperaturaDoFicheiro(nomeFicheiro);
        System.out.println("Número de vezes que o aquecimento foi ligado no dia 3: " + ligacoesDoAquecimentoNoDia(temperaturas, 2));
        boolean[] arrayLigarAquecimento = sugestaoParaLigarAquecimentoAsHoras(temperaturas);
        for (int i = 0; i < HORAS; i++) {
            if (arrayLigarAquecimento[i]) {
                System.out.print("T");
            } else {
                System.out.print("F");
            }
        }
    }

    private static double[][] lerTemperaturaDoFicheiro(String nomeFicheiro) throws FileNotFoundException {
        double[][] temperaturas = new double[DIAS][HORAS];
        File ficheiro = new File(nomeFicheiro);
        Scanner sc = new Scanner(ficheiro);

        for (int i = 0; i < temperaturas.length; i++) {
            for (int x = 0; x < temperaturas[0].length; x++) {
                temperaturas[i][x] = sc.nextDouble();
            }
        }
        sc.close();
        return temperaturas;
    }

    private static int ligacoesDoAquecimentoNoDia(double[][] temperaturas, int dia) {
        boolean aquecimento = false;
        int countAquecimentoLigado = 0;
        final int HORAINICIO = 8, HORAFIM = 18, TEMPERATURAMENOR = 10, TEMPERATURAMAIOR = 20;

        for (int i = HORAINICIO; i <= HORAFIM; i++) {
            if (!aquecimento && temperaturas[dia][i] < TEMPERATURAMENOR) {
                aquecimento = true;
                countAquecimentoLigado++;
            } else if (aquecimento && temperaturas[dia][i] > TEMPERATURAMAIOR) {
                aquecimento = false;
            }
        }
        return countAquecimentoLigado;
    }

    private static boolean[] sugestaoParaLigarAquecimentoAsHoras(double[][] temperaturas) {
        final int TEMPERATURAMINIMA = 10;
        boolean[] matrizVerificacao = new boolean[HORAS];
        boolean verificacao;

        for (int x = 0; x < temperaturas[0].length; x++) {
            verificacao = true;
            for (int i = 0; i < temperaturas.length; i++) {
                if (temperaturas[i][x] >= TEMPERATURAMINIMA) {
                    verificacao = false;
                }
            }
            matrizVerificacao[x] = verificacao;
        }
        return matrizVerificacao;
    }
}
