import java.util.Scanner;

public class AsciiArt {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        for (int i = 0; i < n; i++) {
            int asteriscos = n - i;
            int espacos = i * 2;

            for (int e = 0; e < asteriscos; e++) {
                System.out.print("*");
            }

            for (int m = 0; m < espacos; m++) {
                System.out.print(" ");
            }

            for (int d = 0; d < asteriscos; d++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}