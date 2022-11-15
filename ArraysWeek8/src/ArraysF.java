import java.util.Scanner;

public class ArraysF {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        double[] juros = new double[6];
        int depositoInicial;

        criarArrayJuros(juros);
        depositoInicial = sc.nextInt();
        System.out.printf("final value=%.2f%n", calcularValorFinal(juros, depositoInicial));
    }

    public static void criarArrayJuros(double[] juros){
        double juro;
        for (int i = 0; i < juros.length; i++) {
            juro = sc.nextDouble();
            juros[i] = juro;
        }
    }
    public static double calcularValorFinal(double[] juros, int deposito){
        double montanteComJuro = deposito;

        for (int i = 0; i < juros.length; i++) {
            montanteComJuro = montanteComJuro + (montanteComJuro * juros[i]);
        }
        return montanteComJuro;
    }
}
