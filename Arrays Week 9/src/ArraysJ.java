import java.util.Scanner;

public class ArraysJ {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        String[] arrNomeFuncionarios = new String[40];
        int[] arrSalarioFuncionarios = new int[40];
        int top1, top2, top3, arrcount;

        arrcount = criarArrayFuncionarios(arrNomeFuncionarios, arrSalarioFuncionarios);
        top1 = descobrirTop1FuncionariosMaisBemPagos(arrNomeFuncionarios, arrSalarioFuncionarios);
        top2 = descobrirTop2FuncionariosMaisBemPagos(arrNomeFuncionarios, arrSalarioFuncionarios, top1);
        System.out.printf("#1:%s:%d%n", arrNomeFuncionarios[top1], arrSalarioFuncionarios[top1]);
        System.out.printf("#2:%s:%d%n", arrNomeFuncionarios[top2], arrSalarioFuncionarios[top2]);
        if ( arrcount >= 3 ){
            top3 = descobrirTop3FuncionariosMaisBemPagos(arrNomeFuncionarios, arrSalarioFuncionarios, top1, top2);
            System.out.printf("#3:%s:%d%n", arrNomeFuncionarios[top3], arrSalarioFuncionarios[top3]);
        }
    }
    public static int descobrirTop3FuncionariosMaisBemPagos(String[] arrNomeFuncionarios, int[] arrSalarioFuncionarios, int top1, int top2) {
        int maxSalario = 0;
        int topPosicao = 0;

        for (int i = 0; i < arrSalarioFuncionarios.length; i++) {
            if (arrSalarioFuncionarios[i] > maxSalario && i != top1 && i != top2) {
                maxSalario = arrSalarioFuncionarios[i];
                topPosicao = i;
            }

            if (arrSalarioFuncionarios[i] == maxSalario && i != top1 && i != top2) {
                if (arrNomeFuncionarios[i].compareTo(arrNomeFuncionarios[topPosicao]) < 0) {
                    maxSalario = arrSalarioFuncionarios[i];
                    topPosicao = i;
                }
            }
        }
        return topPosicao;
    }
    public static int descobrirTop2FuncionariosMaisBemPagos(String[] arrNomeFuncionarios, int[] arrSalarioFuncionarios, int top1) {
        int maxSalario = 0;
        int topPosicao = 0;

        for (int i = 0; i < arrSalarioFuncionarios.length; i++) {
            if (arrSalarioFuncionarios[i] > maxSalario && i != top1) {
                maxSalario = arrSalarioFuncionarios[i];
                topPosicao = i;
            }

            if (arrSalarioFuncionarios[i] == maxSalario && i != top1) {
                if (arrNomeFuncionarios[i].compareTo(arrNomeFuncionarios[topPosicao]) < 0) {
                    maxSalario = arrSalarioFuncionarios[i];
                    topPosicao = i;
                }
            }
        }
        return topPosicao;
    }

    public static int descobrirTop1FuncionariosMaisBemPagos(String[] arrNomeFuncionarios, int[] arrSalarioFuncionarios) {
        int maxSalario = arrSalarioFuncionarios[0];
        int top1Posicao = 0;
        for (int i = 1; i < arrSalarioFuncionarios.length; i++) {
            if (arrSalarioFuncionarios[i] > maxSalario) {
                maxSalario = arrSalarioFuncionarios[i];
                top1Posicao = i;
            }
            if (arrSalarioFuncionarios[i] == maxSalario && arrNomeFuncionarios[i].compareTo(arrNomeFuncionarios[top1Posicao]) < 0) {
                maxSalario = arrSalarioFuncionarios[i];
                top1Posicao = i;
            }
        }
        return top1Posicao;

    }
    private static int criarArrayFuncionarios(String[] arrNomeFuncionarios, int[] arrSalarioFuncionarios) {
        String funcionario = sc.nextLine();
        int arrCount = 0;

        while (!funcionario.equals("END")) {
            arrNomeFuncionarios[arrCount] = funcionario;
            criarArraySalarioFuncionarios(arrSalarioFuncionarios, arrCount);
            funcionario = sc.nextLine();
            arrCount++;
        }
        return arrCount;
    }
    private static void criarArraySalarioFuncionarios(int[] arrSalarioFuncionarios, int arrCount) {
        arrSalarioFuncionarios[arrCount] = sc.nextInt();
        sc.nextLine();
    }
}
