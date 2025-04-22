import java.util.Scanner;

public class PorcentagemAcerto {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int contadorA = 0;
        int contadorB = 0;
        int numerosCorretos = 0;

        int vetorA [] = new int[50];
        int vetorB [] = new int[50];

        vetorA[contadorA] = scan.nextInt();
        int newValue = scan.nextInt();
        while (newValue != -1){
            contadorA++;
            vetorA[contadorA] = newValue;
            newValue = scan.nextInt();
        }

        vetorB[contadorB] = scan.nextInt();
        newValue = scan.nextInt();
        while (newValue != -1){
            contadorB++;
            vetorB[contadorB] = newValue;
            newValue = scan.nextInt();
        }

        for (int i=0; i<=contadorA; i++){
            if (vetorA[i] == vetorB[i]){
                numerosCorretos++;
            }
        }

        contadorA++;
        double porcentagem = numerosCorretos/(double)contadorA;
        porcentagem = porcentagem * 100;
        System.out.printf("%.2f \n", porcentagem);
        //System.out.printf("%d \n", numerosCorretos);
        //System.out.printf("%d \n", contadorA);






    }
}
