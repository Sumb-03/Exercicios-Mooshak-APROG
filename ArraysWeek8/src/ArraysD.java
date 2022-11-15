import java.util.Scanner;

public class ArraysD {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int[] studentGrades;
        int[] generalGrade = new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
        int n;

        n = sc.nextInt();
        studentGrades = readAndStoreGrades(n);
        showFrenquencyGrades(generalGrade, studentGrades);
    }

    public static int[] readAndStoreGrades(int arraySize) {
        int[] studentGrades = new int[arraySize];
        int numero;

        for (int i = 0; i < arraySize; i++) {
            numero = sc.nextInt();
            studentGrades[i] = numero;
        }
        return studentGrades;
    }
    public static int determineFrequency(int[] studentGrades, int number){
        int frequency = 0;

        for (int i = 0; i < studentGrades.length; i++) {
            if (studentGrades[i] == number){
                frequency++;
            }
        }
        return frequency;

    }
    public static void showFrenquencyGrades(int[] gradesArray, int[] studentGrades){
        for (int i = 0; i < gradesArray.length; i++) {
            System.out.printf("%d %d%n", gradesArray[i], determineFrequency(studentGrades, i));
        }
    }
}
