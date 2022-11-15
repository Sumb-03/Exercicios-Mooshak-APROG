import java.util.Scanner;

public class EssentialA {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int num, alg, somaP = 0;

        num = ler.nextInt();

        do{
            alg = num % 10;
            num = num / 10;
            if (alg % 2 == 0){
                somaP += alg;
            }
        }while(num != 0);
        System.out.println(somaP);
    }
}
