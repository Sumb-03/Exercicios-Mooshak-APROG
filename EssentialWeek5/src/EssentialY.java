import java.util.Scanner;

public class EssentialY {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero;
        boolean existdividers = false;
        numero = sc.nextInt();

        for (int i = 1; i <= numero; i++) {

            if(numero % i == 0 && i % 3 == 0){
                existdividers = true;
                System.out.println(i);
            }
        }
        if(!existdividers){
            System.out.println("without dividers multiples of 3");
        }
    }
}
