import java.util.*;

public class TimeFutebol {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<Integer> golsTime = new ArrayList<>();
        List<Integer> golsAdversario = new ArrayList<>();

        int valor;
        while ((valor = sc.nextInt()) != -1) {
            golsTime.add(valor);
        }

        while ((valor = sc.nextInt()) != -1) {
            golsAdversario.add(valor);
        }

        int vitorias = 0, empates = 0, derrotas = 0;

        for (int i = 0; i < golsTime.size(); i++) {
            int t = golsTime.get(i);
            int a = golsAdversario.get(i);

            if (t > a) vitorias++;
            else if (t == a) empates++;
            else derrotas++;
        }

        System.out.println(vitorias + " " + empates + " " + derrotas);
        sc.close();
    }
}