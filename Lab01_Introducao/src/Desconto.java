import java.util.Scanner;

public class Desconto {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double valorCompra = scan.nextDouble();
        double valorDesconto = valorCompra * 0.05;
        double valorCompraDesconto = valorCompra - valorDesconto;
        if (valorCompra >= 200){
            System.out.printf("%.2f", valorCompraDesconto);
        } else {
            System.out.printf("%.2f", valorCompra);
        }
    }
}
