import java.util.Scanner;

public class ModularizationI {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number;
        number = sc.nextInt();

        if (fibonaccinumber(number)) {
            System.out.println("is a Fibonacci number");
        } else {
            System.out.println("is not a Fibonacci number");
        }
    }

    public static boolean fibonaccinumber(int number) {
        int first = 0, second = 1, third;
        boolean validated = false;

        do {
            third = first + second;
            first = second;
            second = third;
        } while (third < number);

        if (third == number) {
            validated = true;
        }
        return validated;
    }
}
