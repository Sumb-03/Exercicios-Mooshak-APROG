import java.util.Scanner;

public class ArraysE {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        double[] vencimentosFuncionarios = new double[20];
        String[] funcionarios = new String[20];
        double media;

        criarArraysFuncionariosEVencimento(vencimentosFuncionarios, funcionarios);
        media = calcularMediaVencimento(vencimentosFuncionarios);
        mostrarResultado(media, funcionarios, vencimentosFuncionarios);
    }

    public static void criarArraysFuncionariosEVencimento(double[] vencimentofuncionarios, String[] funcionarios) {
        int countArray = 0;
        double vencimento;
        String funcionario;

        funcionario = sc.nextLine();
        while (!funcionario.equals("end")) {
            funcionarios[countArray] = funcionario;
            vencimento = sc.nextDouble();
            vencimentofuncionarios[countArray] = vencimento;
            sc.nextLine();
            funcionario = sc.nextLine();
            countArray++;
        }
    }

    public static double calcularMediaVencimento(double[] vencimentofuncionarios) {
        int totalFuncionarios = 0;
        double media, somaVencimentos = 0;

        for (int i = 0; i < vencimentofuncionarios.length && vencimentofuncionarios[i] != 0; i++) {
            somaVencimentos += vencimentofuncionarios[i];
            totalFuncionarios++;
        }
        media = somaVencimentos / totalFuncionarios;
        return media;
    }

    public static void mostrarResultado(double media, String[] funcionarios, double[] vencimentoFuncionarios) {
        System.out.printf("%.1f%n", media);

        for (int i = 0; i < funcionarios.length; i++) {
            if (vencimentoFuncionarios[i] < media && vencimentoFuncionarios[i] != 0) {
                System.out.println(funcionarios[i]);
            }
        }
    }

}
