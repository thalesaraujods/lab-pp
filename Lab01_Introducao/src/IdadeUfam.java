import java.util.Scanner;

public class IdadeUfam {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int anoFundacao = 1909;
        int anoAtual = scan.nextInt();
        int idade = anoAtual - anoFundacao;
        System.out.printf("A UFAM tem " + idade +  " anos de fundacao");
    }
}
