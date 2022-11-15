import java.util.Scanner;

public class EssentialM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, output, last, last_but_one;
        n = sc.nextInt();

        if (n == 1) {
            System.out.println("0");
        } else if (n == 2) {
            System.out.println("0");
            System.out.println("1");
        } else if (n > 0) {
            System.out.println("0");
            System.out.println("1");
            last_but_one = 0;
            last = 1;

            for (int i = 3; i <= n; i++) {
                output = last + last_but_one;
                System.out.println(output);
                last_but_one = last;
                last = output;
            }
        }
    }
}
