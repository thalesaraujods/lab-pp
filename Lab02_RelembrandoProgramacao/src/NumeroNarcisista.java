import java.util.Scanner;

public class NumeroNarcisista {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numero = scan.nextInt();
        int original = numero;
        int quantidade = String.valueOf(numero).length();
        int soma = 0;

        while (numero > 0) {
            int digito = numero % 10;
            soma += Math.pow(digito, quantidade);
            numero /= 10;
        }

        if (soma == original) {
            System.out.println("SIM");
        } else {
            System.out.println("NAO");
        }
    }
}
