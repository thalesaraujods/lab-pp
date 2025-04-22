import java.util.Scanner;

public class AreaTriangulo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double lado1 = sc.nextDouble();
        double lado2 = sc.nextDouble();
        double lado3 = sc.nextDouble();

        if ((lado1 + lado2 > lado3) && (lado2 + lado3 > lado1) && (lado3 + lado1 > lado2)) {
            double s = (lado1 + lado2 + lado3)/2;
            double areaTriangulo = Math.sqrt(s * (s - lado1) * (s - lado2) * (s - lado3));
            System.out.printf("%.2f", areaTriangulo);
        } else {
            System.out.print("Triangulo invalido");
        }
    }
}
