import java.util.Scanner;

public class ModularizationH {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number, countTry = 1;
        boolean validation;
        number = sc.nextInt();
        validation = palindromeValidation(number);

        while (!validation && countTry < 5) {
            countTry++;
            number = sc.nextInt();
            validation = palindromeValidation(number);
        }

        if (validation) {
            System.out.println("palindrome");
        } else {
            System.out.println("attempts exceeded");
        }
    }

    public static boolean palindromeValidation(int number) {
        int digit, sum = 0, numbercopy;
        boolean palindrome = false;
        numbercopy = number;

        do {
            digit = number % 10;
            number = number / 10;
            sum = sum * 10 + digit;
        } while (number != 0);

        if (numbercopy == sum) {
            palindrome = true;
        }
        return palindrome;
    }
}
