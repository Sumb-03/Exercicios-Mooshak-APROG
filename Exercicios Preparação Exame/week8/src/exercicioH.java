import java.util.Scanner;

public class exercicioH {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String inputUser;
        int[] arrayDados = recebberDadosUtilizador();
        inputUser = sc.nextLine();
        while (!inputUser.equals("exit")) {
            rotateSequence(inputUser, arrayDados);
            showSequence(arrayDados);
            inputUser = sc.nextLine();
        }
    }

    private static void showSequence(int[] arrayDados) {
        for (int i = 0; i < arrayDados.length; i++) {
            System.out.printf("[%d]", arrayDados[i]);
        }
        System.out.println();
    }

    private static void rotateSequence(String inputUser, int[] arrayDados) {
        int aux;
        if (inputUser.equals("right")) {
            aux = arrayDados[arrayDados.length - 1];
            for (int i = arrayDados.length - 1; i > 0; i--) {
                arrayDados[i] = arrayDados[i - 1];
            }
            arrayDados[0] = aux;
        } else if (inputUser.equals("left")) {
            aux = arrayDados[0];
            for (int i = 0; i < arrayDados.length - 1; i++) {
                arrayDados[i] = arrayDados[i + 1];
            }
            arrayDados[arrayDados.length - 1] = aux;
        }
    }

    private static int[] recebberDadosUtilizador() {
        Scanner sc = new Scanner(System.in);
        int[] arrayDados = new int[sc.nextInt()];
        for (int i = 0; i < arrayDados.length; i++) {
            arrayDados[i] = sc.nextInt();
        }
        return arrayDados;
    }
}
