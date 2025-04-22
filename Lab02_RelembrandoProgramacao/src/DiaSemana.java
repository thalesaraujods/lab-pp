import java.util.Scanner;

public class DiaSemana {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] somaDias = new int[7];
        int index = 0;

        while (true) {
            int valor = scan.nextInt();
            if (valor == -1) break;

            somaDias[index % 7] += valor;
            index++;
        }

        int max = 0;
        for (int i = 0; i < 7; i++) {
            if (somaDias[i] > max) {
                max = somaDias[i];
            }
        }

        for (int i = 0; i < 7; i++) {
            if (somaDias[i] == max) {
                System.out.println(i + 1);
            }
        }
    }
}