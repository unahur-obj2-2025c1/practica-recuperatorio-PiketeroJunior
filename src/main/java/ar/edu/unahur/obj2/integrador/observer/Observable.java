package ar.edu.unahur.obj2.integrador.observer;

public interface Observable {
    void agregar(Observador observador);
    void quitar(Observador observador);
    void notificar(PeliculaDTO peliculaDTO);
}
