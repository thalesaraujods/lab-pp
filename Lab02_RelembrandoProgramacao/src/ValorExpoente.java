import java.util.Scanner;

public class ValorExpoente {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int limite = scan.nextInt();
        int n = 1;
        int soma = 0;

        while (soma <= limite) {
            soma += Math.pow(2, n);
            n++;
        }

        System.out.println(n-1);
    }
}