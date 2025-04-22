import java.util.Scanner;

public class ArteAscii {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int N_aux = N;
        while ( N_aux > 0) {
            for (int i = N_aux; i > 0; i--) {
                System.out.print("*");
            }
            N_aux = N_aux - 1;
            System.out.println();
        }

        N_aux = 1;
        while ( N_aux <= N) {
            for (int i = 1; i <= N_aux; i++) {
                System.out.print("*");
            }
            N_aux = N_aux + 1;
            System.out.println();
        }
    }
}
