import java.util.Scanner;

public class AreaVolume {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double raio = scan.nextDouble();

        double pi = Math.PI;
        double area = pi * Math.pow(raio, 2);
        double volume = (4.0 / 3.0) * pi * Math.pow(raio, 3);

        System.out.printf("Um circulo com raio de %.2f centimetros tem uma area de %.2f centimetros quadrados.\n", raio, area);
        System.out.printf("Uma esfera com raio de %.2f centimetros tem um volume de %.2f centimetros cubicos.\n", raio, volume);
    }
}