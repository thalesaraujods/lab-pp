import java.util.LinkedList;

public class GoogleMain {
    public static void main(String [] args){
        ListaInvertida lista = new ListaInvertida();

        // Resultado positivo
        lista.insere("force", "document1.txt");
        lista.insere("force", "document2.txt");
        lista.insere("force", "document3.txt");

        // Resultado negativo
        lista.insere("force", "document1.txt");

        // Nova palavra
        lista.insere("always", "document1.txt");

        System.out.println(lista.toString());
        System.out.println(lista.insere("force", "document1.txt"));

        LinkedList<String> teste1 = lista.busca("force");
        System.out.println(teste1.toString());

    }
}
