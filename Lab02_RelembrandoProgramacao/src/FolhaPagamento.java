import java.util.Scanner;

public class FolhaPagamento {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double valorHora = input.nextDouble();
        int horasTrabalhadas = input.nextInt();

        double salarioBruto = valorHora * horasTrabalhadas;
        System.out.printf("Salario bruto: R$%.2f", salarioBruto);
        System.out.println();

        double impostoRenda = salarioBruto*0.11;
        System.out.printf("IR: R$%.2f", impostoRenda);
        System.out.println();

        double inss = salarioBruto*0.08;
        System.out.printf("INSS: R$%.2f", inss);
        System.out.println();

        double totalDescontos = impostoRenda + inss;
        System.out.printf("Total de descontos: R$%.2f", totalDescontos);
        System.out.println();

        double salarioLiquido = salarioBruto - totalDescontos;
        System.out.printf("Salario liquido: R$%.2f", salarioLiquido);


    }
}
