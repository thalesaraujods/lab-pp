import java.util.Scanner;

public class ParImpar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int num_aux = scan.nextInt();
        while (num_aux != -1){
            if (num_aux % 2 == 0){
                System.out.println("PAR");
            } else {
                System.out.println("IMPAR");
            }
            num_aux = scan.nextInt();
        }
    }
}
