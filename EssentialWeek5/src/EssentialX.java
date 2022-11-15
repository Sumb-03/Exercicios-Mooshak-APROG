import java.net.SocketOption;
import java.util.Scanner;

public class EssentialX {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int code;
        code = sc.nextInt();

        switch (code) {
            case 1:
                System.out.println("Tag Heuer");
                break;
            case 2:
                System.out.println("Rolex");
                break;
            case 3:
                System.out.println("Omega");
                break;
            case 4:
                System.out.println("Cartier");
                break;
            case 5:
                System.out.println("Bvlgari");
                break;
            case 6:
                System.out.println("Raymond Weil");
                break;
            default:
                System.out.println("Invalid brand");
        }
    }
}
