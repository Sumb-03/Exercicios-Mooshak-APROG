import java.util.Scanner;

public class ArraysG {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int[] sequence;
        int n;

        n = sc.nextInt();
        sequence = makeSequence(n);
        showInvertedSequence(sequence);
    }

    public static int[] makeSequence(int n) {
        int[] sequence = new int[n];

        for (int i = 0; i < n; i++) {
            sequence[i] = sc.nextInt();
        }
        return sequence;
    }

    public static void showInvertedSequence(int[] sequence) {
        for (int i = (sequence.length - 1); i >= 0; i--) {
            System.out.println(sequence[i]);
        }
    }
}
