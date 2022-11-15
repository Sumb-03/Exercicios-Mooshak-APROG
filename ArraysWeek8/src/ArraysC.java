import java.util.Scanner;

public class ArraysC {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int[] numberSequence;
        int number;

        number = sc.nextInt();
        numberSequence = makeArray(number);
        System.out.println("always ascending = " + checkIfArrayAscending(numberSequence));
    }

    public static int[] makeArray(int number){
        int[] array = new int[number];
        int numberAddArray;

        for (int i = 0; i < number; i++) {
            numberAddArray = sc.nextInt();
            array[i] = numberAddArray;
        }
        return array;
    }

    public static boolean checkIfArrayAscending(int[] array){
        int previousNumber = array[0];
        boolean alwaysAscendingVerification = true;

        for (int i = 1; i < array.length && alwaysAscendingVerification; i++) {
            if (array[i] <= previousNumber){
                alwaysAscendingVerification = false;
            }
            previousNumber = array[i];
        }
        return alwaysAscendingVerification;
    }
}
