import java.util.Scanner;

public class ModularizationF {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double radius, height;
        String solid;
        solid = sc.nextLine();

        while(!solid.equals("end")){

            switch(solid){
                case "sphere":
                    radius = sc.nextDouble();
                    System.out.printf("%.2f%n", volumesphere(radius));
                    break;
                case "cylinder":
                    radius = sc.nextDouble();
                    height = sc.nextDouble();
                    System.out.printf("%.2f%n", volumecylinder(radius, height));
                    break;
                case "cone":
                    radius = sc.nextDouble();
                    height = sc.nextDouble();
                    System.out.printf("%.2f%n", volumecone(radius, height));
                    break;
            }
            sc.nextLine();
            solid = sc.nextLine();
        }
    }

    public static double volumesphere(double r) {
        double volume;
        volume = 4.0/3 * Math.PI * Math.pow(r, 3);
        return volume;
    }

    public static double volumecylinder(double r, double h){
        double volume;
        volume = Math.PI * Math.pow(r, 2) * h;
        return volume;
    }

    public static double volumecone(double r, double h){
        double volume;
        volume = 1.0/3 * Math.PI * Math.pow(r, 2) * h;
        return volume;
    }

}
