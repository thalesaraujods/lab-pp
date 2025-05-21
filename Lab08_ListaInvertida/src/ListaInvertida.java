import java.util.Hashtable;
import java.util.LinkedList;

public class ListaInvertida {
    private Hashtable<String, LinkedList<String>> tabela;

    public ListaInvertida() {
        tabela = new Hashtable<>();
    }

    public boolean insere(String palavra, String documento) {
        LinkedList<String> listaDocumentos = tabela.get(palavra);

        // palavra encontrada
        if (listaDocumentos != null) {
            // documento já existe na lista?
            if (listaDocumentos.contains(documento)) {
                // Se sim retorna false
                return false;
            } else {
                // Se não retorna true e adiciona ele na lista
                listaDocumentos.add(documento);
                return true;
            }
        } else {
            // Palavra não encontrada
            listaDocumentos = new LinkedList<>();
            listaDocumentos.add(documento);
            tabela.put(palavra, listaDocumentos);
            return true;
        }
    }

    public LinkedList<String> busca(String palavra) {
        return tabela.get(palavra);
    }

    @Override
    public String toString() {
        return tabela.toString();
    }
}
