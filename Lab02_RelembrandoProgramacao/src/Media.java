import java.util.Scanner;

public class Media {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double num1 = scan.nextDouble();
        double num2 = scan.nextDouble();
        double num3 = scan.nextDouble();

        double soma = num1 + num2 + num3;
        double media = soma / 3;

        System.out.printf("%.2f", media);
    }
}
