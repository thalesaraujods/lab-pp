import java.util.Scanner;

public class Xadrez {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int quantidade = scan.nextInt();
        for (int i = 0; i < quantidade; i++) {
            if (quantidade == 0) {
                break;
            }
            if (i % 2 == 0) {
                for (int j = 0; j < quantidade; j++) {
                    System.out.print("* ");
                }
            }
            if (i % 2 != 0) {
                for (int j = 0; j < quantidade; j++) {
                    System.out.print(" *");
                }
            }
            System.out.println();
        }
    }
}
