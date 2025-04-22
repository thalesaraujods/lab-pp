import java.util.Scanner;

public class SomaColecoes {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int soma = 0;
        boolean fim = false;

        while (!fim) {
            int num = scan.nextInt();

            if (num == -1) {
                int proximo = scan.nextInt();
                if (proximo == -1) {
                    System.out.println(soma); // imprime a soma
                    fim = true; // acabou
                } else {
                    System.out.println(soma); // imprime a soma
                    soma = proximo; // reinicia a contagem
                }
            } else {
                soma += num;
            }
        }
    }
}