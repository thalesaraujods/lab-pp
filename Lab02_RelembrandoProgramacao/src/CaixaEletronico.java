import java.util.Scanner;

public class CaixaEletronico {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int valor = input.nextInt();
        int valorAtualizado = valor;
        if (valor % 2 != 0 || valor < 0){
            System.out.println("Valor Invalido");
            return;
        }

        int notes50 = valor/50;
        valorAtualizado = valorAtualizado - (notes50 *50);

        int notes10 = valorAtualizado/10;
        valorAtualizado = valorAtualizado - (notes10 *10);

        int notes2 = valorAtualizado/2;

        System.out.printf("%d notas de R$50, %d notas de R$10 e %d notas de R$2", notes50, notes10, notes2);
    }
}
