import java.util.Scanner;

public class ModularizationG {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number;
        number = sc.nextInt();

        for (int i = 0; i <= number; i++) {
            if (armstrongNumber(i)) {
                System.out.println(i);
            }
        }

    }

    public static boolean armstrongNumber(int number) {
        int numbercopy, armstrong = 0, digit, countDigit = 0;
        boolean validated = false;
        numbercopy = number;

        do {
            number = number / 10;
            countDigit++;
        } while (number != 0);

        number = numbercopy;
        for (int i = 1; i <= countDigit; i++) {
            digit = number % 10;
            number = number / 10;
            armstrong += Math.pow(digit, countDigit);
        }
        if (armstrong == numbercopy) {
            validated = true;
        }
        return validated;
    }
}
