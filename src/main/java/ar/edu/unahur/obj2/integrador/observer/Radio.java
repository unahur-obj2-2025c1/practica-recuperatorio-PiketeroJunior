package ar.edu.unahur.obj2.integrador.observer;

import java.util.HashSet;
import java.util.Set;

public class Radio implements Observador{

    Set<PeliculaDTO> tandaPeliculas = new HashSet<>();

    @Override
    public void actualizar(PeliculaDTO peliculaDTO) {
        tandaPeliculas.add(peliculaDTO);
    }
    
}
