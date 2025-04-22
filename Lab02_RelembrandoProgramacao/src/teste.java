import java.util.Scanner;

public class teste {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        int vector[] = new int[50];
        int number = sc.nextInt();
        int count = 0;

        while (number != -1) {
            vector[count] = number;
            count++;
            number = sc.nextInt();
        }

        System.out.printf("number of numbers %d", count);
        System.out.println();
        System.out.printf("number of numbers %d", vector.length);

    }
}
