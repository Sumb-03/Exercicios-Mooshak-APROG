import java.util.Scanner;

public class ModularizationC {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a, b, c;
        a = sc.nextDouble();
        b = sc.nextDouble();
        c = sc.nextDouble();

        if (a + b > c && a + c > b && b + c > a && a > 0 && b > 0 && c > 0) {
            System.out.printf("a=%.2f%n", a);
            System.out.printf("b=%.2f%n", b);
            System.out.printf("c=%.2f%n", c);
            System.out.printf("ang(a,b)=%.2f%n", angulotriangulo(a, b, c));
            System.out.printf("ang(a,c)=%.2f%n", angulotriangulo(a, c, b));
            System.out.printf("ang(b,c)=%.2f%n", angulotriangulo(b, c, a));
        } else {
            System.out.println("impossible");
        }

    }

    public static double angulotriangulo(double l1, double l2, double l3) {
        double ang;
        ang = Math.acos((Math.pow(l1, 2) + Math.pow(l2, 2) - Math.pow(l3, 2)) / (2 * l1 * l2));
        return (ang * (180 / Math.PI));
    }
}

