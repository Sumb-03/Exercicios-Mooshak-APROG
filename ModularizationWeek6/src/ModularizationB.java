import java.util.Scanner;

public class ModularizationB {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numeroAlunos, numeroDisciplinas, numeroAprovados;
        String nomeDisciplina;
        numeroAlunos = sc.nextInt();
        numeroDisciplinas = sc.nextInt();

        for (int i = 1; i <= numeroDisciplinas; i++) {
            sc.nextLine();
            nomeDisciplina = sc.nextLine();
            numeroAprovados = sc.nextInt();
            infoDisciplina(nomeDisciplina, numeroAprovados, numeroAlunos);
        }
    }

    public static void infoDisciplina(String nomeDisciplina, int numeroAprovados, int numeroAlunos) {
        String approved = "", failed = "";

        System.out.println("Subject: " + nomeDisciplina);
        for (int j = 1; j <= numeroAprovados; j++) {
            approved += "*";
        }
        for (int x = 1; x <= (numeroAlunos - numeroAprovados); x++) {
            failed += "*";
        }

        System.out.println("- Approved: " + approved);
        System.out.println("- Failed: " + failed);
    }
}

