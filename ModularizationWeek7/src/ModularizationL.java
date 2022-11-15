import java.util.Scanner;

public class ModularizationL {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String frase;
        frase = sc.nextLine();
        System.out.println(numeroPalavras(frase));
    }
    public static int numeroPalavras(String frase){
        int numeropalavras = 0;
        char verificacao, copiaVerificacao = ' ';

        for (int i = 0; i < frase.length(); i++) {
            verificacao = frase.charAt(i);

            if((verificacao != ' ' && copiaVerificacao == ' ')){
                numeropalavras++;
            }
            copiaVerificacao = verificacao;
        }
        return numeropalavras;
    }
}
