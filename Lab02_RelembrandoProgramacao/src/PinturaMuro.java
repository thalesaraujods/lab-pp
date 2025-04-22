import java.util.Scanner;

public class PinturaMuro {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int area_muro = 36;
        int material_pintura = 100;

        double pintor = scan.nextDouble();
        double custo_pintor = pintor * area_muro;
        double custo_total = material_pintura + custo_pintor;

        System.out.printf("%.1f", custo_total);
    }
}
