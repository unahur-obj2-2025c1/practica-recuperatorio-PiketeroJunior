package ar.edu.unahur.obj2.integrador.observer;

public class PeliculaDTO {
    private final String nombre;
    private final String genero;
    
    public PeliculaDTO(String nombre, String genero) {
        this.nombre = nombre;
        this.genero = genero;
    }

    public String getNombre() {
        return nombre;
    }
    
    public String getGenero() {
        return genero;
    }

    
}
