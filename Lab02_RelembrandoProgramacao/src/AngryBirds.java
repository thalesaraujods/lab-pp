import java.util.Scanner;

public class AngryBirds {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double v = scan.nextDouble();
        double angulo = scan.nextDouble();
        double distancia = scan.nextDouble();

        double g = 9.8;

        double anguloRad = Math.toRadians(angulo);
        double alcance = (Math.pow(v, 2) * Math.sin(2 * anguloRad)) / g;

        if (Math.abs(alcance - distancia) <= 1.0) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
    }
}