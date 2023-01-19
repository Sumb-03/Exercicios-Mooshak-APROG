import java.sql.SQLOutput;
import java.util.Scanner;

public class exercicioI {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int PISOS = 4;
        final int ENTRADAS = 3;
        String[][] matrizProprietarios = new String[PISOS][ENTRADAS];
        receberDadosMatriz(matrizProprietarios);
        System.out.print("Search for: ");
        String pessoa = sc.nextLine();
        encontrarPessoaNaMatriz(matrizProprietarios, pessoa);

    }

    private static void encontrarPessoaNaMatriz(String[][] matrizProprietarios, String pessoa) {
        boolean verificacao = false;
        for (int i = 0; i < matrizProprietarios[0].length; i++) {
            for (int x = 0; x < matrizProprietarios.length; x++) {
                if (matrizProprietarios[x][i].equals(pessoa)) {
                    System.out.println("name=" + pessoa);
                    System.out.println("entrance=" + i);
                    System.out.println("floor=" + x);
                    verificacao = true;
                }
            }
        }
        if (!verificacao) {
            System.out.println("Do not live in the building");
        }
    }

    private static void receberDadosMatriz(String[][] matrizProprietarios) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < matrizProprietarios[0].length; i++) {
            for (int x = 0; x < matrizProprietarios.length; x++) {
                matrizProprietarios[x][i] = sc.nextLine();
            }
        }
    }
}
