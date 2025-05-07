package br.edu.ufam.icomp.lab_excecoes;

public class RoverCoordenadaException extends RoverException{

    public RoverCoordenadaException(){
        super("Exceção geral de coordenada do rover");
    }

    public RoverCoordenadaException(String message){
        super(message);
    }
}
