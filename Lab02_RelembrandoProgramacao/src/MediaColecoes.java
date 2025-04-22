import java.util.Scanner;

public class MediaColecoes {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int soma = 0;
        int contador = 0;
        boolean fim = false;

        while (!fim) {
            int num = scan.nextInt();
            if (num == -1) {
                int proximo = scan.nextInt();
                if (proximo == -1) {
                    if (contador > 0) {
                        double media = (double) soma / contador;
                        System.out.printf("%.2f\n", media);
                    }
                    fim = true;
                } else {
                    if (contador > 0) {
                        double media = (double) soma / contador;
                        System.out.printf("%.2f\n", media);
                    }
                    soma = proximo;
                    contador = 1;
                }
            } else {
                soma += num;
                contador++;
            }
        }
    }
}