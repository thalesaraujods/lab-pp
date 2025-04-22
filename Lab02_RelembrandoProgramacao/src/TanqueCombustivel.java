import java.util.Scanner;

public class TanqueCombustivel {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double r = scan.nextDouble();
        double x = scan.nextDouble();
        int opcao = scan.nextInt();

        double pi = Math.PI;

        double volumeEsfera = (4.0 / 3.0) * pi * Math.pow(r, 3);
        double volumeCalota = (pi * Math.pow(x, 2) * ((3 * r) - x)) / 3.0;

        if (opcao == 1) {
            System.out.printf("%.4f", volumeCalota);
        } else if (opcao == 2) {
            double volumeCombustivel = volumeEsfera - volumeCalota;
            System.out.printf("%.4f", volumeCombustivel);
        }
    }
}