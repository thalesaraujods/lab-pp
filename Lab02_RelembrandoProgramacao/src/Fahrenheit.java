import java.util.Scanner;

public class Fahrenheit {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double celsius = input.nextDouble();
        double conversao = (celsius * 9/5) + 32;
        System.out.printf("%.1f", conversao);
    }
}
