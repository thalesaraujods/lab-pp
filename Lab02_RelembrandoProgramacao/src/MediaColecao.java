import java.util.Scanner;

public class MediaColecao {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int soma = 0;
        int quantidade = 0;
        int numero;

        numero = scan.nextInt();
        while (numero != -1) {
            soma += numero;
            quantidade++;
            numero = scan.nextInt();
        }

        if (quantidade > 0) {
            double media = (double) soma / quantidade;
            System.out.printf("%.2f\n", media);
        }
    }
}