import java.util.Scanner;

public class ExercicioTesteAprog {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero, seculo, maiorAno = 0, countNumeros = 0, countBissexto = 0;
        double percentagemAnosBissextos;

        numero = sc.nextInt();

        while (numero > 999 && numero <= 9999) {
            countNumeros++;
            if ((numero % 4 == 0 && numero % 100 != 0) || numero % 400 == 0) {
                countBissexto++;
                seculo = numero / 100 + 1;
                System.out.print("ano bissexto = " + numero);
                System.out.println("  século = " + seculo);
                if (seculo == 20 && numero > maiorAno) {
                    maiorAno = numero;
                }
            }
            numero = sc.nextInt();
        }

        percentagemAnosBissextos = (double) countBissexto / countNumeros * 100;

        if (countBissexto != 0) {
            System.out.printf("percentagem de bissextos inseridos = %.2f%%%n", percentagemAnosBissextos);
            if (maiorAno != 0) {
                System.out.println("maior ano bissexto do século 20 = " + maiorAno);
            }
        } else {
            System.out.println("não foi inserido qualquer ano bissexto");
        }
    }
}
