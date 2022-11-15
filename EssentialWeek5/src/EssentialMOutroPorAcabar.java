import java.util.Scanner;

public class EssentialMOutroPorAcabar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, output = 0, last = 1, last_but_one = 0;
        n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println(output);
            output = last_but_one + last;
            last_but_one = last;
            last = output;
        }
    }
}
