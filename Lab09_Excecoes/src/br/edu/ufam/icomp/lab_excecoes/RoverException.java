package br.edu.ufam.icomp.lab_excecoes;

public class RoverException extends Exception {
    public RoverException(){
        super("Exceção geral do rover");
    }

    public RoverException(String mensagem){
        super(mensagem);
    }
}
