import java.util.Scanner;

public class PontoReta {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double x = scan.nextDouble();
        double y = scan.nextDouble();

        if ((x*2) + y == 3){
            System.out.printf("Ponto (%.1f, %.1f) pertence a reta 2x + y = 3.", x, y);
        } else {
            System.out.printf("Ponto (%.1f, %.1f) nao pertence a reta 2x + y = 3.", x, y);
        }
    }
}
