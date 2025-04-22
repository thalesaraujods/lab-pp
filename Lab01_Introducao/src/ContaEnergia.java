import java.util.Scanner;

public class ContaEnergia {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int consumoEnergia = scan.nextInt();
        char tipoResidencia = scan.next().charAt(0);
        double pagamento = 0.00;
        int erro = -1;


        if (consumoEnergia < 0) {
            System.out.printf("%d", erro);
            return;
        }

        switch (tipoResidencia) {
            case 'R':
                if (consumoEnergia <= 500) {
                    double preco = 0.4;
                    pagamento = consumoEnergia * preco;
                } else {
                    double preco = 0.65;
                    pagamento = consumoEnergia * preco;
                }
                break;
            case 'C':
                if (consumoEnergia <= 1000) {
                    double preco = 0.55;
                    pagamento = consumoEnergia * preco;
                } else {
                    double preco = 0.6;
                    pagamento = consumoEnergia * preco;
                }
                break;
            case 'I':
                if (consumoEnergia <= 5000) {
                    double preco = 0.55;
                    pagamento = consumoEnergia * preco;
                } else {
                    double preco = 0.60;
                    pagamento = consumoEnergia * preco;
                }
                break;
            default:
                System.out.printf("%d", erro);
                return;
        }
        System.out.printf("%.2f \n", pagamento);
        //System.out.println(consumoEnergia);
        //System.out.println(tipoResidencia);
    }
}
