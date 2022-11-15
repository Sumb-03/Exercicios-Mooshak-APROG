import java.util.Scanner;

public class ArraysI {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        String[] entrada_0 = new String[4];
        String[] entrada_1 = new String[4];
        String[] entrada_2 = new String[4];

        preencherProprietario(entrada_0);
        preencherProprietario(entrada_1);
        preencherProprietario(entrada_2);

        if (mostrarPropietario(entrada_0, entrada_1, entrada_2) == 0){
           System.out.println("Do not live in the building");
        }

    }
    public static void preencherProprietario(String[] entrada) {
        for (int i = 0; i < entrada.length; i++) {
            entrada[i] = sc.nextLine();
        }
    }
    public static int mostrarPropietario(String[] entrada_0, String[] entrada_1, String[] entrada_2) {
        String verificarpessoa;
        int verificacao = 0;
        verificarpessoa = sc.nextLine();
        verificacao += verificarProprietario(verificarpessoa, entrada_0, 0);
        verificacao += verificarProprietario(verificarpessoa, entrada_1, 1);
        verificacao += verificarProprietario(verificarpessoa, entrada_2, 2);
        return verificacao;
    }
    public static int verificarProprietario(String proprietario, String[] entrada, int valorentrada) {
        int verificacao = 0;
        for (int i = 0; i < entrada.length; i++) {
            if (proprietario.equals(entrada[i])) {
                verificacao = 1;
                System.out.println("name=" + entrada[i]);
                System.out.println("entrance=" + valorentrada);
                System.out.println("floor=" + i);
            }
        }
        return verificacao;
    }
}
