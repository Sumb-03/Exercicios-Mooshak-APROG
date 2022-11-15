import java.util.Scanner;

public class EssentialH {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int numero;
        boolean primo;

        numero = ler.nextInt();
        primo = true;


        for (int i = 2; i < numero/2; i++) {

            if (numero % i == 0) {
                primo = false;
            }

        }

        if (primo && numero !=1) {
            System.out.println("prime");
        } else {
            System.out.println("not prime");
        }
    }
}
