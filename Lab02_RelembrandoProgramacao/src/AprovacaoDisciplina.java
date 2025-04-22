import java.util.*;

public class AprovacaoDisciplina {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<Double> notas = new ArrayList<>();
        List<Integer> presencas = new ArrayList<>();

        while (true) {
            double n = sc.nextDouble();
            if (n == -1) break;
            notas.add(n);
        }

        while (true) {
            int p = sc.nextInt();
            if (p == -1) break;
            presencas.add(p);
        }

        int cargaHoraria = sc.nextInt();
        int minimoPresenca = (int) Math.ceil(cargaHoraria * 0.75);

        int aprovados = 0, reprovadosNota = 0, reprovadosFrequencia = 0;

        for (int i = 0; i < notas.size(); i++) {
            double nota = notas.get(i);
            int presenca = presencas.get(i);

            if (presenca < minimoPresenca) {
                reprovadosFrequencia++;
            } else if (nota >= 5.0) {
                aprovados++;
            } else {
                reprovadosNota++;
            }
        }

        System.out.printf("%d %d %d\n", aprovados, reprovadosNota, reprovadosFrequencia);
    }
}