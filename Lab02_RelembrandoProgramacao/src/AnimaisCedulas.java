import java.util.Scanner;

public class AnimaisCedulas {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        int cedula = sc.nextInt();
        switch (cedula) {
            case 2:
                System.out.print("Tartaruga");
                break;
            case 5:
                System.out.print("Garça");
                break;
            case 10:
                System.out.print("Arara");
                break;
            case 20:
                System.out.print("Mico-leão-dourado");
                break;
            case 50:
                System.out.print("Onça-pintada");
                break;
            case 100:
                System.out.print("Garoupa");
                break;
            default:
                System.out.println("erro");
        }
    }
}
