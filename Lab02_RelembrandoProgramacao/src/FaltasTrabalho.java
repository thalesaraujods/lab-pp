import java.util.Scanner;

public class FaltasTrabalho {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int faltas[] = new int[6];
        int total = 0;

        while (true) {
            int dia = scan.nextInt();
            if (dia == -1) break;

            if (dia >= 2 && dia <= 7) {
                faltas[dia - 2]++;
                total++;
            }
        }

        for (int i = 0; i < 6; i++) {
            double percentual = total > 0 ? (faltas[i] * 100.0) / total : 0.0;
            System.out.printf("%.1f", percentual);
            if (i < 5) System.out.print(" ");
        }
    }
}