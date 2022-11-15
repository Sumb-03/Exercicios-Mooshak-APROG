import java.util.Scanner;

public class ArraysK {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int n = sc.nextInt();
        int[] sequencia = new int[n];
        criarArraySequencia(sequencia);
        mostrarArraySemRepeticoes(sequencia);
    }
    public static void criarArraySequencia(int[] sequencia){
        for (int i = 0; i < sequencia.length; i++) {
            sequencia[i] = sc.nextInt();
        }
    }
    public static void mostrarArraySemRepeticoes(int[] sequencia){
        boolean existerepetido;

        for (int i = 0; i < sequencia.length; i++) {
            existerepetido = false;
            for (int x = 0; x < i; x++) {
                if(sequencia[x] == sequencia[i]){
                    existerepetido = true;
                }
            }
            if (!existerepetido){
                System.out.println(sequencia[i]);
            }
        }
    }
}
