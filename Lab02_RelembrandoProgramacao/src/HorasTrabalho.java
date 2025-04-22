import java.util.Scanner;

public class HorasTrabalho {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int horas[] = new int[7];
        int index = 0;
        int total = 0;

        while (true) {
            int valor = scan.nextInt();
            if (valor == -1) break;

            total += valor;
            index++;

            if (index == 7) {
                System.out.println(total);
                total = 0;
                index = 0;
            }
        }
    }
}