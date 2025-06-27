package ar.edu.unahur.obj2.integrador;

import java.util.HashSet;
import java.util.Set;

import ar.edu.unahur.obj2.integrador.observer.Observable;
import ar.edu.unahur.obj2.integrador.observer.Observador;
import ar.edu.unahur.obj2.integrador.observer.PeliculaDTO;

public class Plataforma implements Observable {
    Set<Pelicula> peliculas = new HashSet<>();
    Set<Usuario> usuarios = new HashSet<>();
    Set<Observador> observadores = new HashSet<>();

    void agregarPelicula(Pelicula pelicula){
        peliculas.add(pelicula);
    }

    void agregarUsuario(Usuario usuario){
        usuarios.add(usuario);
    }

    void sugerir(){
        peliculas.stream()
        .forEach(pelicula -> sugerirUnaPelicula(pelicula));
    }

    void sugerirUnaPelicula(Pelicula pelicula){
        usuarios.stream()
        .filter(u -> u.aceptaSugerencia(pelicula))
        .forEach(u -> u.aceptaSugerencia(pelicula));
    }

    @Override
    public void agregar(Observador observador) {
        observadores.add(observador);
    }

    @Override
    public void quitar(Observador observador) {
        observadores.remove(observador);
    }

    @Override
    public void notificar(PeliculaDTO peliculaDTO) {
        observadores.forEach(
            o -> o.actualizar(peliculaDTO));
    }
}
