import java.util.Scanner;

public class ModularizationJ {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;

        do {
            n = sc.nextInt();
        } while (n > 100 || n < 1);

        System.out.println("triples=" + somaTriplas(n));
    }

    public static int somaTriplas(int n) {
        int countTripla = 0;

        for (int i = n - 2; i > 0; i--) {
            for (int x = i; x > 0; x--) {
                for (int z = x; z > 0; z--) {
                    if (i + x + z == n){
                        System.out.println(i + " + " + x + " + " + z);
                        countTripla++;
                    }
                }
            }
        }
        return countTripla;
    }
}
