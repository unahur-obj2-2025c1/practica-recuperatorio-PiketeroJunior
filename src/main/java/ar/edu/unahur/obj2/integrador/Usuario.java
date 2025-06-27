package ar.edu.unahur.obj2.integrador;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import ar.edu.unahur.obj2.integrador.excepciones.SugerenciaNoEncontradaException;
import ar.edu.unahur.obj2.integrador.perfiles.Perfilable;

public class Usuario {
    private final String email;
    private Perfilable perfilCinefilo;
    Set<Pelicula> sugerenciasAceptadas = new HashSet<>();
    Set<Pelicula> peliculasVistas = new HashSet<>();
    private String idiomaConfigurado;
    
    public Usuario(String email, Perfilable perfilCinefilo, String idiomaConfigurado) {
        this.email = email;
        this.perfilCinefilo = perfilCinefilo;
        this.idiomaConfigurado = idiomaConfigurado;
    }

    public String getEmail() {
        return email;
    }
    
    public Perfilable getPerfilCinefilo() {
        return perfilCinefilo;
    }
    
    public Set<Pelicula> getSugerenciasAceptadas() {
        return sugerenciasAceptadas;
    }
    
    public Set<Pelicula> getPeliculasVistas() {
        return peliculasVistas;
    }
    
    public String getIdiomaConfigurado() {
        return idiomaConfigurado;
    }

    public void setPerfilCinefilo(Perfilable perfilCinefilo) {
        this.perfilCinefilo = perfilCinefilo;
    }

    public void setIdiomaConfigurado(String idiomaConfigurado) {
        this.idiomaConfigurado = idiomaConfigurado;
    }

    public void verPeliculaAlAzar() throws SugerenciaNoEncontradaException{
        peliculasVistas.add(
            sugerenciasAceptadas.stream()
                .findAny()
                .orElseThrow(
                    () -> new SugerenciaNoEncontradaException("No tenes sugeridas aún")));        
    }
}
